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
 * 			// client와 통신하는 객체를 리스트에 저장
 * 			private ArrayList<ServerWorker> list = new ArrayList<serverWorker>();
 * 			public void go(){
 * 				accept() -> ServerWorker(socket) -> list에 추가 -> Thread -> start
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
 * 				public void run(){} -> finally에서 list에 list.remove(this);
 * 				public void chatting(){
 * 					// 클라이언트 메세지를 입력받아 접속한 모든 클라이언트에게 메세지를 보낸다
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
			System.out.println("서버 실행 - Client 접속 대기");
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
				System.out.println("**" + user + "님이 접속함." );
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String message = br.readLine();
				System.out.println(user + "님이 보낸 메세지 : " + message);
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
