package step3;

public class TestPolymophism7 {
	public static void main(String[] args) {
		CompanyService service = new CompanyService();
		//service.printDetailInfo(new Employee("Employee", "강상훈", 1000));
		//service.printDetailInfo(new Engineer("Engineer", "정재우", 1100, "java", 500));
		//service.printDetailInfo(new Manager("Manager", "정세희", 1200, "개발부"));
		
		// 연봉을 계산해서 출력하는 메서드 ( salary * 12 )
		// 단 Engineer는 salary 와 bonus를 더해서 * 12
			service.printAnnualSalary(new Employee("Employee", "강상훈", 1000));
			service.printAnnualSalary(new Engineer("Engineer", "정재우", 1100, "java", 500));
			service.printAnnualSalary(new Manager("Manager", "정세희", 1200, "개발부"));
	}
}
