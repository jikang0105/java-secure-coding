package step3;

public class Employee {
	private String responsibility;
	private String name;
	private int salary;
	
	public Employee(String responsibility, String name, int salary) {
		this.responsibility = responsibility;
		this.name = name;
		this.salary = salary;
	}
	
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public int getAnnualSalary() {
		return getSalary() * 12;
	}
	@Override
	public String toString() {
		return "Responsibility : " + responsibility + " / Name : " + name + " / Salary : " + salary;
	}
}
