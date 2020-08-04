package step1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Person2;

public class TestObjectInput2 {
	public static void main(String[] args) {
		String savePath = "C:\\kosta203\\iotest\\person2.obj";
		try {
			FileInputStream fis = new FileInputStream(savePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Object 타입으로 반환되므로 객체 캐스팅을 이용해서 정보를 확인한다.
			Person2 p =(Person2)ois.readObject();
			System.out.println(p.getName());
			System.out.println(p.getAddress());
			// password는 transient modifier가 지정되어있어 직렬화 대상에서
			// 제외되었으므로 null이 반환된다.
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
