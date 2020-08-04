package model;

import java.io.Serializable;
/*
 * Serializable interface를 implements 해야만 직렬화 가능한 객체가 된다.
 */
public class Person implements Serializable {
	/**
	 *  serialVersionUID : class의 지문, 클래스 버전을 명시한다.
	 *  					객체 직렬화와 역직렬화시 호환성을 위해 사용한다.
	 */
	private static final long serialVersionUID = 8434327299042305734L;
	private String name;
	private String address;
	private String password;
	private int age;
	
	public Person(String name, String address, String password) {
		super();
		this.name = name;
		this.address = address;
		this.password = password;
	}
	
		
	public Person(int age) {
		super();
		this.age = age;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
