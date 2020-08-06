package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class TestClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		Scanner scanner = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			socket = new Socket(IP.INST, 5432);
			System.out.println("Client가 Server에 접속중");
			scanner = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				System.out.print("서버에 보낼 메세지 : ");
				String message = scanner.nextLine();
				pw.println(message);
				if(message == null || message.contentEquals("null") || message.trim().contentEquals("종료")) {
					System.out.println("**클라이언트 프로그램을 종료합니다**");
					break;
				}
				if(message == null || message.contentEquals("null") || message.trim().contentEquals("서버종료")) {
					System.out.println("**전체 프로그램을 종료합니다**");
					break;
				}
				String result = br.readLine();
				System.out.println("서버에서 받은 메세지 :" + result);
			}
		} finally {
			if(socket != null) {
				socket.close();
			}
			if(scanner != null) {
				scanner.close();
			}
		}
	}
	public static void main(String[] args) {
		try {
			new TestClient().go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
