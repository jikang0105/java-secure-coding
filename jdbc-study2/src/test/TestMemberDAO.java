package test;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;
/*
 * MemberDAO의 findMemberById(id)를 구현해보는 예제
 * primary key인 id를 이용해 MEMBER TABLE 의 회원정보가 전달하는 ID에 부합되면
 * MEMBER...
 */
public class TestMemberDAO {
	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			String id = "java";
			MemberVO vo = dao.findMemberById(id);
			if(vo==null) {
				System.out.println(id + " 아이디에 해당하는 회원정보가 없습니다.");
			} else {
				System.out.println("검색결과 : " + vo);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
