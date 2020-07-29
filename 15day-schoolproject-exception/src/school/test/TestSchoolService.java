package school.test;

import java.util.HashMap;

import model.exception.DuplicateTelException;
import model.exception.SchoolMemberNotFoundException;
import school.model.Employee;
import school.model.SchoolMember;
import school.model.SchoolMemberAdministrationService;
import school.model.Student;
import school.model.Teacher;

/*
 * 비즈니스 로직을 담당하는 SchoolService를 단위 테스트하는 클래스
 */
public class TestSchoolService {
 public static void main(String[] args) {
	  SchoolMemberAdministrationService service=new SchoolMemberAdministrationService();
	  System.out.println("**구성원 정보 추가 시작**");
	  try {
		  service.addMember(new Student("공유","011","판교","14"));
	  } catch (DuplicateTelException de) {
		  System.out.println(de.getMessage());
	  }
	  
	  try {
	    service.addMember(new Teacher("수민","016","강남","국어"));
	  } catch (DuplicateTelException de) {
		  System.out.println(de.getMessage());
	  }
	  
	  try {
		  service.addMember(new Student("아이유","017","판교","총무"));
	  } catch (DuplicateTelException de) {
		  System.out.println(de.getMessage());
	  }
	  
	  try {
		  service.addMember(new Employee("고슬링","016","판교","자바"));
	  } catch (DuplicateTelException de) {
		  System.out.println(de.getMessage());
	  }
	  service.printAll();	 
	  System.out.println("******** step1.add 완료 ***********");
	  	  
	  try {
		  System.out.println("검색결과 : ");
		  SchoolMember sm = service.findMember("017");
		  System.out.println(sm);
	  } catch (SchoolMemberNotFoundException se) {
		  System.out.println(se.getMessage());
	  }
	  
	  try {
		  System.out.println("검색결과 : ");
		  SchoolMember sm = service.findMember("010");
		  System.out.println(sm);
	  } catch (SchoolMemberNotFoundException se) {
		  System.out.println(se.getMessage());
	  }
	  
	  System.out.println("********* step2.find 완료 **********");
	  
	  try {
		  System.out.println("삭제결과 : ");
		  SchoolMember sm = service.removeMember("016");
		  System.out.println(sm + "을 삭제하였습니다.");		  
	  } catch (SchoolMemberNotFoundException se) {
		  System.out.println(se.getMessage());
	  }
	 
	  
	  System.out.println("*********** step3.delete 완료 *************");
	 	  
	  try {
		  System.out.println("수정결과 : ");
		  SchoolMember s = new Teacher("원빈","011","성남","자바");
		  SchoolMember sm = service.updateMember(s);
		  System.out.println(sm + "를 " + s + "로 수정하였습니다.");
	  } catch (SchoolMemberNotFoundException se) {
		  System.out.println(se.getMessage());
	  }
	  System.out.println("*********** step4. update 완료 **************");
	  	  
	 }
}
