package step4;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		// 순서를 기억한다.
		LinkedHashMap<String, Product> map = new LinkedHashMap<String, Product>();
		Product p = new Product("1","카스","진로", 1500);
		map.put(p.getId(), p);
		Product p2 = new Product("2", "클라우드", "롯데", 1700);
		map.put(p2.getId(), p2);
		System.out.println(map);
		// 상품 아이디가 2인 상품의 name을 출력해보자. // 클라우드
		System.out.println(map.get("2").getName()); // 클라우드
		// 현재 map의 key들만 열거, 출력해본다.
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("****************************");
		// 현재 map의 value들만 출력해본다. map에는 values() 메서드가 있음
		/*
		 * Collection<Product> col = map.values();
		 * Iterator<Product> it2 = col.iterator();
		 */
		Iterator<Product> it2 = map.values().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}// main
}// class
