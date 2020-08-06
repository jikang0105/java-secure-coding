package step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		BufferedReader br = null; // Ŭ���̾�Ʈ�κ��� �Է¹޴� ��Ʈ��
		PrintWriter pw = null; // Ŭ���̾�Ʈ�� ����ϴ� ��Ʈ��
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("** step3.EchoServer ��������**");
			socket = serverSocket.accept(); // ����ϴٰ� Ŭ���̾�Ʈ�� �����ϸ� ����, Socket�� ��ȯ�Ѵ�.
			String user = socket.getInetAddress().toString();
			System.out.println("**" + user + " Ŭ���̾�Ʈ�� ������**");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			while(true) {
				String message = br.readLine();
				System.out.println(user + "���� �޼��� : " + message);
				pw.println(message + "*server*");
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
