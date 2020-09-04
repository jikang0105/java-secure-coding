package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * singleton design pattern 적용 : 시스템에서 단 한번 객체를 생성하고 공유해서 사용하고자 
 * 									  할 때 적용하는 패턴 
 */
public class MemberDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String userpass="tiger";
	private static MemberDAO instance=new MemberDAO();
	private MemberDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static MemberDAO getInstance() {
		return instance;
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt, con);
	}
	public MemberVO findMemberById(String id) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberVO vo=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select name,address from web_member where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new MemberVO(id,null,rs.getString(1),rs.getString(2));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	public MemberVO login(MemberVO memberVO) throws SQLException {
		MemberVO mvo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select name,address from web_member where id=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, memberVO.getId());
			pstmt.setString(2, memberVO.getPassword());
			rs=pstmt.executeQuery();
			if(rs.next())
				mvo=new MemberVO(
						memberVO.getId(),memberVO.getPassword(),rs.getString(1),rs.getString(2));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return mvo;
	}
	public void updateMember(MemberVO memberVO) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;	
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="update web_member set password=?,name=?,address=? where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,memberVO.getPassword());
			pstmt.setString(2, memberVO.getName());
			pstmt.setString(3, memberVO.getAddress());
			pstmt.setString(4, memberVO.getId());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, con);
		}
	}
	public void registerMember(MemberVO memberVO) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql=
					"insert into web_member(id,password,name,address) values(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, memberVO.getId());
			pstmt.setString(2, memberVO.getPassword());
			pstmt.setString(3, memberVO.getName());
			pstmt.setString(4, memberVO.getAddress());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, con);
		}
	}
	public boolean idcheck(String id) throws SQLException {
		boolean flag=false;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select count(*) from web_member where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()&&rs.getInt(1)>0)
				flag=true;
		}finally {
			closeAll(rs, pstmt, con);
		}
		return flag;
	}
}















































