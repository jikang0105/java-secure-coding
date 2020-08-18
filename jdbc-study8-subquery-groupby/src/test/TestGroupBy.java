package test;

import java.util.ArrayList;
import java.util.HashMap;


import model.EmployeeDAO;

public class TestGroupBy {
	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			/* job 그룹별 최고 salary를 조회한다, highsal 내림차순
			 * (job, highSalary ) 
			 * 
			 * 1.SQL 을 작성해서 테스트
			 * 2.어플리케이션에 적용
			 * 
			 */
			ArrayList<HashMap<String,Object>> list = dao.getJobGroupInfoGroupByJob();
			for(int i = 1; i < list.size(); i++) {
				System.out.println("job : " + list.get(i).get("job") + " highsalary : " + list.get(i).get("highsal"));
			}
			
		} catch(Exception e) {
			e.printStackTrace(); // 예외 원인과 발생 경로를 출력
		}
	}
}
