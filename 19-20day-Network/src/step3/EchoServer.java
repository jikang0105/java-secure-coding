package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1 �� 1 ����, Ŭ���̾�Ʈ ���α׷�
 * ������ Ŭ���̾�Ʈ�� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����ϰ�(ip + message)
 * �� �޼����� �ٽ� Ŭ���̾�Ʈ�� ���(*server*)�ϴ� �۾��� ���������� �����Ѵ�.
 * 
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("** step3.EchoServer ��������**");
			socket = serverSocket.accept();
			System.out.println("**" + socket.getInetAddress() + " Ŭ���̾�Ʈ�� ������**");
			while(true) {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String message = br.readLine();
				if(message.contentEquals("����")) {
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
					socket.close();
					serverSocket.close();					
				}
				String info = socket.getInetAddress() + "�� �޼��� : " + message;
				System.out.println(info);
					
				OutputStream os = socket.getOutputStream();
				pw = new PrintWriter(os, true);
				pw.println(message);
			}			
		} finally {
			if(socket != null) {
				socket.close();
			}
			if(serverSocket != null) {
				serverSocket.close();
			}
		}
	}
	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
