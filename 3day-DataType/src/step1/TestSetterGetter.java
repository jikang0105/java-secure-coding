package step1;
/*
 * Encapsulation ����� Ŭ������ �׽�Ʈ�ϴ� ����
 * setter / getter �� Ȱ���غ���.
 */
public class TestSetterGetter{
	public static void main(String[] args) {
		// Person ��ü ����, ���������� p�� �Ѵ�.
		Person p = new Person();
		// p ��ü�� name�� �������� �Ҵ��غ���.
		// p.name = "������"; // name �� private �̹Ƿ� ���ٺҰ�
		// name �� �Ҵ��ϱ� ���ؼ��� setter �� setName �޼��带 �̿��Ѵ�.
		p.setName("������");
		// �Ҵ��� name�� ��ȯ�޾Ƽ� ����غ���.
		// �ּ�ó�� ����� ctrl + shift + /
		// �ּ�ó�� ���� ����Ű ctrl + shift + \
		/*String name = p.getName(); System.out.println(name); */
		// ���� �� ������ �� �������� ǥ���ϸ� �Ʒ��� ����.
		 System.out.println(p.getName()); 
		 System.out.println("******************************");
		 // �Ʒ� �ڵ忡 �����Ǵ� Person class �� ��Ҹ� �ڵ��غ���.
		 // 1. �ν��Ͻ� ����  2. setter  3. getter
		 // p.age = -11; private �̹Ƿ� ���� �Ұ�
		 // Person Class�� 
		 p.setAge(28);
		 System.out.println(p.getAge() + "��");//28
		 p.setAge(-28);
		 System.out.println(p.getAge() + "��");
	}
}