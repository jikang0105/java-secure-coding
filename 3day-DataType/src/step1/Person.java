package step1;

/*
 * Encapsulation ���� Ŭ����
 * �ܺο� �������� ���� �κ��� private ���� �����ڸ� ���
 */
public class Person {

	private	String name;
	private int age = 1;
	//private int check = 0;
	
	// setter �� �ܺο��� ������ �Ҵ�ޱ� ���� �޼���
	public void setName(String name) {
		// this �����(keyword)�� �ν��Ͻ� ������ ����Ű�� ���Ͽ� ����Ѵ�.
		// this �� �̿��� �ν��Ͻ������� �Ű������� �����Ѵ�.
		this.name = name;
	}
	/*
	 *  �Ű����� age�� ���޵� ����
	 *  1�̸��� ��� '�߸��� �����̹Ƿ� �Ҵ��� �� �����ϴ�.'�� ����ϰ�
	 *  1 �̻��̸� ��ü�� �ν��Ͻ� ���� age�� �Ҵ��Ѵ�.
	 */
	public void setAge(int age) {
		//this.check = 0;
		if(age > 1) {
			this.age = age;
		} else {
		System.out.println("�߸��� �����̹Ƿ� �Ҵ��� �� �����ϴ�.");
		//this.check = 1;
		}
	}

	// getter �ܺο��� ������ ��ȯ�ޱ� ���� �޼���
	public String getName() {
		return name;
	}
	
	public int getAge() {
		//if(check == 1) {
		//	System.out.println("�߸��� �����̹Ƿ� ����� �� �����ϴ�.");
		//}else {
		return age;
		//}
	}

}
