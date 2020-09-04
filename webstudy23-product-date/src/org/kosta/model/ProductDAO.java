package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String userpass="tiger";
	private static ProductDAO instance = new ProductDAO();
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
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, userpass);
	}
	public void registProduct(ProductVO pvo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			String sql = "INSERT INTO mvc_product(id, name, maker, price, regdate) VALUES(mvc_product_seq.nextval, ?, ?, ?, sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pvo.getName());
			pstmt.setString(2, pvo.getMaker());
			pstmt.setInt(3, pvo.getPrice());
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
	}
	public ArrayList<ProductVO> getAllProductList() throws SQLException {
		ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			String sql = "SELECT id, name, TO_CHAR(regdate, 'YYYY/MM/DD') FROM mvc_product ORDER BY id DESC";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				productList.add(new ProductVO(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			
		} finally {
			closeAll(rs, pstmt, con);
		}
		
		return productList;
	}
	public ProductVO findProductById(String id) throws SQLException {
		ProductVO pvo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			String sql = "SELECT id, name, maker, price, TO_CHAR(regdate, 'YYYY/MM/DD HH24:MI:SS') FROM mvc_product WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				pvo = new ProductVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return pvo;
	}
}
















