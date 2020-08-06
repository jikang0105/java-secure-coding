package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  1 �� �� ��, �ټ��� Ŭ���̾�Ʈ���� ���������� �޾Ƹ� �����ϴ� ���� 
 */
public class MultiServer {
	/*
	 *  ServerSocket ����
	 *  while loop
	 *  accept() : Socket �� ���� ���Ӵ��
	 *  �����ϸ� Socket�� ��ȯ
	 *  ServerWorker Thread�� ������ �� �����ڿ� �ش� Socket�� �Ҵ�
	 *  start()�� �̿��� �ش� �����带 ���డ�ɻ��·� ������.
	 */
	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5432); 
		Socket socket = null;
		ServerWorker sw = null;
		
		try {
			System.out.println("���� ���� - Client ���� ���");
			while(true) {
				socket = serverSocket.accept();
				sw = new ServerWorker(socket);
				new Thread(sw).start();
				
				
			} 
		}finally {
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
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
