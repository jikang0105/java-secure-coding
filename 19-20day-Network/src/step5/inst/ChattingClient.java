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
 * 			ä��Ŭ���̾�Ʈ
 * 			ChattingClient�� go()�޼���� ������ �����ϰ� ��ĳ�ʿ� �� ��Ʈ���� �����Ѵ�
 * 			���� ģ������ �޼����� �Է¹޴� �����带 �����Ͽ� start ��Ų��(���󽺷���)
 * 			��ĳ�ʷκ��� �����͸� �Է¹޾� ������ ����ϴ� �۾��� �����Ѵ�.
 * 
 *  		ģ������ �޼����� �Է¹޾� �ֿܼ� ����ϴ� ������
 *  		ReceiverWorker Thread�� �����Ѵ�.
 */
public class ChattingClient {
	private Socket socket;
	private Scanner scanner;
	private PrintWriter pw;
	private BufferedReader br;
	
	public void go() throws UnknownHostException, IOException {
		try {
		socket = new Socket(IP.INST, 5432);
		System.out.println("Server �� ������");
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
			if(message == null || message.contentEquals("null") || message.trim().contentEquals("����")) {
				System.out.println("**Ŭ���̾�Ʈ ���α׷��� �����մϴ�**");
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
	// �������� ���� �޼����� �Է¹޴� ������
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
