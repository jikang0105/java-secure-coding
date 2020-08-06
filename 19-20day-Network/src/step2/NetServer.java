package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  ������ Ŭ���̾�Ʈ ���� ����ϴٰ� �����ؼ� �޼����� �����ϸ�
 *  �� �޼����� �ڽ��� �ֿܼ� ip�� �Բ� ����ϰ� �ٽ� ����Ѵ�.
 */
public class NetServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("** step2.NetServer ��������**");
			while(true) {
				Socket socket = null;
				BufferedReader br = null;
				try {
				socket = serverSocket.accept();
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String info = socket.getInetAddress() + "���� �޼��� : " + br.readLine();
				System.out.println(info);
				} finally {
					if(socket != null) {
						socket.close(); //  ���ϸ� ��� ����� br�� ���� ��������.
					}
				}
			}
		} finally {
			if(serverSocket != null) {
				serverSocket.close();
			}
		}
	}
	public static void main(String[] args) {
		try {
			new NetServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
