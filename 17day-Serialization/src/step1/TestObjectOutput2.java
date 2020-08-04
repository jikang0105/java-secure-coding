package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Person2;

public class TestObjectOutput2 {
	public static void main(String[] args) {
		String savePath="C:\\kosta203\\iotest\\person2.obj";
		try {
			FileOutputStream fos = new FileOutputStream(savePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person2 p = new Person2("아이유", "판교", "javaking");
			oos.writeObject(p);
			System.out.println("**객체 직렬화하여 파일에 Person 객체저장**");
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
}
}
