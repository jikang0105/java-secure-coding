package step3;

import java.util.HashMap;

class Person{
	private String name;
	private String address;
	public Person(String name, String address) {
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
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
}
public class TestMap1 {
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("a", new Person("정재우", "하와이"));
		System.out.println(map.size());
		System.out.println(map);
		map.put("b", new Person("정세희", "제주도"));
		Person p = map.get("a"); // key로 검색해서 value를 찾는다
		System.out.println(p);
		System.out.println(map.get("c")); // 존재하지 않는 key로 조회하면 null
		// 같은 key로 추가할 경우
		map.put("a", new Person("양성식", "울릉도"));
		System.out.println(map.get("a"));
		// key가 존재하는지 확인하는 방법
		System.out.println(map.containsKey("a")); // true or false로 반환된다.
		System.out.println(map.containsKey("g"));
		System.out.println(map.remove("a")); // 삭제후 삭제정보가 반환
		System.out.println(map);
		map.clear(); // 모두 삭제한다.
		System.out.println(map);
	}
}
