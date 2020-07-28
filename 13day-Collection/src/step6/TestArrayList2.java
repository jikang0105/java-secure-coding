package step6;

import java.util.ArrayList;

class Friend{
	private String name;
	private String address;
	private int money;
	public Friend(String name, String address, int money) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", address=" + address + ", money=" + money + "]";
	}
	
	
}

public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		list.add(new Friend("양성식", "춘천", 1000));
		list.add(new Friend("강상훈", "성남", 2000));
		list.add(new Friend("정재우", "춘천", 1500));
		// list의 요소 객체 중 address가 춘천인 친구의 이름을 모두 출력
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getAddress().equals("춘천")){
			System.out.println(list.get(i).getName());
			}
		}
		Friend f = list.remove(list.size()-1);
		System.out.println("삭제한 친구 정보 : " + f);
		//list의 요소를 모두 비운다
		list.clear();
		System.out.println(list);
		
	}
}
