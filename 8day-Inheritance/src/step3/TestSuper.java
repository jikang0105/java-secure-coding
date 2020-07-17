package step3;

class Animal{
	// 생성자
	Animal(){
		System.out.println("Animal 객체 생성");
	}
	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal{
	// 생성자 constructor
	Person(){ 
		// super() 는 부모생성자를 실행해서 부모 객체를 생성하는 역할
		super(); // 없으면 컴파일시에 자동 삽입
		System.out.println("Person 객체 생성");
	}
}

public class TestSuper {
	public static void main(String[] args) {
		new Person(); // 객체 생성 ( 생성자가 실행 )
	}
}
