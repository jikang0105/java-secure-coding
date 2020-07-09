package step1; // 팩키지는 클래스를 디렉토리별로 분류하기 위한 용도

// 객체 생성을 위한 틀
// 자바는 클래스명에서는 첫글자는 대문자로 시작
// 합성어의 첫글자도 대문자, 나머지는 소문자 ex) MyCar
public class Car {
	// 인스턴스 변수 instance variable -> 데이터를 저장하기 위한 공간
	// 변수명은 소문자로 하되 합성어의 첫글자는 대문자 ex) myPassword
	// String 은 문자열 데이터 타입
	String model;
	// int 정수형 데이터 타입
	int price;
	public void drive() {
		System.out.println(model+" 운전하다");
	}
}
