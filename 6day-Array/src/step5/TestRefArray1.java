package step5;
// ������ ������
public class TestRefArray1 {
	public static void main(String[] args) {
		Person p[];
		p = new Person[3]; // �迭 ����
		// �迭 ù��° �濡 ������ 28 ��ü�� ����
		p[0]=new Person("������", 28);
		// �迭 ù��° ����� Person ��ü�� �̸��� ���
		System.out.println(p[0].getName());
		p[1] = new Person("�����", 34);
		p[2] = new Person("�˼���", 22);
		System.out.println("**�迭 ����� name�� ��� ���");
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName());
		}
	}
}
