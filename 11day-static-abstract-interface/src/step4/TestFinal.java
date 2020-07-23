package step4;

class Person{
	// final 제어자를 명시하면 재할당 불가
	// 자바에서 상수는 대문자로 표현한다.
	final int MAX_PRICE = 100;
	public void test1() {
		// MAX_PRICE = 200; // final이므로 재할당불가
	}
}
final class Parents{
}
// final class 는 상속받을 수 없다
// class Child extends Parents{}
class Animal{
	public final void eat() {}
}
class Dog extends Animal{
	// 부모의 final 메서드는 오버라이딩 할 수 없다.
	// public void eat() {}
}
public class TestFinal {
	
}
