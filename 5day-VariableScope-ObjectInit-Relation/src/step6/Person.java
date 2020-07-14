package step6;

public class Person {
	private String name;
	// SmartPhone 은 클래스 명이자 참조형 데이터 타입.
	private SmartPhone smartPhone;
	
	public Person(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	
}
