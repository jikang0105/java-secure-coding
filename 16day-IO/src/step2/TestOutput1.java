package step2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// 출력스트림을 이용해 파일을 생성하고 데이터를 출력하는 예제
public class TestOutput1 {
	public static void main(String[] args) {
		File dir = new File("C:\\kosta203\\iotest");
		// 디렉토리를 생성, 존재하면 생성하지 않는다.
		boolean result = dir.mkdirs();
		System.out.println("디렉토리 생성" + result);
		try {
			// Node Stream 계열 : 파일이 없으면 생성하고 파일에 연결되는 스트림
			FileWriter fw = new FileWriter("C:\\kosta203\\iotest\\test1.txt", true);
			// Processing Stream 계열 : 다양한 기능을 지원한다.
			PrintWriter pw = new PrintWriter(fw);
			pw.println("안녕IO");
			pw.close();
			System.out.println("파일에 출력!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
