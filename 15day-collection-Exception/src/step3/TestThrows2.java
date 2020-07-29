package step3;

import java.util.Scanner;

// 사용자 정의 Exception 만들기
class AgeException extends Exception{
	AgeException(){
		super("나이 정보에 문제가 있습니다!");
	}
	AgeException(String message){
		super(message);
	}
}

class MovieService{
	// age 정보가 1 미만일때는 AgeException을 발생시키고
	// 호출한 곳으로 AgeException을 던진다(전달한다)
	public String enter(int age) throws AgeException {
		if(age < 1)
			throw new AgeException();
		System.out.println("나이가 정싱적이므로 영화서비스 제공");
		return "영화";
	}
	public String enterAdultMovie(int age) throws AgeException {
		if(age < 1)
			throw new AgeException(); // Exception 발생
		if(age < 20)
			throw new AgeException("미성년자이므로 관람불가!");
		System.out.print("성인영화서비스");
		return "성인영화";
	}
}

public class TestThrows2 {
	public static void main(String[] args) {
		MovieService service = new MovieService();
		Scanner s = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();
		/*
		 * try { System.out.println(service.enter(age)); } catch (AgeException e) {
		 * System.out.println(e.getMessage()); }
		 */
		try {
			service.enterAdultMovie(age);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상수행");
	}
}
