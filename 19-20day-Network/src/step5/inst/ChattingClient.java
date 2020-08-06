package step5.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/*
 * 			채팅클라이언트
 * 			ChattingClient의 go()메서드는 소켓을 생성하고 스캐너와 각 스트림을 생성한다
 * 			또한 친구들의 메세지를 입력받는 스레드를 생성하여 start 시킨다(데몬스레드)
 * 			스캐너로부터 데이터를 입력받아 서버에 출력하는 작업을 지속한다.
 * 
 *  		친구들의 메세지를 입력받아 콘솔에 출력하는 역할은
 *  		ReceiverWorker Thread가 전담한다.
 */
public class ChattingClient {
	private Socket socket;
	private Scanner scanner;
	private PrintWriter pw;
	private BufferedReader br;
	
	public void go() throws UnknownHostException, IOException {
		try {
		socket = new Socket(IP.INST, 5432);
		System.out.println("Server 에 접속함");
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream(), true);
		scanner = new Scanner(System.in);
		
		ReceiverWorker worker = new ReceiverWorker();
		Thread thread = new Thread(worker);
		thread.setDaemon(true);
		thread.start();
				
		while(true) {
			String message = scanner.nextLine();
			pw.println(message);
			if(message == null || message.contentEquals("null") || message.trim().contentEquals("종료")) {
				System.out.println("**클라이언트 프로그램을 종료합니다**");
				break;
			}
		}
		} finally {
			closeAll();
		}
	}	
		public void closeAll() throws IOException {
			if(scanner != null) {
				scanner.close();
			}
			if(socket != null) {
				socket.close();
			}
		}
	

	public static void main(String[] args) {
		try {
			new ChattingClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	// inner class
	// 서버에서 오는 메세지를 입력받는 스레드
	class ReceiverWorker implements Runnable{
		public void run() {
			try {
				receive();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // run
		public void receive() throws IOException {
			while(true) {
				String message = br.readLine();
				if(message == null) {
					break;
				}
				System.out.println(message);
			}
		}//receive method
		
	}//inner class
}//class
