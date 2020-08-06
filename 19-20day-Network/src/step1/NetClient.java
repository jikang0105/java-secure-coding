package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br = null;
		try {
			socket = new Socket(IP.INST, 5432);
			System.out.println("**NetClient가 서버에 접속**");
			// 서버로부터 정보를 입력받기위해 스트림을 소켓으로부터 받는다.
			InputStream is = socket.getInputStream();
			// 8bit 스트림을 16bit 단위 스트림으로 변경하는 프로세스 스트림.
			InputStreamReader ir = new InputStreamReader(is);
			// 한 라인씩 읽는 기능을 제공하는 프로세스 스트림
			br = new BufferedReader(ir);
			System.out.println("서버가 보낸 메세지 : " + br.readLine());
		} finally {
			if(br != null) {
				br.close();
			}
			if(socket != null) {
			socket.close();
			}
			
		}
		
	}
	public static void main(String[] args) {
		try {
			new NetClient().go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
