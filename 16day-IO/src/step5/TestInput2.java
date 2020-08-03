package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput2 {
	public static void main(String[] args) {
		String path = "C:" + File.separator + "kosta203" + File.separator + "iotest2" + File.separator + "order.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			// ready() : boolean, readLine() : String
			while(br.ready()) {
				System.out.println(br.readLine());
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
