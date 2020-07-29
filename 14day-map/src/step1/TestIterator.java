package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Iterator interface : 반복 열거 표준 인터페이스
 */
public class TestIterator {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		
		c1.add("참이슬");
		c1.add("처음처럼");
		Iterator<String> it = c1.iterator();
		while(it.hasNext()) { // hasNext() : 다음요소가 존재하면 true
			System.out.println(it.next());
		}
		System.out.println("*****************************");
		Collection<String> c2 = new LinkedHashSet<String>();
		c2.add("카스");
		c2.add("클라우드");
		// c2에 있는 요소들을 Iterator 방식으로 반복 열거해본다
		Iterator<String> it2 = c2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		// 위와 같이 Set 계열 구현체(LinkedHashSet)이든
		// 아니면 List 계열 구현체이든 관계없이
		// Collection Interface의 하위이므로
		// 같은 방식 ( Iterator interface ) 으로 반복 열거가 가능하다.
	}
}
