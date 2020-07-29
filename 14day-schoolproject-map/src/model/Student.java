package model;

public class Student extends SchoolMember{
	private String stuNumber;

	public Student(String name, String tel, String address, String stuNumber) {
		super(name, tel, address);
		this.stuNumber = stuNumber;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}

	@Override
	public String toString() {
		return super.toString() + ", stuNumber=" + stuNumber;
	}
	
}
