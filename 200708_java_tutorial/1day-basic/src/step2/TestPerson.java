package step2; 

public class TestPerson {

	public static void main(String[] args) {
		// Person class를 이용해 Person 객체를 생성한다.
		Person p = new Person();
		// Person class 의 name 변수에 이름을 저장한다.
		p.name = "아이유";
		// p 객체의 name을 출력해본다.
		System.out.println(p.name);
		// p 객체의 eat() 메서드를 실행해본다.
		p.eat();
	}

}
