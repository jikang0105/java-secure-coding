package model;

public class Employee extends SchoolMember {
	private String department;

	public Employee(String phoneNumber, String name, String address, String department) {
		super(phoneNumber, name, address);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() + "department=" + department;
	}
	
}
