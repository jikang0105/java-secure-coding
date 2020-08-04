package model;

import java.io.Serializable;
/*
 * Serializable interface를 implements 해야만 직렬화 가능한 객체가 된다.
 * 객체가 직렬화디어 외부로 전송될 때 특정 인스턴스 변수의 정보는
 * 직렬화대상에서 제외하고 할 때 transient 키워드를 이용한다.
 */
public class Person2 implements Serializable {
	
	private static final long serialVersionUID = 4261180539532798202L;
	private String name;
	private String address;
	private transient String password;
	public Person2(String name, String address, String password) {
		super();
		this.name = name;
		this.address = address;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
