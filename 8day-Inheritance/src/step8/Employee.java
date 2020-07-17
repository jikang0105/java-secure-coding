package step8;

public class Employee {
	private String empId;
	private String name;
	private int salary;
	
	public Employee(String empId, String name, int salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	//public void getDetails() {
	//	System.out.print("�����ȣ : " + empId + " ����� : " + name + " ���� : " + salary);
	//}
	public String getDetails() {
		return "�����ȣ : " + empId + " ����� : " + name + " ���� : " + salary;
	}
}
