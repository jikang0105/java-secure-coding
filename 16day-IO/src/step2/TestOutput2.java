package step2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class TestOutput2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("강상훈");
		list.add("양성식");
		list.add("정재우");
		// C:\\kosta203\\iotest\\friend.txt
		
		try {
			FileWriter fw = new FileWriter("C:\\kosta203\\iotest\\friend.txt");
			PrintWriter pw = new PrintWriter(fw);
			Iterator<String> it = list.iterator();
			while(it.hasNext()) {
				pw.println(it.next());
			}
			// for(int i = 0; i < list.size(); i++) {
			//		pw.println(list.get(i));
			//}
			pw.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
