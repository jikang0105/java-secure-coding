package step3;

import java.io.FileNotFoundException;
import java.io.FileReader;

class MemoService{
	public String readMemo(String filePath) throws FileNotFoundException {
		try {
		FileReader fr = new FileReader(filePath);
		System.out.println("존재하는 파일이므로 입력작업수행");
		} finally {
			System.out.println("finally"); // 예외 발생 여부 및 처리와 상관없이 항상 실행
		}
		return filePath + " 읽은 데이터";
	}
}
public class TestThrows1 {
	public static void main(String[] args) {
		MemoService service = new MemoService();
		String filePath= "C:\\kosta203\\a.txt";
		// filePath= "C:\\kosta203\\b.txt";
		try {
			System.out.println(service.readMemo(filePath));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
