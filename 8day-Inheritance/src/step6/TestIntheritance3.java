package step6;
/*
 * 아래 클래스의 메인메서드에 대응되는 클래스들을 구현하는 예제
 */
public class TestIntheritance3 {
	public static void main(String[] args) {
		Employee e = new Employee("20", "진용현", 1000);
		System.out.println(e.getEmpNo() + " " + e.getName() + " " + e.getSalary());
		// 20 진용현 1000 java
		Engineer en = new Engineer("19", "강희석", 1200, "java");
		System.out.println(en.getEmpNo() + " " + en.getName() + " " + en.getSalary() + " " + en.getSkill());
		// 19 강희석 1200 java
		
	}
}
