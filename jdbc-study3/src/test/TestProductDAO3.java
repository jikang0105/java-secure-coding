package test;

import java.sql.SQLException;

import model.ProductDAO;
import model.ProductDTO;
// ���̵� ���� ��ǰ�� �����ϴ��� ������ ��ȯ�Ѵ�
public class TestProductDAO3 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			String id = "kk";
			boolean flag = dao.isExistProduct(id);
			if(flag) {
				System.out.println(id + " ���̵� �ش��ϴ� ��ǰ�� �ֽ��ϴ�.");
			} else {
				System.out.println(id + " ���̵� �ش��ϴ� ��ǰ�� �����ϴ�.");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
