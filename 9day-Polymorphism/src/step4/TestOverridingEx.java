package step4;

class Employee{
	private String responsibilities;
	private String empNo;
	private String name;
	private int salary;
	
	Employee(String responsibilities, String empNo, String name, int salary){
		this.responsibilities = responsibilities;
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getResponsibilities() {
		return responsibilities;
	}
	public String getEmpNo() {
		return empNo;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return responsibilities + " [ empNo = " + empNo + " / name : " + name + " / salary : " + salary;
	}
}

class Engineer extends Employee{
	private String skill;
	
	Engineer(String responsibilities, String empNo, String name, int salary, String skill){
		super(responsibilities, empNo, name, salary);
		this.skill = skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public String toString() {
		return super.toString() + " / skill : " + skill;
	}
}

class Manager extends Employee{
	private String department;
	
	Manager(String responsibilities, String empNo, String name, int salary, String department){
		super(responsibilities, empNo, name, salary);
		this.department = department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return super.toString() + " / department : " + department;
	}
}

public class TestOverridingEx {
	public static void main(String[] args) {
		Employee e = new Employee("Employee", "18", "이진욱", 900);
		System.out.println(e + " ]");
		Engineer en = new Engineer("Engineer", "19", "배율휘", 1000, "java");
		System.out.println(en + " ]");
		Manager m = new Manager("Manager", "13", "송영섭", 1500, "개발");
		System.out.println(m + " ]");		
	}
}
