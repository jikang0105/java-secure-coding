package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeVO;

public class TestSubquery {
	public static void main(String[] args) {
		EmployeeDAO dao;
		ArrayList<EmployeeVO> list;
		try {
			dao = new EmployeeDAO();
			/*
			 * 	�ѹ��� �μ��� ����� �� ���� ���� ������ �޴� ��� ������ ��ȸ
			 */
			list = dao.getEmpByLowSal("�ѹ�");
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 	catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
