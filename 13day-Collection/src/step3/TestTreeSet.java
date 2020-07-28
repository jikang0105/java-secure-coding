package step3;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		// <String> -> Generic , Set�� �߰��� ����� Ÿ���� ����ϴ� ���� �����Ѵ�.
		TreeSet <String> set = new TreeSet();
		set.add("��ö");
		set.add("���ػ�");
		set.add("������");
		set.add("��ö");// �ߺ��� �������� ����.
		set.add("��ö");// �ߺ��� �������� ����
		System.out.println(set.size()); // 3
		// TreeSet�� Ư¡�� ���ı���� ����Ǿ��ִ�.
		System.out.println(set); // toString()�� �������̵��Ǿ� ���� ��Ҹ� ����Ѵ�.
		// Generic Test
		//TreeSet set2 = new TreeSet();
		//set2.add("a");
		//set2.add(1);
		// System.out.println(set2); // �Է��ϴ°��� ������ ������ ����ϴ� �������� �ڷ����� �޶�
		// ���Ŀ� ������ ���� error�� �߻��Ѵ�.
		
		TreeSet<Integer> setInt = new TreeSet();
		setInt.add(1);
		setInt.add(2);
		System.out.println(setInt);
	}
}
