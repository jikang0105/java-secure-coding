package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String userpass="tiger";
	// singleton pattern 적용
	private static MemberDAO instance = new MemberDAO();
	private MemberDAO() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.getStackTrace();
		}
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
		closeAll(pstmt, con);
	}
	public MemberVO findMemberById(String id) throws SQLException {
		MemberVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "SELECT name, address FROM web_member WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString(1);
				String address = rs.getString(2);
				vo = new MemberVO(id, null, name, address);
			}
			return vo;
		} finally {
			closeAll(rs, pstmt, con);
		}
	}
	public MemberVO login(String id, String pass) throws SQLException {
		MemberVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "SELECT name, address FROM web_member WHERE id = ? AND password = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString(1);
				String address = rs.getString(2);
				vo = new MemberVO(id, null, name, address);
			}
			return vo;
		} finally {
			closeAll(rs, pstmt, con);
		}
	}
}
