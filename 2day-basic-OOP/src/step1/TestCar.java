package step1;

import java.util.concurrent.ConcurrentLinkedQueue;

// 코드정리 단축키 ctrl shift f
public class TestCar {
	public static void main(String[] args) {
		// Car 클래스를 이용해 Car 객체를 생성한다.
		// 객체의 주소값을 저장하는 변수명은 c로 한다.
		Car c = new Car();
		//System.out.println(c);//객체 주소값 출력
		// 실행 단축키 ctrl + f11
		// Car 의 model 인스턴스 변수에 BMW를 할당한다.
		c.model = "BMW";
		System.out.println(c.model);
		
		/*
		 * 여러 줄 주석
		 * c1 변수에 Car 객체를 생성한다.
		 * 생성한 객체의 model 인스턴스 변수에 '모닝'을 할당한다.
		 * 할당한 model 정보를 출력해본다.
		 */
		Car c1 = new Car();
		c1.model = "모닝";
		System.out.println(c1.model);
		c1.price = 100;
		System.out.println(c1.price);
		// 메서드를 호출해서 실행시킨다.
		c1.drive(); // 모닝 운전하다
		c.drive(); // BMW 운전하다
		
	}
}
