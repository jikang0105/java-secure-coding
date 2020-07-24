package step4;
interface A{
	public void a();
	// jdk 1.8에 추가된 default method
	// 인터페이스의 확장성을 고려해서 구현부를 가지는 default 메서드 문법을 추가하게 되었다.
	public default void aa() {
		System.out.println("구현부를 가지는 default method");
	}
}
// 인터페이스끼리는 상속이 가능하다
interface B extends A{
	public void b();
}
// B를 구현한 Test 클래스는 a()와 b()를 모두 구현해야 한다
class Test implements B{
	public void a() {}
	public void b() {}
}

public class TestInterface4 {
	public static void main(String[] args) {
		Test t = new Test();
		t.aa();
	}
}
