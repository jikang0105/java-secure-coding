package school.model;

public class Student extends Person {
	private static final long serialVersionUID = 1L;
	private String stdId;
	public Student(String tel, String name, String address, String stdId) {
		super(tel, name, address);
		this.stdId = stdId;
	}
	
	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	@Override
	public String toString() {
		return super.toString()+" stdId=" + stdId;
	}	
}








