package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/*
 * 클라이언트는 서버에 접속해서 데이터를 전송하고 종료한다.
 * Scanner 적용해서 콘솔에서 서베에 보낼 메세지를 입력받아 서버로 출력한다.
 */


public class NetClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		PrintWriter pw = null;
		Scanner scanner = null;

		//while(true){
			try {
				scanner = new Scanner(System.in);
				socket = new Socket(IP.LOCAL, 5432);
				pw = new PrintWriter(socket.getOutputStream(), true); // true : autoflush
				String message = scanner.nextLine();
				pw.println(message);
				System.out.println("**서버에 접속해서 메세지 전송**" + message);
			} finally {
				if(scanner != null) {
					scanner.close();
				}
				if(pw != null) {
					pw.close();
				}
				if(socket != null) {
					socket.close();
				}
			}
		//}

	}
	public static void main(String[] args) {
		try {
			new NetClient().go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
