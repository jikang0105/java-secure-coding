package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// DAO : Data Access Object
public class GuestBookDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";
	public GuestBookDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}
	
	public void register(GuestBookDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, dto.getTitle());
			pstmt.setNString(2, dto.getContent());
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
		
	}
	
	public ArrayList<GuestBookDTO> getAllGuestBookListOrederByNoDesc() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<GuestBookDTO> list = new ArrayList<GuestBookDTO>();
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "SELECT * FROM guestbook ORDER BY guestbook_no DESC";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				GuestBookDTO dto = new GuestBookDTO();
				dto.setGuestBookNo(rs.getInt(1));
				dto.setTitle(rs.getString(2));
				dto.setContent(rs.getString(3));
				list.add(dto);
			}
			
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs != null) {
			rs.close();
		}
		this.closeAll(pstmt, con);
	}
	
	public int getCurrentSequence() throws SQLException {
		int seq = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "SELECT guestbook_seq.currval FROM dual";
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				seq = rs.getInt(1);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return seq;
	}


	public void register2(GuestBookDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int seq = 0;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, dto.getTitle());
			pstmt.setNString(2, dto.getContent());
			pstmt.executeUpdate();
			pstmt.close();
			
			// 시퀀스의 currval 현재값은 nextval 한 커넥션 내에서만 사용이 가능하
			String sql2 = "SELECT guestbook_seq.currval FROM dual";
			pstmt = con.prepareStatement(sql2);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				seq = rs.getInt(1);
				dto.setGuestBookNo(seq);
			}
		} finally {
			closeAll(pstmt, con);
		}
		
	}
}
