package test;

import model.Employee;
import model.SchoolMemberAdministrationService;
import model.Student;
import model.Teacher;

/*
 * 비즈니스 로직을 담당하는 SchoolService를 단위 테스트하는 클래스
 */
public class TestSchoolService {
	public static void main(String[] args) {
		SchoolMemberAdministrationService service = new SchoolMemberAdministrationService();
		service.addMember(new Student("정예울", "0101231234", "용인", "17"));
		service.addMember(new Teacher("신성호", "0101231235", "수지", "국어"));
		service.addMember(new Student("이진욱", "0101231236", "수원", "16"));
		service.addMember(new Employee("송영섭", "0101231237", "화성", "재무부"));
		service.addMember(new Student("배율휘", "0101231238", "용인", "18"));
		service.addMember(new Teacher("강희석", "0101231239", "용인", "수학"));
		service.addMember(new Teacher("강희석", "0101231239", "용인", "수학"));
		
	System.out.println("구성원 정보 추가 완료");
	System.out.println("구성원 전체 명단");
	service.printAll();
	System.out.println("** findIndexByTel() 테스트**");
	System.out.println("존재 : " + service.findIndexByTel("0101231236"));
	System.out.println("존재x : " + service.findIndexByTel("0111111111"));
	System.out.println("** 전화번호 검색 테스트 **");
	System.out.print("검색완료 : ");
	service.findMember("0101231236");
	System.out.print("검색완료 : ");
	service.findMember("0111111111");
	System.out.println("** 전화번호 삭제 테스트**");
	service.removeMember("0101231236");
	service.removeMember("0111111111");
	service.removeMember("0101231236");
	
	
	}// main
}// class
