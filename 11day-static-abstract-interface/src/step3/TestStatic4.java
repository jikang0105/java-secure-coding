package step3;

class Fish{
	// Object�� member�� ��ü ������ heap ������ ���� ��ü ������
	// ���Ӱ� ���� �ʱ�ȭ�ȴ�.
		int count;
	// ���� ù ������ class loading �� static�� �ʱ�ȭ�ȴ�.
	static int sCount;
	Fish(){
		count++;
		sCount++;
	}
}

public class TestStatic4 {
	public static void main(String[] args) {
		Fish f1 = new Fish();
		System.out.println(f1.count);
		System.out.println(f1.sCount);
		System.out.println(Fish.sCount);
		Fish f2 = new Fish();
		System.out.println(f2.count);
		System.out.println(f2.sCount);
		System.out.println(Fish.sCount);
		System.out.println(f1.sCount);
		Fish f3 = new Fish();
		System.out.println(f3.count);
		System.out.println(f3.sCount);
		System.out.println(Fish.sCount);
		System.out.println(f2.sCount);
		System.out.println(f1.sCount);
	}

}
