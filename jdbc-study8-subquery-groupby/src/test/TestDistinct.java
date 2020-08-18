package test;

import java.util.ArrayList;

import model.EmployeeDAO;

public class TestDistinct {
	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			ArrayList<String> list = dao.getJobKind();
			for(int i = 0; i < list.size(); i++) {
				System.out.println(i+1 + ". " + list.get(i));
			}
			/*
			 * 1. ÃÑ¹«
			 * 2. °³¹ß
			 * 3. ±âÈ¹
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
