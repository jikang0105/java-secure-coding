package step5;
class Person{
	public void eat() {
		System.out.println("먹다");
	}
	// 메서드 오버로딩 : 동일한 이름의 메서드로 매개변수를 다르게 하는 기법 -> 사용자 편의성
	public void eat(String name) {
		System.out.println(name + "먹다");
	}
	// 메서드 오버로딩 : 매개변수의 순서 , 타입, 개수가 다르면 오버로딩으로 인식한다.
	public void eat(int count) {
		System.out.println(count + "번 먹다");
	}
	// public void eat(int a){} // 매개변수형과 개수가 같고 이름이 다르면 컴파일 에러가 난다
	public void eat(String name, int count) {
		System.out.println(name + " " + count + "번 먹다");
	}
}
public class TestOverloading1 {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.eat();
		p.eat("짬뽕");
		p.eat(3);
		p.eat("우동", 3);
		
	}
}
