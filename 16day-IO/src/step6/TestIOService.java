package step6;

import java.io.IOException;
import java.util.ArrayList;

public class TestIOService {
	public static void main(String[] args) {
		String path="C:\\kosta203\\iotest3\\test.txt";
		IOService service = new IOService();
		ArrayList<String> list = new ArrayList<String>();
		list.add("노가리"); list.add("참치"); list.add("삼겹살");
		// try
		try {
		service.saveFile(path, list);
		System.out.println(path+"파일에 리스트 저장");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
