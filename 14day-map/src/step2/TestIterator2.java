package step2;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("카스");
		list.add("하이네켄");
		Iterator<String> it = list.iterator();
		/*
		 * System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.next());
		 */
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
