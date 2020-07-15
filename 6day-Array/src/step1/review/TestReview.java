package step1.review;

public class TestReview {
	public static void main(String[] args) {
		School school = new School("코스타대학교");
		System.out.println(school.getName());
		// School 과 Student 를 aggregation 관계로 표현
		Student stu = new Student("20", "아이유", "판교");
		school.setStudent(stu);
		System.out.println(school.getStudent().getId()); // 20
		System.out.println(school.getStudent().getName()); // 아이유
		System.out.println(school.getStudent().getAddress()); // 판교
	}
}
