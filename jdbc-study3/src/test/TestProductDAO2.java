package test;

import java.sql.SQLException;

import model.ProductDAO;
import model.ProductDTO;
// �� ��ǰ���� ��ȯ�޴� ���� : ResultSet �� getInt()�� �̿��ϸ� �ȴ�.
public class TestProductDAO2 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			int totalCount = dao.getTotalCount();
			System.out.println("�� ��ǰ�� : " + totalCount);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
