package step1;
interface Flyer{
	
	public void fly();//abstract 를 별도로 명시하지 않아도 된다.
	public static void landoff() {
		System.out.println("착륙하다");
	}
}
class Animal{}
class Person extends Animal{}
class Bird extends Animal implements Flyer{
	public void fly() {
		System.out.println("새가 날다");
	}
	public void landoff() {
		System.out.print("새가 ");
		Flyer.landoff();
	}
}
class Airplane implements Flyer{
	public void fly() {
		System.out.println("비행기가 날다");
	}
}
public class TestInterface1 {
	public static void main(String[] args) {
		// 인터페이스 문법을 확인하는 예제
		//Animal a = new Airplane(); // 상위타입만 상속이 가능하다.
		Flyer f1 = new Bird(); // 상위 인터페이스 타입으로 하위 객체를 참조할 수 있다. 다형성이 적용됨.
		Flyer f2 = new Airplane();
		f1.fly();
		f2.fly();
		((Bird)f1).landoff();
		// 인터페이스의 경우 default or static 함수를 사용할 경우 강제성이 없고 오버라이딩도 가능하지만
		// 객체(동적메모리)를 만들 수 없기때문에 재사용성은 없다고 할 수 있다.
		
	}
}
