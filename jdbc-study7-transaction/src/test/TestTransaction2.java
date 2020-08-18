package test;

import model.CardDAO2;

/**
 * 트랜잭션 처리가 되지 않았을 때 발생되는 문제를 확인하는 예제
 * 카드 테이블에 카드 정보가 INSERT되고
 * 포인트 테이블에 포인트 정보가 INSERT될 때
 * 포인트 정보는 등록되지 않고 카드정보만 존재하는 문제가 발생하는 경우를 만들어본다.
 * -> 논리적 오류
 * TestTransaction2
 * 트랜잭션 처리를 통해 모든 작업이 정상적으로 수행되었을 때 commit
 * 문제 발생시 rollback 처리한 예제
 * 
 * 테스트 1 : 정상적인 데이터 입력해 commit 확인한다.
 * 테스트 2 : point 등록시 고의로 오류를 발생시켜 rollback이 되는지 확인한다.
 * @author KOSTA
 *
 */
public class TestTransaction2 {
	public static void main(String[] args) {
		try {
			CardDAO2 dao = new CardDAO2();
			dao.registerCardAndPoint("java3", "장기하", "lotte", 1000); // id, name, point_type, point
			System.out.println("카드와 포인트 insert ok");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("카드발급과정에 오류가 생겨 발급이 취소되었습니다.");
		}
	}
}
