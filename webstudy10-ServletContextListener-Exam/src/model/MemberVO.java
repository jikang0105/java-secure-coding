package model;

import java.io.Serializable;

public class MemberVO implements Serializable{
	
	private static final long serialVersionUID = -1810066328202017852L;
	private String name;
	private String address;
	public MemberVO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
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
		return "MemberVO [name=" + name + ", address=" + address + "]";
	}
	
}
