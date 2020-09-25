package org.kosta.model;

public class EmployeeVO {
	private String empno;
	private String ename;
	private int sal;
	private DeptVO deptVO; // has a or aggregation 관계
	public EmployeeVO() {
		super();
	}
	public EmployeeVO(String empno, String ename, int sal, DeptVO deptVO) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.deptVO = deptVO;
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
	public DeptVO getDeptVO() {
		return deptVO;
	}
	public void setDeptVO(DeptVO deptVO) {
		this.deptVO = deptVO;
	}
	@Override
	public String toString() {
		return "EmployeeVO [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", deptVO=" + deptVO + "]";
	}
	
}
