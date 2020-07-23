package step3;
class Person{
	static int age = 21; // class 의 member -> 별도 객체 생성없이 사용가능
	public static void eat() {
		System.out.println("static eat");
		//play(); // static eat() 메서드는 객체생성없이 실행가능하고
		// play() 메서드는 반드시 객체생성되어야만 실행할수 있기 때문에 compile error가 발생한다.
	}
	// non-static계열 즉 Object의 멤버(메서드)는 객체 생성해야 사용이 가능하다.
	public void play() {
		System.out.println("object play");
		eat(); // play()가 실행되었다는 것은 객체 생성을 전제로하고
		// 객체 생성 전에 class loading이 일어나기 때문에 당연히 접근이 가능하다.
	}
}
public class TestStatic2 {
	public static void main(String[] args) {
		// 프로그램 실행시 첫시점에 class loading이 되고 그 때 static이 메모리에 적재되므로
		// age는 static 이므로 별도의 객체 생성없이 사용할 수 있다.
		System.out.println(Person.age);
		Person.eat(); // 객체생성없이 클래스명. 메서드()로 실행이 가능하다.
		//Person.play(); // object의 member이므로 객체생성이 필요하다.
		Person p = new Person();
		p.play(); // 이렇게 사용해야 한다.
		
	}
}
