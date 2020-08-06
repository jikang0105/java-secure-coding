package step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/*
 *  스캐너로 입력받아 서버로 출력
 *  서버에서 보낸 메세지를 입력받아 콘솔에 출력
 *  위 두 작업을 지속적으로 진행한다.
 */
public class EchoClient {
	
	public void go() throws UnknownHostException, IOException {
		Socket socket = null; // 서버와 통신할 소켓
		Scanner scanner = null; // 콘솔에서 입력받을 객체
		PrintWriter pw = null; // 콘솔에서 입력받은 메세지를 서버에 출력하는 스트림
		BufferedReader br = null; // 서버에서 입력받을 스트림
		try {
			socket = new Socket(IP.LOCAL, 5432);
			scanner = new Scanner(System.in);
			System.out.println("**EchoClient가 서버에 접속**");
			pw = new PrintWriter(socket.getOutputStream(), true); // autoflush
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){ // 콘솔에서 입력받아 서버에 출력하고 서버에서 입력받아 콘솔에 출력한다.
				System.out.print("서버에 보낼 메세지 : ");
				String message = scanner.nextLine();
				pw.println(message);
				System.out.println("**전송완료**");
				String result = br.readLine();
				System.out.println("서버에서 입력받은 메세지 : " + result);
			}
		} finally {
			if(scanner != null) {
				scanner.close();
			}
//			if(pw != null) {
//				pw.close();  // autoflush를 부여한 상태이며 소켓을 close할때 함께 끊어지므로 없어도 무방하다.
//			}
			if(socket != null) {
				socket.close();
			}
		} // finally
	} // go method
	
	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
