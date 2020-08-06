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
	 * ������ Ŭ���̾�Ʈ�� ���������� ����Ѵ�.
	 * �Է¹޾� �ٽ� ����ϰ� ����޼����� ���� 
	 * close �۾� ���� �� run() �޼��� ���� - > ������ ����
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
		System.out.println(user + "�� ����");
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream(),true);
		while(true){
			try {
			String message = br.readLine();
			if(message == null || message.contentEquals("null") || message.trim().contentEquals("����")) {
				System.out.println("**Ŭ���̾�Ʈ �α׾ƿ�**");
				break;
			}
			System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + message);
			pw.println(message + "*server*");
			} catch(Exception e) {
				System.out.println("**" + user + "�� �α׾ƿ�**");
				break;
			}
		}
	}
}
