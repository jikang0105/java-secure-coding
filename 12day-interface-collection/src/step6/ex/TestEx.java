package step6.ex;

import step6.model.CompanyService;
import step6.model.Employee;
import step6.model.Engineer;
import step6.model.Manager;

public class TestEx {
	public static void main(String[] args) {
		CompanyService service = new CompanyService(100);
		service.add(new Manager("17", "김수민 ", 700, "기획부"));
		service.add(new Engineer("19", "정지윤", 900, "spring"));
		service.add(new Employee("20", "진용현", 600));
		service.add(new Employee("21", "이동욱", 650));
		System.out.println("******* 사원등록끝**********");
		System.out.println("******* 전체사원정보 ********");
		service.printAll();
		/*
		 * empId : 17, name : 김수민 , salary : 700 , department : 기획부
		 * empId : 19, name : 정지윤 , salary : 900,  skill : spring
		 * empId : 20, name : 진용현 , salary : 600 , 
		 * empId : 20 , name : 이동욱 , salary : 650
		 */
		System.out.println("********** 사원아이디로 검색**********");
		Employee e = service.findById("20");
		System.out.println(e);
		// empId : 20, name : 진용현 , salary : 600
		
		// 삭제
		System.out.println("********* 삭제 ********");
		service.removeById("19");
		  service.printAll();
		  /*  empId : 17 , name : 김수민 , salary : 700 , department : 기획부 
		   *   empId : 19 , name : 정지윤 , salary : 900 , skill : spring  
		   *   empId : 21 , name : 이동욱 , salary : 650 
		   */
		 
	}
}
