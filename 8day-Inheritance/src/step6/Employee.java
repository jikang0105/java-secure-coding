package step6;
// java.lang.Object �� ��� Ŭ������ root Ŭ����
// ������ ��� ǥ���� ������ �ڵ����� extends Object �ȴ�.
public class Employee { // extends Object
	private String empNo;
	private String name;
	private int salary;
	
	public Employee (String empNo, String name, int salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	
	public void setEmpNo(String empNO) {
		this.empNo = empNO;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpNo() {
		return empNo;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}	
	
}
