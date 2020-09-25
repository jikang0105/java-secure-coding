package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();
	private DataSource dataSource;
	private BoardDAO() {
		this.dataSource = DataSourceManager.getInstance().getDataSource();
	}
	public static BoardDAO getInstance() {
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
	public ArrayList<PostVO> getAllPostList() throws SQLException{
		ArrayList<PostVO> list = new ArrayList<PostVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT m.id, m.name, b.no, b.title, b.count, to_char(time_posted, 'YYYY.MM.DD') ");
			sql.append("FROM board_member m, board b ");
			sql.append("WHERE m.id=b.id");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				MemberVO memberVO = new MemberVO(id, null, name);
				String pno = rs.getString(3);
				String ptitle = rs.getString(4);
				int pcount = rs.getInt(5);
				String time_posted = rs.getString(6);
				PostVO postVO = new PostVO(pno, ptitle, null, pcount, time_posted, memberVO);
				list.add(postVO);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}		
		return list;
	}
	public PostVO getPostDetail(String no) throws SQLException{
		PostVO postVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT m.id, m.name, b.no, b.title, b.content, b.count, b.time_posted ");
			sql.append("FROM board_member m, board b ");
			sql.append("WHERE m.id=b.id AND no=?");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				MemberVO memberVO = new MemberVO(id, null, name);
				String pno = rs.getString(3);
				String ptitle = rs.getString(4);
				String pcontent = rs.getString(5);
				int pcount = rs.getInt(6);
				String time_posted = rs.getString(7);
				postVO = new PostVO(pno, ptitle, pcontent, pcount, time_posted, memberVO);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}		
		return postVO;
	}
	public void writePost(String ptitle, String pcontent, String memberId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String sql = "INSERT INTO board (no, title, content, time_posted, id) VALUES(board_seq.nextval, ?, ?, sysdate, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ptitle);
			pstmt.setString(2, pcontent);
			pstmt.setString(3, memberId);
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
	}
	public void updatePost(String postNumber, String ptitle, String pcontent) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			System.out.println(postNumber + ptitle + pcontent);
			String sql = "UPDATE board SET title=?, content=? WHERE no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ptitle);
			pstmt.setString(2, pcontent);
			pstmt.setString(3, postNumber);
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
	}
	
}
