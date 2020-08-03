package step6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class TestIOService2 {
	public static void main(String[] args) {
		String path="C:\\kosta203\\iotest3\\test.txt";
		IOService service = new IOService();
		ArrayList<String> list;
		try {
			list = service.readFile(path);
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
