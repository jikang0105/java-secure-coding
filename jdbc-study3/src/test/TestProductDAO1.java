package test;
//primary key�� product id�� ��ǰ������ �˻��ϴ� ����
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
				System.out.println("�Է��� ���̵� �ش��ϴ� ��ǰ�� �����ϴ�.");
			} else {
				System.out.println("�˻���� : " + dto);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
