package step7;

public class TeatAggregation2 {
	public static void main(String[] arg) {
		// �Ʒ��ڵ尡 ����ǵ��� �����ϴ� Ŭ�������� �����غ���.
		Student s = new Student("����������");
		System.out.println(s.getName());//����������
		s.setBook(new Book("�鼳����","�׸�����"));
		System.out.println(s.getBook().getTitle()); // �鼳����
		System.out.println(s.getBook().getAuthor());
	}
}
