package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;

/*
 * MemberDAO�� getAllMemberList()�� �����ϴ� ����
 * MEMBER TABLE �� �ִ� ��� ȸ�� ������ ArrayList<MemberVO> Ÿ����
 * list ������ ��ȯ�޾ƺ��� ����
 */
public class TestMemberDAO2 {
	public static void main(String[] args) {
		MemberDAO dao;
		try {
			dao = new MemberDAO();
			ArrayList<MemberVO> list = dao.getAllMemberList();
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
