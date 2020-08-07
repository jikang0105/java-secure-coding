package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * 	DAO : Data Access Object
 * 데이터베이스 연동로직을 가지고 있는 객체
 */
public class MemberDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	MemberVO vo = null;

	public MemberDAO() throws ClassNotFoundException { //throws로 예외처리를 위임한다.
		Class.forName(driver);
	}
	
	public MemberVO findMemberById(String id) throws SQLException {
		try {
		con = DriverManager.getConnection(dbUrl, user, pass);
		String sql = "SELECT id, password, name, address FROM member WHERE id = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			String rsid = rs.getNString(1);
			String password = rs.getNString(2);
			String name = rs.getNString(3);
			String address = rs.getNString(4);
			vo = new MemberVO(rsid, password, name, address);
		} 
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	
	public ArrayList<MemberVO> getAllMemberList() throws SQLException{
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "SELECT id, password, name, address FROM member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new MemberVO(rs.getNString(1), rs.getNString(2), rs.getNString(3), rs.getNString(4)));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}
}
