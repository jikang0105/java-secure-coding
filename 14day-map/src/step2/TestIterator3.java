package step2;

import java.util.Collection;
import java.util.Iterator;

public class TestIterator3 {
	public static void main(String[] args) {
		DataService service = new DataService();
		String type = "A";
		// Iterator 를 이용하면 다양한 컬렉션 하위 객체들이 반환되어도
		// 동일한 방법으로 요소들을 열거할 수 있다.
		Collection<String> col = service.searchData(type);
		Iterator<String> it = col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		type = "B";
		col = service.searchData(type);
		it = col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
