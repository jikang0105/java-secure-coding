package model;

public class Teacher extends SchoolMember{
	private String subject;

	public Teacher(String phoneNumber, String name, String address, String subject) {
		super(phoneNumber, name, address);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() + "subject=" + subject;
	}
	
}
