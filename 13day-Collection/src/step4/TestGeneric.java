package step4;

import java.util.ArrayList;

class Car{
	String name;
	Car(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class TestGeneric {
public static void main(String[] args) {
	//�迭ó�� �������� ������ �����Ѵ�.
	/*
	ArrayList list = new ArrayList();
	list.add("���ڿ�");
	list.add(1);
	//ù��° ��Ҹ� ��ȯ������ Object down casting�� �ʿ��ϴ�.
	String s = (String)list.get(0);
	System.out.println(s.length());
	int i = (Integer)list.get(1);
	System.out.println(i);
	System.out.println(list);
	*/
	
	//ArrayList list = new ArrayList();
	//list.add(new Car("�ҳ�Ÿ"));
	// ù��° ��Ҹ� ��ȯ�޾� getModel()�� ȣ���� ����Ѵ�.
	//Car car = (Car)list.get(0);
	//System.out.println(car.getName());
	// jdk 1.6 ���� �̻󿡼��� Generic�� �߰��Ǿ� 
	// ��ü ĳ���� ������ �����ϰ� Ÿ���� �������� �����ϵ��� �Ѵ�.
	// �Ʒ��� ���� Generic�� ����ϱ⸦ �����Ѵ�.
	ArrayList<Car> list2 = new ArrayList<Car>();
	list2.add(new Car("�ҳ�Ÿ"));
	System.out.println(list2.get(0).getName());
}
}
