package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput1 {
	public static void main(String[] args) {
		String path = "C:" + File.separator + "kosta203" + File.separator + "iotest2" + File.separator + "order.txt";
		// ���Ϸκ��� ������ �Է¹޴� ��Ʈ�� ����
		try {			
			system.printMenu(path);
			/*
			 * System.out.println(br.readLine()); System.out.println(br.readLine());
			 * System.out.println(br.readLine()); System.out.println(br.readLine());
			 *  ������ null
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
