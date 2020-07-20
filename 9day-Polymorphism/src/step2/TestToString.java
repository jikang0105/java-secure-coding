package step2;
class Employee{//extends Object
	// Employee(){super();}
}
class Employee2{
	String empId;
	String name;
	public Employee2(String empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	// 어노테이션 : 의미있는 주석
	//@Override 는 Overriding 규칙에 어긋나면 error를 발생시킨다.
	// Object class의 toString()메서드를 직접 오버라이딩해본다
	// 주소값 대신 실제값을 반환하도록 재정의
	@Override 
	public String toString() {
		return "empId : " + empId + " name : " + name;
	}
	
}
public class TestToString {
	public static void main(String[] args) {
		Employee e = new Employee();
		// Object의 자식이므로 toString() 사용가능
		// Employee 객체 주소값이 반환되어 출력된다.
		System.out.println(e.toString());
		// println 내부에서 참조변수가 들어오면 toString()을 호출하므로
		// 아래와 같이 사용할 수도 있다.
		System.out.println(e);
		Employee2 e2 = new Employee2("20", "김수민");
		System.out.println(e2);
	}
}
