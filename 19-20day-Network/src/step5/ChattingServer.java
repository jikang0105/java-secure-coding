package step5;

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
	ServerSocket serverSocket = null;
	ServerWorker sw = null;
	
	
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void broadcast(String message) throws IOException {
		for(int i = 0; i < list.size(); i++) {
			new PrintWriter(list.get(i).socket.getOutputStream()).println(message);
		}
	}
	public void go() throws IOException {
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("���� ���� - Client ���� ���");
			while(true) {
			Socket socket = serverSocket.accept();
			sw = new ServerWorker(socket);
			new Thread(sw).start();
			}
		} finally {
			if(serverSocket != null) {
				serverSocket.close();
			}
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
		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
		}
		public void chatting() throws IOException {
			while(true) {
				
				String user = socket.getInetAddress().toString();
				System.out.println("**" + user + "���� ������." );
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String message = br.readLine();
				System.out.println(user + "���� ���� �޼��� : " + message);
				pw.println(message + "*server*");
				broadcast(message + "*server*");
			}
		}
		public void run() {
			try {
				chatting();
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
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
