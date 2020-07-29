package test;

import model.Employee;
import model.SchoolMember;
import model.SchoolMemberAdministrationService;
import model.Student;
import model.Teacher;

/*
 * 비즈니스 로직을 담당하는 SchoolService를 단위 테스트하는 클래스
 */
public class TestSchoolService {
 public static void main(String[] args) {
  SchoolMemberAdministrationService service=new SchoolMemberAdministrationService();
  System.out.println("**구성원 정보 추가 시작**");
    service.addMember(new Student("정예울","0101231234","용인","17"));
    service.addMember(new Teacher("신성호","0101231235","수지","국어"));
    service.addMember(new Student("이진욱","0101231236","수원","16"));
    service.addMember(new Employee("송영섭","0101231237","화성","재무부"));
    service.addMember(new Student("배율휘","0101231238","용인","18"));
    service.addMember(new Teacher("강희석","0101231239","용인","수학"));
  System.out.println("**구성원 정보 추가 완료**");
  System.out.println("**추가시 중복확인**");  
  //존재하는 전화번호의 구성원이 추가되려고 할 때 
  service.addMember(new Student("아이유","0101231234","수원","19"));
  //위와 같이 동일한 tel을 가진 구성원을 추가했을 때 
  // tel 이 중복되어 추가할 수 없습니다! 메세지 출력하고 추가하지 않는다 
  System.out.println("**중복테스트 후 리스트 확인**");
  service.printAll();
  System.out.println("**구성원 전체 명단**");
  service.printAll();
  
  
  System.out.println("**tel로 검색메서드 테스트**");
  SchoolMember p = service.findMember("0101231236");
  if(p == null) {
	  System.out.println("Tel로 검색되는 인원이 없습니다.");
  } else {
  System.out.println("검색결과 : " + p);
  }
  
  System.out.println("**삭제 테스트**");
  SchoolMember rp = service.removeMember("0101231236");
  if(p == null) {
	  System.out.println("Tel로 검색되는 인원이 없습니다.");
  } else {
	  System.out.println("삭제결과 : " + rp + "를 삭제하였습니다.");
  }
  
  System.out.println("**삭제 후 리스트 확인**");
  service.printAll();
  
  service.updateMember(new Teacher("0101231237","송영섭","성남","자바"));
  System.out.println("**수정 후 리스트 확인**");
  service.printAll();
  
 }
}
