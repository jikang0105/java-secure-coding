package step2;
/*
 *  ��ü ���� �ʱ�ȭ �ܰ踦 �����ϴ� ����
 */
public class TestObjectInit {
	public static void main(String[] args) {
		/*	Car : Ŭ���������� ������ ������ Ÿ��
		 * 	car : ���� ( �������� , �������� )
		 * 	= : �Ҵ� �Ǵ� ����
		 *	new : �ڹ� �����
		 *	Car() : ������ Constructor
		 */
		Car car = new Car();
		// flag �� �����̹Ƿ� �⺻������ false�� �ʱ�ȭ�ȴ�.
		System.out.println(car.isFlag());
		// price �� �Ǽ����̹Ƿ� �⺻������ 0.0���� �ʱ�ȭ �ȴ�.
		System.out.println(car.getPrice());
		// model �� �������̹Ƿ� �⺻������ null�� �ʱ�ȭ �ȴ�.
		System.out.println(car.getModel());
	}
}
