package step5;

import step1.review.Student;

public class School {

	public void printAll(Student[] stuArray) {
		for(int i = 0; i < stuArray.length; i++) {
			System.out.println("�й� : " + stuArray[i].getId()
					+ " / �̸� : " + stuArray[i].getName()
					+ " / �ּ� : " + stuArray[i].getAddress());
		}
	}
	
	public void printAvgAge(Student[] stuArray) {
		int totalAge = 0; 
		for(int i = 0; i< stuArray.length; i++) {
			totalAge += stuArray[i].getAge();
		}
		double avgAge = totalAge / stuArray.length;
		System.out.println("�л� ��� ���� : " + avgAge + "��");
	}
	
	
}
