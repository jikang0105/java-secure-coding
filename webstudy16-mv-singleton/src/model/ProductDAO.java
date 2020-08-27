package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Singleton Design Pattern 적용
 * 1. private 생성자
 * 2. private static 변수에 자신의 객체를 생성한다
 * 3. public static method(getInstance())로 공유한다.
 */
public class ProductDAO {
	private static ProductDAO instance = new ProductDAO();
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String userpass = "tiger";
	
	private ProductDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static ProductDAO getInstance() {
		return instance;
	}
	
	public int getProductTotalCount() throws SQLException {
		int count = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "SELECT COUNT(*) FROM web_product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		return count;
	}
	
	public ProductVO findProductById(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ProductVO vo = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "SELECT name, maker, price FROM web_product WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String name = rs.getString(1);
				String maker = rs.getString(2);
				String price = rs.getString(3);
				vo = new ProductVO(id, name, maker, price);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				closeAll(rs, pstmt, con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return vo;
	}
	
	public ArrayList<ProductVO> selectProductList() {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
//		ProductVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "SELECT id, name, maker, price FROM web_product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
//				String id = rs.getString(1);
//				String name = rs.getString(2);
//				String maker = rs.getString(3);
//				String price = rs.getString(4);
//				list.add(new ProductVO(id, name, maker, price));
				ProductVO vo = new ProductVO();
				vo.setId(rs.getString(1));
				vo.setName(rs.getNString(2));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				closeAll(rs, pstmt, con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
