package step4;

class Car{}
class Animal{}
class Person extends Animal{}
public class TestPolymorphismArray1 {
	public static void main(String[] args) {
		Animal [] a = new Animal[3];
		// 원칙적으로 배열은 선언한 데이터타입의 정보만 담는다.
		a[0] = new Animal();
		// 부모타입의 배열에 자식객체를 담을 수 있다.(다형성이 지원되므로)
		a[1] = new Person();
		// a[2] = new Car(); // Car는 Animal의 자식이 아니므로 담을 수 없다.
		
	}
}
