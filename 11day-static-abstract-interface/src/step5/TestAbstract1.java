package step5;
// abstract method가 하나 이상 존재하면 그 클래스는 abstract로 선언해야한다.
abstract class Parents{
	Parents(){
		System.out.println("Parent 객체 생성");
	}
	public void eat() {
		System.out.println("먹다");
	}
	public abstract void study();
	// abstract 메서드는 구현부 ' { } '를 가질 수 없다.
	// 오직 선언만 가능
}
class Child extends Parents{
	Child(){
		super();
		System.out.println("Chlid 객체생성");
	}
	
	@Override
	public void study() {
		System.out.println("Child 공부하다");
	}
	
}
public class TestAbstract1 {
	public static void main(String[] args) {
		// abstract 클래스 이므로 직접 객체생성할 수 없다.
		//Parents p = new Parents();
		Child c = new Child();
		c.study();
		c.eat();
	}
}


