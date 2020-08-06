package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null; // ��ǥ��ȭ
		Socket socket = null; // ������ȭ
		BufferedReader br = null; // ������ȭ ��ȭ��
		PrintWriter pw = null; // ������ȭ ��ȭ��
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("���� ���� - Client ���� ���");
			socket = serverSocket.accept(); // Ŭ���̾�Ʈ�� �����ϸ� ( Ŭ���̾�Ʈ ���� �����Ǹ� )
			// accept()�� ���� ��ȭ(�Ϲ� Socket)�� �����Ѵ�. 
			System.out.println(socket.getInetAddress() + "�� �����߽��ϴ�.");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true); // true autoflush
			while(true) {
				String message = br.readLine();
				if(message == null || message.contentEquals("null") || message.trim().contentEquals("��������")) {
					System.out.println("**server �����մϴ�**");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + message);
				if(message == null || message.contentEquals("null") || message.trim().contentEquals("����")) {
					System.out.println("**Ŭ���̾�Ʈ�� ������ �������ϴ�.**");
					System.out.println("**���� ���� - Client ���� ���**");
					socket = serverSocket.accept(); // Ŭ���̾�Ʈ�� �����ϸ� ( Ŭ���̾�Ʈ ���� �����Ǹ� )
					System.out.println("**" + socket.getInetAddress() + "�� �����߽��ϴ�.**");
					br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // ���ο� Ŭ���̾�Ʈ���Դ� ���Ӱ� �ʱ�ȭ���־�� ��.
					pw = new PrintWriter(socket.getOutputStream(),true); // true autoflush
				} else {
				pw.println(message + "*server*"); // autoflush�̹Ƿ� �ٷ� ���
				}
			} // while
			
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
			new TestServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
