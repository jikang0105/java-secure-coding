package step3;
class Employee{
	private String empId;
	private String name;
	public Employee(String empId, String name) {
		super(); // Object 생성자 호출하여 객체 생성
		this.empId = empId;
		this.name = name;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [empId = " + empId + " name : " + name + "]";
	}	
}

public class TestToString2 {
	public static void main(String[] args) {
		Employee e = new Employee("20", "양성식");
		// Employee 에서 toString()을 오버라이딩했으므로 오버라이딩 한 자신의
		// 메서드가 호출된다.
		System.out.println(e);//println() 메서드가 내부적으로 toString()을 호출
		System.out.println(e.toString());
		// 위 두라인은 동일한 결과를 출력
	}
}
