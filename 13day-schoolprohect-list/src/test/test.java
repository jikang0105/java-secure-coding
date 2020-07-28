package test;


import model.SchoolService;
import model.Student;

public class test {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addPerson(new Student("0101231231", "정예일", "수원", "17"));
		service.addPerson(new Student("0101231232", "정예이", "수투", "18"));
		service.addPerson(new Student("0101231233", "정예삼", "수삼", "19"));
		service.addPerson(new Student("0101231234", "정예사", "수사", "20"));
		service.addPerson(new Student("0101231235", "정예오", "수오", "21"));
		service.addPerson(new Student("0101231236", "정예육", "수육", "22"));
		service.addPerson(new Student("0101231234", "정예칠", "수칠", "23"));
		service.addPerson(new Student("0101231231", "정예팔", "수팔", "24"));
		
		service.printAll();
		
		System.out.println("************** 멤버 검색 ***************");
		
		service.findMember("0101231234");
		
		System.out.println("************** 멤버 삭제 ***************");
		
		service.removeMember("0101231240");
	}
	
	
}
