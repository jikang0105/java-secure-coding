package step7;

public class TestReferenceDataType {
	public static void main(String[] args) {
		/*
		 *  Person : 참조형 데이터 타입
		 *  p : 참조변수 reference variable ( 객체를 참조하는 주소값을 저장 )
		 *  = : 할당 또는 대입
		 *  new : 자바 키워드 ( 객체 생성을 위한 )
		 *  Person("아이유") : 생성자 constructor
		 */
		Person p = new Person("아이유");
		System.out.println(p.getName());
		Person p2 = new Person("박보검");
		System.out.println(p2.getName());
		p = p2; // p2 주소값을 p에 할당한다.
		System.out.println(p.getName());
		System.out.println(p2.getName());
	}
}
