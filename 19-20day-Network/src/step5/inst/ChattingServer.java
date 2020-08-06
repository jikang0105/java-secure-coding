package step5.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * 		class ChattingServer{
 * 			// client�� ����ϴ� ��ü�� ����Ʈ�� ����
 * 			private ArrayList<ServerWorker> list = new ArrayList<serverWorker>();
 * 			public void go(){
 * 				accept() -> ServerWorker(socket) -> list�� �߰� -> Thread -> start
 * 			}
 * 			main()
 * 			public void broadcast(String message){
 * 				for loop -> println
 * 			}
 * 			class ServeWorker implements Runnable{
 * 				Socket socket;
 * 				ServerWorker(Socket socket){
 * 					this. socket = socket;
 *				}
 * 				public void run(){} -> finally���� list�� list.remove(this);
 * 				public void chatting(){
 * 					// Ŭ���̾�Ʈ �޼����� �Է¹޾� ������ ��� Ŭ���̾�Ʈ���� �޼����� ������
 * 				}
 * 		}
 */
public class ChattingServer {
	// ������ Ŭ���̾�Ʈ�� ����� ServerWorker ��ü���� ����� ����Ʈ
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
		
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("���� ���� - Client ���� ���");
			while(true) {
			Socket socket = serverSocket.accept();
			ServerWorker serverWorker = new ServerWorker(socket);
			list.add(serverWorker);
			new Thread(serverWorker).start();
			} 
		} finally {
			if(serverSocket != null) {
				serverSocket.close();
			} 
		} 
	}
	
	// ������ ��� Ŭ���̾�Ʈ���� �޼����� ���
	public void broadcast(String message) {
		for(int i = 0; i < list.size(); i++) {
			//new PrintWriter(list.get(i).socket.getOutputStream()).println(message);
			list.get(i).pw.println(message);
		}
	}
	
	public static void main(String[] args) {
		try {
			new ChattingServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//inner class
	class ServerWorker implements Runnable{
		private Socket socket = null;
		private BufferedReader br = null;
		private PrintWriter pw = null;
		private String clientIp;
		
		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
			clientIp = socket.getInetAddress().toString();
		}
		
		public void chatting() throws IOException {
				System.out.println("**" + clientIp + "���� ������." );
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream(),true);
				while(true) {					
				String message = br.readLine();
				if(message == null || message.equals("null") || message.contentEquals("����")) {
					break;
				}
				//System.out.println(clientIp + "���� ���� �޼��� : " + message);
				//pw.println(message + "*server*");
				broadcast(message);
			} 
		} 
		
		public void run() {
			try {
				chatting();
			} catch(IOException e) {
				System.out.println(clientIp + "���� ä���� ������.");
			} finally {
				list.remove(this);
				System.out.println(clientIp + "���� ä���� ������.");
				broadcast(clientIp + "���� ä���� ������.");
				if(socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} 
			}
		}
		
	} // class
} // outer class
