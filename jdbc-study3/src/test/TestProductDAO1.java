package test;
//primary key인 product id로 상품정보를 검색하는 예제
import java.sql.SQLException;

import model.ProductDAO;
import model.ProductDTO;

public class TestProductDAO1 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			String id = "1";
			ProductDTO dto = dao.findProductById(id);
			if(dto == null) {
				System.out.println("입력한 아이디에 해당하는 제품이 없습니다.");
			} else {
				System.out.println("검색결과 : " + dto);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
