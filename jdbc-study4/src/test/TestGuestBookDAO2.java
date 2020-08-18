package test;

import model.GuestBookDAO;
import model.GuestBookDTO;


public class TestGuestBookDAO2 {
	public static void main(String[] args) {
		try {
			GuestBookDAO dao = new GuestBookDAO();
			// 아래 메서드는 예외가 발생한다.
			//System.out.println(dao.getCurrentSequence());
			GuestBookDTO dto = new GuestBookDTO("마지막시간", "칼퇴!");
			dao.register2(dto);
			System.out.println(dto);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
