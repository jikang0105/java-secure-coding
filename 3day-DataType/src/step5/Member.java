package step5;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// setter / getter �� ���� �����غ���
	// ����Ű alt shift s
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}
