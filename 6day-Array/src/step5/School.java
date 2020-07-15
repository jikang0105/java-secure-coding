package step5;

import step1.review.Student;

public class School {

	public void printAll(Student[] stuArray) {
		for(int i = 0; i < stuArray.length; i++) {
			System.out.println("학번 : " + stuArray[i].getId()
					+ " / 이름 : " + stuArray[i].getName()
					+ " / 주소 : " + stuArray[i].getAddress());
		}
	}
	
	public void printAvgAge(Student[] stuArray) {
		int totalAge = 0; 
		for(int i = 0; i< stuArray.length; i++) {
			totalAge += stuArray[i].getAge();
		}
		double avgAge = totalAge / stuArray.length;
		System.out.println("학생 평균 나이 : " + avgAge + "세");
	}
	
	
}
