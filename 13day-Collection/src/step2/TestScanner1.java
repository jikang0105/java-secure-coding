package step2;

import java.util.Scanner;

// 실행창에서 Scanner 객체를 이용해 정보를 입력받아 보는 예제
public class TestScanner1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // System.in 실행창 입력 객체
		while(true) {
		System.out.print("이상형 : ");
		String info = s.nextLine();
		if(info.contentEquals("그만")) {
			System.out.println("종료했습니다.");
			break;
		}
		System.out.println("입력받은 메세지 : " + info);
		}
		s.close();// 자원을 해제
	}
}
