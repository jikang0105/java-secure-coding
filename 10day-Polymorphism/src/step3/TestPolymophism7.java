package step3;

public class TestPolymophism7 {
	public static void main(String[] args) {
		CompanyService service = new CompanyService();
		//service.printDetailInfo(new Employee("Employee", "������", 1000));
		//service.printDetailInfo(new Engineer("Engineer", "�����", 1100, "java", 500));
		//service.printDetailInfo(new Manager("Manager", "������", 1200, "���ߺ�"));
		
		// ������ ����ؼ� ����ϴ� �޼��� ( salary * 12 )
		// �� Engineer�� salary �� bonus�� ���ؼ� * 12
			service.printAnnualSalary(new Employee("Employee", "������", 1000));
			service.printAnnualSalary(new Engineer("Engineer", "�����", 1100, "java", 500));
			service.printAnnualSalary(new Manager("Manager", "������", 1200, "���ߺ�"));
	}
}
