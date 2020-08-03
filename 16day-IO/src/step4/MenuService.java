package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {
	public void order(String path) throws IOException  {
		Scanner s = new Scanner(System.in); // 콘솔에 입력되는 스트림
		// 파일에 출력할 스트림
		PrintWriter pw = new PrintWriter( new FileWriter(path), true); // true : autoflush (즉시출력)
		System.out.println("**점심메뉴**");
		// 주문 끝 메세지가 입력될 때까지 계속 반복한다.
		while(true) {
			System.out.println("메뉴를 입력하세요. (주문 종료를 입력하면 주문을 저장하고 종료합니다.)");
			String menu = s.nextLine();
			if(menu.equals("주문 종료")) {
				break;
			}
			pw.println(menu);
		}
		System.out.println("**주문완료**");
		System.out.println(path+"에 주문목록이 저장되었습니다.");
		s.close();
		pw.close();
		
	}
}
