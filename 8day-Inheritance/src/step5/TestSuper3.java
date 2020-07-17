package step5;

class Animal{
	int age;
	Animal(int age){
		this.age = age;
	}
}

class Person extends Animal{
	String name;
	Person(String name, int age){
		//super(); // 부모생성자의 매개변수에 알맞지 않으므로 error가 발생한다.
		// 아래와 같이 super(age)를 직접 명시해야한다.
		super(age);
		this.name = name;
	}
}

public class TestSuper3 {
	public static void main(String[] args) {
		Person p = new Person("아이유", 28);
		System.out.println(p.name + " " + p.age);
	}
}
