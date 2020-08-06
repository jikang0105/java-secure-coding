package step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1 대 1 서버, 클라이언트 프로그램
 * 서버는 클라이언트의 메세지를 입력받아 자신의 콘솔에 출력하고(ip + message)
 * 그 메세지를 다시 클라이언트로 출력(*server*)하는 작업을 지속적으로 수행한다.
 * 
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null; // 클라이언트로부터 입력받는 스트림
		PrintWriter pw = null; // 클라이언트에 출력하는 스트림
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("** step3.EchoServer 서버실행**");
			socket = serverSocket.accept(); // 대기하다가 클라이언트가 접속하면 실행, Socket을 반환한다.
			String user = socket.getInetAddress().toString();
			System.out.println("**" + user + " 클라이언트가 접속함**");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			while(true) {
				String message = br.readLine();
				System.out.println(user + "님의 메세지 : " + message);
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
