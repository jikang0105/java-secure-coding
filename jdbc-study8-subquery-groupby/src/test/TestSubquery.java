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
			 * 	총무부 부서인 사원들 중 가장 낮은 월급을 받는 사원 정보를 조회
			 */
			list = dao.getEmpByLowSal("총무");
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
