package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class ServerWorker implements Runnable {
	private Socket socket;
	
	BufferedReader br =null;
	PrintWriter pw = null;
	
	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}
	/* 
	 * 접속한 클라이언트와 지속적으로 통신한다.
	 * 입력받아 다시 출력하고 종료메세지가 오면 
	 * close 작업 수행 후 run() 메서드 종료 - > 스레드 종료
	 */
	@Override
	public void run() {
		try {
			echo();
		} catch (IOException e) {
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
	
	public void echo() throws IOException {
		String user = socket.getInetAddress().toString();
		System.out.println(user + "님 접속");
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream(),true);
		while(true){
			try {
			String message = br.readLine();
			if(message == null || message.contentEquals("null") || message.trim().contentEquals("종료")) {
				System.out.println("**클라이언트 로그아웃**");
				break;
			}
			System.out.println("클라이언트가 보낸 메세지 : " + message);
			pw.println(message + "*server*");
			} catch(Exception e) {
				System.out.println("**" + user + "님 로그아웃**");
				break;
			}
		}
	}
}
