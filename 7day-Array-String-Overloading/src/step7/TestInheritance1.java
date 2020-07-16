package step7;
// 간단한 상속 테스트 예제
class Animal{
	int age = 1;
	public void eat() {
		System.out.println("먹다");
	}
}

// Animal을 상속받아본다
class Person extends Animal{
	// 부모 Animal에 없는 자식의 기능을 구현한다.
	public void study() {
		System.out.println("사람이 공부하다");
	}
}

public class TestInheritance1 {
	public static void main(String[] args) {
		// 자식 Person 객체를 생성한다.
		Person p = new Person();
		p.eat(); // 상속받았으므로 사용가능하다.
		System.out.println(p.age); // 상속받았으므로 사용사능
		p.study(); // 자신의 메서드는 당연히 사용가능하다.
	}
}
