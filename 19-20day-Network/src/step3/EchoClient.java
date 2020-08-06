package step3;

import java.io.BufferedReader;
import java.io.IOException;
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
		Socket socket = null;
		Scanner scanner = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			scanner = new Scanner(System.in);
			socket = new Socket(IP.LOCAL, 5432);
			System.out.println("**EchoClient가 서버에 접속**");
			pw = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){
				System.out.print("서버에 보낼 메세지('종료'를 입력할 경우 프로그램이 종료됩니다.) : ");
				String message = scanner.nextLine();
				pw.println(message);
				System.out.println("**전송완료**");
				String serverReturn = br.readLine();
				if(serverReturn == ("null")) {
					System.out.println("프로그램이 종료되었습니다.");
					scanner.close();
					socket.close();
				}
				System.out.println(serverReturn + "*server*");
			}
		} finally {
			if(scanner != null) {
				scanner.close();
			}
			if(socket != null) {
				socket.close();
			}
		}
	}
	
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
