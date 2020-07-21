package step3;

public class Manager extends Employee {
	private String department;
	public Manager(String responsibility, String name, int salary, String department) {
		super(responsibility, name, salary);
		this.department = department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	//public int getAnnualSalary() {
	//	return getSalary() * 12;
	//}
	public String toString() {
		return super.toString() + " / Department : " + department;
	}
}
