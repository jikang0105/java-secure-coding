package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ProductDAO;
import model.ProductDTO;

// 조건절 이용 WHERE, 정렬
public class TestProductDAO6 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			int percent = 10; // 10% 할인된 가격으로 조회하되 price 오름차순 정렬
			ArrayList<ProductDTO> list = dao.getProductListDiscountPrice(percent);
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
