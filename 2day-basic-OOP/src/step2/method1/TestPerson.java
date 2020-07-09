package step2.method1;

public class TestPerson {
	public static void main(String[] args) {
		// Person class 를 이용해 객체를 생성한다.
		// 주소값을 저장하는 변수명은 p로 한다.
		Person p = new Person();
		// p 객체의 eat() 메서드를 호출해서 실행시킨다.
		p.eat();
		// eat2() 메서드를 실행 , 맥주 먹다 가 출력되도록 데이터를
		// 전달해서 실행시킨다.
		p.eat2("맥주");
		p.eat2("막걸리");
		// eat3 메서드를 실행하되 소주 3번 먹다 가 출력되도록 한다.
		p.eat3("소주", 3);
		// eat4 메서드를 실행하되 해당 메서드가 반환한 값을 받아서
		// 출력해본다.
	String returnValue = p.eat4("와인");
	System.out.print(returnValue + "\n");	
	System.out.print(p.eat4("와인"));
	}
	
}
