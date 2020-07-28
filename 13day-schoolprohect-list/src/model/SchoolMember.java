package model;

public class SchoolMember {
	private String phoneNumber;
	private String name;
	private String address;

		
	public SchoolMember(String phoneNumber, String name, String address) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "phoneNumber=" + phoneNumber + ", name=" + name + ", address=" + address;
	}
	
}
