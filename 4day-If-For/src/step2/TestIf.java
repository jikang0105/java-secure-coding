package step2;

public class TestIf {
	public static void main(String[] args) {
		int age = 19;
		if(age > 18) { // 18���� �ʰ��ϴ� ���
			System.out.println(age + "���� �����Դϴ�.");
		}else if(age > 13){
			System.out.println(age + "���� û�ҳ��Դϴ�.");
		}else {
			System.out.println(age + "���� �̼������Դϴ�.");
		}//else
	}//main
}// class
