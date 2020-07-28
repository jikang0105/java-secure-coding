package model;

public class Student extends SchoolMember{
	private String schoolNumber;

	public Student(String phoneNumber, String name, String address, String schoolNumber) {
		super(phoneNumber, name, address);
		this.schoolNumber = schoolNumber;
	}

	public String getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "schoolNumber=" + schoolNumber;
	}
	
	
}
