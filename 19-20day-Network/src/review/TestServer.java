package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null; // 대표전화
		Socket socket = null; // 직원전화
		BufferedReader br = null; // 직원전화 수화기
		PrintWriter pw = null; // 직원전화 송화기
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("서버 실행 - Client 접속 대기");
			socket = serverSocket.accept(); // 클라이언트가 접속하면 ( 클라이언트 소켓 생성되면 )
			// accept()는 직원 전화(일반 Socket)를 리턴한다. 
			System.out.println(socket.getInetAddress() + "님 접속했습니다.");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true); // true autoflush
			while(true) {
				String message = br.readLine();
				if(message == null || message.contentEquals("null") || message.trim().contentEquals("서버종료")) {
					System.out.println("**server 종료합니다**");
					break;
				}
				System.out.println("클라이언트가 보낸 메세지 : " + message);
				if(message == null || message.contentEquals("null") || message.trim().contentEquals("종료")) {
					System.out.println("**클라이언트가 서버를 나갔습니다.**");
					System.out.println("**서버 실행 - Client 접속 대기**");
					socket = serverSocket.accept(); // 클라이언트가 접속하면 ( 클라이언트 소켓 생성되면 )
					System.out.println("**" + socket.getInetAddress() + "님 접속했습니다.**");
					br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 새로운 클라이언트에게는 새롭게 초기화해주어야 함.
					pw = new PrintWriter(socket.getOutputStream(),true); // true autoflush
				} else {
				pw.println(message + "*server*"); // autoflush이므로 바로 출력
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
