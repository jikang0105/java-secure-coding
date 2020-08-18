package test;

import model.MovieDAO;
import model.MovieVO;

public class TestMovieDAO {
	public static void main(String[] args) {
		try {
			MovieDAO dao = new MovieDAO();
			MovieVO vo = new MovieVO();
			vo.setTitle("인터스텔라");
			vo.setAttendance(100);
			dao.register(vo);
			System.out.println("영화정보등록 ok" + vo);// 발급된 id까지 모두 출력되도록한다.
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
