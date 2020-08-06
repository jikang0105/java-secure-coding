package step1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		
		PrintWriter pw = null;
		try {
			serverSocket = new ServerSocket(5432); // 대표전화 역할
			Socket socket = null;
			System.out.println("**서버 실행**");
			while(true) {
				try {
				// 클라이언트 접속을 대기하다가 클라이언트가 접속하면 실행된다, 일반소켓을 반환한다.
				socket = serverSocket.accept();
				// 접속한 클라이언트 아이피 반환
				System.out.println("**" + socket.getInetAddress()+" 클라이언트가 접속함**");
				// 클라이언트에게 데이터를 전송하기 위해 노드스트림을 반환받는다.
				OutputStream os = socket.getOutputStream();
				pw = new PrintWriter(os);
				pw.println("방가방가");
				} finally {
					if(pw != null){
						pw.close();
					}
					if(socket != null) {
						socket.close();
						}
				}
			} // while
		} finally {
			if(pw != null){
				pw.close();
			}			
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
