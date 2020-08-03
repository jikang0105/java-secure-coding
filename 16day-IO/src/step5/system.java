package step5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class system {

	public static void printMenu(String path) throws IOException {
		// 파일에 연결되어 입력받는 노드스트림
		FileReader fr = new FileReader(path);
		// 파일의 정보를 입력받는 프로세스 스트림
		BufferedReader br = new BufferedReader(fr);
//		String str2;
//		while((str2 = br.readLine())!=null) {
//			System.out.println(str2);
		while(br.ready()) {
			System.out.println(br.readLine());
		}
		br.close();
	}

}
