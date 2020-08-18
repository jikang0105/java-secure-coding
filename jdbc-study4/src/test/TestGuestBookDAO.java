package test;

import java.util.ArrayList;

import model.GuestBookDAO;
import model.GuestBookDTO;

public class TestGuestBookDAO {
	public static void main(String[] args) {
		try {
			GuestBookDTO dto = new GuestBookDTO("테스트", "마칠시간이 다가왔습니다!");
			GuestBookDAO dao = new GuestBookDAO();
			dao.register(dto);
			System.out.println(dto + " 등록완료!");
			// 최근순(내림차순)
			ArrayList<GuestBookDTO> list = dao.getAllGuestBookListOrederByNoDesc();
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
