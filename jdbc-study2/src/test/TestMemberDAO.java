package test;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;
/*
 * MemberDAO�� findMemberById(id)�� �����غ��� ����
 * primary key�� id�� �̿��� MEMBER TABLE �� ȸ�������� �����ϴ� ID�� ���յǸ�
 * MEMBER...
 */
public class TestMemberDAO {
	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			String id = "java";
			MemberVO vo = dao.findMemberById(id);
			if(vo==null) {
				System.out.println(id + " ���̵� �ش��ϴ� ȸ�������� �����ϴ�.");
			} else {
				System.out.println("�˻���� : " + vo);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
