package test;

import java.sql.SQLException;

import model.Employee;
import model.EmployeeDAO;

public class TestJoin {
	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			/*
			 *  k_employee �� department ���̺��� ����(����)�ؼ�
			 *  1�� �����ȣ�� ���� ����� ��������� �μ������� ��ȸ�ϰ��� �Ѵ�.
			 * ( �� ���´� ����ϰ� ���ǰ�, ���δ� ��������� ��ȸ�ؼ� ����ϰ�
			 *  ���δ� �μ������� ��ȸ�ؼ� ȭ���� �����Ǳ⵵ �Ѵ�.)
			 *  -> UML ( Class Diagram ) �� �����غ���
			 */
			String empno = "1";
			// empno �� �ش��ϴ� ename, salary, depno, dname, loc, tel�� ��ȸ�Ͽ� ����Ѵ�.
			Employee e;
			e = dao.findEmpAndDeptInfo(empno);// JOIN SQL�� �����ؼ� ����� ��ȯ�޴´�.
			System.out.println("�����ȣ : " + empno);
			System.out.println("����� : " + e.getEname());
			System.out.println("������� : " + e.getSal());
			System.out.println("�μ���ȣ : " + e.getDepartment().getDeptno());
			System.out.println("�μ��� : " + e.getDepartment().getDname());
			System.out.println("���� : " + e.getDepartment().getLoc());
			System.out.println("�μ���ȭ��ȣ : " + e.getDepartment().getTel());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}
}
