package test;

import java.sql.SQLException;

import model.ProductDAO;
import model.ProductDTO;
// 아이디에 대한 상품이 존재하는지 유무를 반환한다
public class TestProductDAO3 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			String id = "kk";
			boolean flag = dao.isExistProduct(id);
			if(flag) {
				System.out.println(id + " 아이디에 해당하는 상품이 있습니다.");
			} else {
				System.out.println(id + " 아이디에 해당하는 상품이 없습니다.");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
