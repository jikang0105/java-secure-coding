package step2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class DataService {
	/**
	 * type A 유형은 TreeSet 이 반환되고
	 * type B 유형은 ArrayList 가 반환된다
	 * 다양한 자료규조체가 반환되지만 Collection 인터페이스의
	 * 하위 구현체이므로 Collection 타입으로 반환하면 된다.
	 * @param type
	 * @return
	 */
	public Collection<String> searchData(String type) {
		Collection<String> collection = null;
		if(type.equals("A")) {
			collection = new TreeSet<String>();
			collection.add("짜장면");
			collection.add("짬뽕");
		} else if(type.equals("B")) {
			collection = new ArrayList<String>();
			collection.add("소나타");
			collection.add("모닝");
		}
		return collection;
	}
}
