package step8;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e = new Employee("20", "������", 1500);
		//e.getDetails();
		System.out.println(e.getDetails());
		Engineer en = new Engineer("18", "��ȫ��", 1700, "spring");
		//en.getDetails();
		System.out.println(en.getDetails());
	}
}
	
