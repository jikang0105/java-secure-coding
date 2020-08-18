package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Employee;
import model.EmployeeDAO;

public class TestJoin2 {
	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			ArrayList<Employee> list = dao.findEmpAndDeptInfoList();
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i)); // 사원과 사원이 속한 부서 정보가 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
