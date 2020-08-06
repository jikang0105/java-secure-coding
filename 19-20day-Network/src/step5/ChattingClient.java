package step5;

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
	ReceiverWorker rw = null;
	
	public void go() throws UnknownHostException, IOException {
		socket = new Socket(IP.LOCAL, 5432);
		
		System.out.println("Server�� ������");
		
		pw = new PrintWriter(socket.getOutputStream(), true);
		rw = new ReceiverWorker();
		new Thread(rw).start();
		
		while(true) {
			System.out.print("������ ���� �޼��� : ");
			String message = scanner.nextLine();
			pw.println(message);
			if(message == null || message.contentEquals("null") || message.trim().contentEquals("����")) {
				System.out.println("**Ŭ���̾�Ʈ ���α׷��� �����մϴ�**");
				break;
			}
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
	// �����κ��� ���� ģ������ �޼����� �Է¹޴� ������
	class ReceiverWorker implements Runnable{
		public void run() {
			try {
				receive();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void receive() throws IOException {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String result = br.readLine();
				System.out.println("�������� ���� �޼��� :" + result);
			}
		}//method
		
	}//class
}//class
