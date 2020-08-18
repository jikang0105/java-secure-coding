package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 *  DAO : Data Access Object
 *  데이터베이스 연동 로직을 정의한 객체
 */
public class ProductDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";
	/*
	 * 생성자에서 드라이버 로딩
	 */
	
	
	public ProductDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}
	
	public ProductDTO findProductById(String id) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ProductDTO dto = null;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			//String sql = "SELECT id, name, maker, price FROM product WHERE id = ?";
			String sql = "SELECT name, maker, price FROM product WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				//dto = new ProductDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				dto = new ProductDTO(id, rs.getString(1), rs.getString(2), rs.getInt(3));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return dto;
	}
	
	/*
	 * public ArrayList<ProductDTO> printAllProduct(){ ArrayList<ProductDTO> = new
	 * ArrayList<ProductDTO>();
	 * 
	 * return list; }
	 */
	
	public int getTotalCount() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int totalCount = 0;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "SELECT COUNT(*) FROM product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				totalCount += rs.getInt(1);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return totalCount;
	}
	

	public boolean isExistProduct(String id) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			con = DriverManager.getConnection(dbUrl, user ,pass);
			String sql = "SELECT COUNT(*) FROM product WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			/*
			 * if(rs.next()) { if(rs.getInt(1) == 1) { flag = true; } }
			 */
			rs.next();
			/*
			 * int result = rs.getInt(1); if(result == 1) { flag = true; }
			 */
			// 위 코드를 삼항연산자로 변경해본다
			// 조건식에 부합하면 식1이 수행, 부합되지 않으면 식2가 수행
			flag = (rs.getInt(1) == 0) ? false : true;
		} finally {
			closeAll(rs, pstmt, con);
		}
		return flag;
	}
	
	public void registerProduct(ProductDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "INSERT INTO product(id, name, maker, price) VALUES(?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, dto.getId());
			pstmt.setNString(2, dto.getName());
			pstmt.setString(3, dto.getMaker());
			pstmt.setInt(4, dto.getPrice());
			pstmt.executeUpdate();
			
		} finally {
			closeAll(pstmt, con);
		}
		
	}
	
	public ArrayList<ProductDTO> getProductListByPriceOrderByDesc(int lowPrice, int highPrice) throws SQLException {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "SELECT name, price FROM product WHERE price BETWEEN ? AND ? ORDER BY price DESC";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, lowPrice);
			pstmt.setInt(2, highPrice);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//list.add(new ProductDTO(rs.getNString(1), rs.getInt(2)));
				ProductDTO dto = new ProductDTO();
				dto.setName(rs.getNString(1));
				dto.setPrice(rs.getInt(2));
				list.add(dto);
			}
			
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	public ArrayList<ProductDTO> getProductListDiscountPrice(int percent) throws SQLException {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			/*
			 * con = DriverManager.getConnection(dbUrl, user, pass);
			 * String sql = "SELECT id, name, maker, price-(price*(?/100)) AS 할인가 FROM product ORDER BY price ASC;"
			 * pstmt = con.prepareStatement(sql); pstmt.setInt(1, percent); 
			 * rs = pstmt.executeQuery();
			 */
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT id, name, maker, price-(price*(?/100)) AS 할인가 ");
			sb.append("FROM product ORDER BY price ASC");
			con = DriverManager.getConnection(dbUrl, user, pass);
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setInt(1, percent);
			rs=pstmt.executeQuery();		
			
			while(rs.next()){
				ProductDTO dto = new ProductDTO();
				dto.setId(rs.getString(1));
				dto.setName(rs.getNString(2));
				dto.setMaker(rs.getNString(3));
				dto.setPrice(rs.getInt(4));
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
// closeAll overloading
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs != null) {
			rs.close();
		}
		this.closeAll(pstmt, con);
	}



	
}
