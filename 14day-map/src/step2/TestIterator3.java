package step2;

import java.util.Collection;
import java.util.Iterator;

public class TestIterator3 {
	public static void main(String[] args) {
		DataService service = new DataService();
		String type = "A";
		// Iterator �� �̿��ϸ� �پ��� �÷��� ���� ��ü���� ��ȯ�Ǿ
		// ������ ������� ��ҵ��� ������ �� �ִ�.
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
