package step5;

import step1.review.Student;

public class TestRefArray3 {
	public static void main(String[] args) {
		School school = new School();
		Student[] stuArray = {
				new Student("20", "������", "�Ǳ�", 28),
				new Student("19", "�˼���", "����", 22),
				new Student("11", "�����", "����", 34)
		};
		school.printAll(stuArray);
		school.printAvgAge(stuArray); // �л���ճ��� ��
	}
}
