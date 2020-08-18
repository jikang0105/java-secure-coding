package test;

import java.sql.SQLException;

import model.ProductDAO;
import model.ProductDTO;
// 총 상품수를 반환받는 예제 : ResultSet 의 getInt()를 이용하면 된다.
public class TestProductDAO2 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			int totalCount = dao.getTotalCount();
			System.out.println("총 상품수 : " + totalCount);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
