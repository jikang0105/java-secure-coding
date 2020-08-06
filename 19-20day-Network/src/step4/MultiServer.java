package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  1 대 다 즉, 다수의 클라이언트에게 지속적으로 메아리 서비스하는 서버 
 */
public class MultiServer {
	/*
	 *  ServerSocket 생성
	 *  while loop
	 *  accept() : Socket 을 통해 접속대기
	 *  접속하면 Socket이 반환
	 *  ServerWorker Thread를 생성할 때 생성자에 해당 Socket을 할당
	 *  start()를 이용해 해당 스레드를 실행가능상태로 보낸다.
	 */
	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5432); 
		Socket socket = null;
		ServerWorker sw = null;
		
		try {
			System.out.println("서버 실행 - Client 접속 대기");
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
