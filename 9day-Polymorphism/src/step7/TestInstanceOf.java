package step7;
class Employee{};
class Engineer extends Employee{};
class Manager extends Employee{};
class Secretary extends Employee{};

public class TestInstanceOf {
	public static void main(String[] args) {
		Employee e = new Manager();
		Employee e2 = new Employee();
		if(e instanceof Manager) { // true
			System.out.println("������");
		}
		if(e instanceof Secretary) { // false
			System.out.println("��");
		}
		if(e instanceof Employee) { // true Manager is a Employee
			System.out.println("���");
		}
		if(e2 instanceof Manager) { // flase Employee is a Manager X
			System.out.println("�Ŵ���");
		}
	}
}
