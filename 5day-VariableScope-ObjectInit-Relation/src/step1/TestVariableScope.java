package step1;
// 메인 메서드가 존재하는 클래스로서 , 프로그램 실행을 위해 정의
public class TestVariableScope {
	public static void main(String[] args) {
		// p 는 메인 메서드 내에 선언되어 있으므로 지역변수에 해당한다.
		// p 는 객체의 주소값을 저장하므로 참조 변수 ( reference variable )
		// 라고도 불린다.
		Person p = new Person();
		p.setName("아이유");
		p.eat();
		System.out.println(p.getName());
	}
}
