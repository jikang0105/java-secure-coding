package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	private DataSource dataSource;
	private MemberDAO() {
		this.dataSource = DataSourceManager.getInstance().getDataSource();
	}
	public static MemberDAO getInstance() {
		return instance;
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
	public MemberDTO findMemberById(String id) throws SQLException {
		MemberDTO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT name, address FROM web_member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberDTO(id, null, rs.getString(1), rs.getString(2));
			}
			return vo;
		} finally {
			closeAll(rs, pstmt, con);
		}		
	}
	public ArrayList<String> getAddressKind() throws SQLException{
		ArrayList<String> list = new ArrayList<String>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT distinct(address) FROM web_member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}		
		return list;
	}
	public int getMemberTotalCount() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT COUNT(*) FROM web_member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return count;
	}
	public ArrayList<MemberDTO> findMemberListByAddress(String address) throws SQLException {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT id, name FROM web_member WHERE address=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new MemberDTO(rs.getString(1), null, rs.getString(2), address));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public MemberDTO login(MemberDTO memberVO) throws SQLException {
		MemberDTO mvo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT id, password, name, address FROM web_member WHERE id=? AND password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberVO.getId());
			pstmt.setString(2, memberVO.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mvo = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return mvo;
	}
	public void register(MemberDTO memberVO) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String sql = "INSERT INTO web_member( id, password, name, address ) VALUES( ?, ?, ?, ? )";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberVO.getId());
			pstmt.setString(2, memberVO.getPassword());
			pstmt.setString(3, memberVO.getName());
			pstmt.setString(4, memberVO.getAddress());
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
	}
	public void updateMember(MemberDTO memberVO) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String sql = "UPDATE web_member SET password=?, name=?, address=? Where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberVO.getPassword());
			pstmt.setString(2, memberVO.getName());
			pstmt.setString(3, memberVO.getAddress());
			pstmt.setString(4, memberVO.getId());
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
		
	}
}
