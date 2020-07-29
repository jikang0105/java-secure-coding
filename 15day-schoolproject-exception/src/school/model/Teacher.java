package school.model;

public class Teacher extends SchoolMember {
	private String subject;

	public Teacher(String name, String tel, String address, String subject) {
		super(name, tel, address);
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
		return super.toString() + ", subject=" + subject;
	}
	
}
