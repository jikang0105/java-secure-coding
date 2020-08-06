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
 *  ��ĳ�ʷ� �Է¹޾� ������ ���
 *  �������� ���� �޼����� �Է¹޾� �ֿܼ� ���
 *  �� �� �۾��� ���������� �����Ѵ�.
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
			System.out.println("**EchoClient�� ������ ����**");
			pw = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){
				System.out.print("������ ���� �޼���('����'�� �Է��� ��� ���α׷��� ����˴ϴ�.) : ");
				String message = scanner.nextLine();
				pw.println(message);
				System.out.println("**���ۿϷ�**");
				String serverReturn = br.readLine();
				if(serverReturn == ("null")) {
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
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
