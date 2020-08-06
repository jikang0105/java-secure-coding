package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("** step3.EchoServer 서버실행**");
			socket = serverSocket.accept();
			System.out.println("**" + socket.getInetAddress() + " 클라이언트가 접속함**");
			while(true) {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String message = br.readLine();
				if(message.contentEquals("종료")) {
					System.out.println("프로그램이 종료되었습니다.");
					socket.close();
					serverSocket.close();					
				}
				String info = socket.getInetAddress() + "님 메세지 : " + message;
				System.out.println(info);
					
				OutputStream os = socket.getOutputStream();
				pw = new PrintWriter(os, true);
				pw.println(message);
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
