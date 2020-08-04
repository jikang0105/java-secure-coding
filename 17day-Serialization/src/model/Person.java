package model;

import java.io.Serializable;
/*
 * Serializable interface�� implements �ؾ߸� ����ȭ ������ ��ü�� �ȴ�.
 */
public class Person implements Serializable {
	/**
	 *  serialVersionUID : class�� ����, Ŭ���� ������ ����Ѵ�.
	 *  					��ü ����ȭ�� ������ȭ�� ȣȯ���� ���� ����Ѵ�.
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
