package model;

public class Employee {
	private String empno;
	private String ename;
	private int sal;
	private Department department; // has a, aggregation
	public Employee() {
		super();
	}
	public Employee(String empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public Employee(String empno, String ename, int sal, Department department) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.department = department;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", department=" + department + "]";
	}
	
	
	
}
