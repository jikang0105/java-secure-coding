package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Person;

public class TestObjectOutput {
	public static void main(String[] args) {
		String savePath="C:\\kosta203\\iotest\\person.obj";
		try {
			// 노드스트림 : 장치에 연결, FileOutputStream은 파일에 연결되는 노드스트림
			FileOutputStream fos = new FileOutputStream(savePath);
			// ProcessingStream 계열 : ObjectOutputStream 은 객체 직렬화를 지원
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person p = new Person("아이유", "판교", "javaking");
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
