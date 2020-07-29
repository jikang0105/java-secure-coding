package step3;

import java.util.Scanner;

// Exception ���� keyword ��ü�� �̿��� ���α׷��� �ۼ��ϰ�
// �������� �����غ��� ����
class DayException extends Exception{
	DayException(String message){
		super(message);
	}
}
class DateService{
	public void register(int day) throws DayException {
		try {
			if(day < 1 || day > 31) {
				throw new DayException("k");
			}
			System.out.println("b");
		} finally {
			System.out.println("a");
		}
	} // method
} // class

public class TestThrows4 {
	public static void main(String[] args) {
		DateService service = new DateService();
		
		Scanner s = new Scanner(System.in);
		System.out.print("��¥�� �Է��ϼ��� : ");
		int day=s.nextInt();
		
		try {
		service.register(day);
		System.out.println("c");
		}catch (DayException e) {
			System.out.println(e.getMessage());
		}
	}
}
