package step6;

import java.util.ArrayList;

public class TestArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Á¤ÁöÀ±");
		list.add("ÀÌÈ«Àç");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.size());
		list.add(2, "°­ÁöÈÆ");
		System.out.println(list);
		String name = list.remove(1);
		System.out.println(name+" ¿ä¼Ò¸¦ »èÁ¦");
		System.out.println(list);
		System.out.println(list.get(1));
	}
}
