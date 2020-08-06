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
			System.out.println("Client�� Server�� ������");
			scanner = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				System.out.print("������ ���� �޼��� : ");
				String message = scanner.nextLine();
				pw.println(message);
				if(message == null || message.contentEquals("null") || message.trim().contentEquals("����")) {
					System.out.println("**Ŭ���̾�Ʈ ���α׷��� �����մϴ�**");
					break;
				}
				if(message == null || message.contentEquals("null") || message.trim().contentEquals("��������")) {
					System.out.println("**��ü ���α׷��� �����մϴ�**");
					break;
				}
				String result = br.readLine();
				System.out.println("�������� ���� �޼��� :" + result);
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
