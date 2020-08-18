package test;

import model.CardDAO;

/**
 * TestTransaction1
 * 트랜잭션 처리가 되지 않았을 때 발생되는 문제를 확인하는 예제
 * 카드 테이블에 카드 정보가 INSERT되고
 * 포인트 테이블에 포인트 정보가 INSERT될 때
 * 포인트 정보는 등록되지 않고 카드정보만 존재하는 문제가 발생하는 경우를 만들어본다.
 * -> 논리적 오류
 * @author KOSTA
 *
 */
public class TestTransaction1 {
	public static void main(String[] args) {
		try {
			CardDAO dao = new CardDAO();
			dao.registerCardAndPoint("java2", "장기하", "lotte", 1000); // id, name, point_type, point
			System.out.println("카드와 포인트 insert ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
