package test;

import java.util.ArrayList;
import java.util.HashMap;


import model.EmployeeDAO;

public class TestGroupBy {
	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			/* job �׷캰 �ְ� salary�� ��ȸ�Ѵ�, highsal ��������
			 * (job, highSalary ) 
			 * 
			 * 1.SQL �� �ۼ��ؼ� �׽�Ʈ
			 * 2.���ø����̼ǿ� ����
			 * 
			 */
			ArrayList<HashMap<String,Object>> list = dao.getJobGroupInfoGroupByJob();
			for(int i = 1; i < list.size(); i++) {
				System.out.println("job : " + list.get(i).get("job") + " highsalary : " + list.get(i).get("highsal"));
			}
			
		} catch(Exception e) {
			e.printStackTrace(); // ���� ���ΰ� �߻� ��θ� ���
		}
	}
}
