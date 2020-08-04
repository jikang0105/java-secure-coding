package step1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Person;

public class TestObjectInput {
	public static void main(String[] args) {
		String savePath = "C:\\kosta203\\iotest\\person.obj";
		try {
			// NodeStream 계열 : FileInputStream 은 file에 연결
			FileInputStream fis = new FileInputStream(savePath);
			// ProcessingStream 계열 : ObjectInputStream 은 객체 역직렬화를 지원
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Object 타입으로 반환되므로 객체 캐스팅을 이용해서 정보를 확인한다.
			Person p =(Person)ois.readObject();
			System.out.println(p.getName());
			System.out.println(p.getAddress());
			System.out.println(p.getPassword());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
