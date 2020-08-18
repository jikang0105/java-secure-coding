package test;

import java.sql.SQLException;

import model.ProductDAO;
import model.ProductDTO;

// PRODUCT TABLE에 상품정보를 등록하는 예제
public class TestProductDAO4 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			// 등록할 상품정보객체
			ProductDTO dto = new ProductDTO("4", "참이슬", "진로", 3000);
			if(dao.isExistProduct(dto.getId())) {
				System.out.println(dto.getId() + "아이디에 대한 상품이 존재하므로 등록불가");
			} else {
				dao.registerProduct(dto);
				System.out.println("insert ok : " + dao.findProductById(dto.getId()));
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
