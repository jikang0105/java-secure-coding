package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;

/*
 * MemberDAO의 getAllMemberList()를 구현하는 예제
 * MEMBER TABLE 에 있는 모든 회원 정보를 ArrayList<MemberVO> 타입의
 * list 정보를 반환받아보는 연습
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
