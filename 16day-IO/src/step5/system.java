package step5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class system {

	public static void printMenu(String path) throws IOException {
		// ���Ͽ� ����Ǿ� �Է¹޴� ��彺Ʈ��
		FileReader fr = new FileReader(path);
		// ������ ������ �Է¹޴� ���μ��� ��Ʈ��
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
