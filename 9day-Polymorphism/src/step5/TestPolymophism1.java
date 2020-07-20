package step5;
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	//메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의
	public void eat() {
		System.out.println("사람이 두부김치를 먹다");
	}
}
class Monkey extends Animal{
	// 메서드 오버라이딩
	public void eat() {
		System.out.println("원숭이가 바나나를 먹다");
	}
}
class Car{
	
}
public class TestPolymophism1 {
	public static void main(String[] args) {
		// new Person() 으로 객체 생성하고 반환되는 주소값을 
		// Animal 타입의 a 변수에 저장한다.
		// 부모 타입의 변수에 자식 객체를 참조시킬 수 있다.
		Animal a = new Person();
		a.eat(); // 자식의 오버라이드 된 메서드가 실행된다.
		// 부모타입 Animal 변수에 Monkey 자식 객체를 참조시킨다.
		Animal a2 = new Monkey();
		a2.eat();
		// Car는 Animal의 자식이 아니므로 compile error
		//Animal a3 = new Car();
	}
}







