package test;


import model.SchoolService;
import model.Student;

public class test {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addPerson(new Student("0101231231", "������", "����", "17"));
		service.addPerson(new Student("0101231232", "������", "����", "18"));
		service.addPerson(new Student("0101231233", "������", "����", "19"));
		service.addPerson(new Student("0101231234", "������", "����", "20"));
		service.addPerson(new Student("0101231235", "������", "����", "21"));
		service.addPerson(new Student("0101231236", "������", "����", "22"));
		service.addPerson(new Student("0101231234", "����ĥ", "��ĥ", "23"));
		service.addPerson(new Student("0101231231", "������", "����", "24"));
		
		service.printAll();
		
		System.out.println("************** ��� �˻� ***************");
		
		service.findMember("0101231234");
		
		System.out.println("************** ��� ���� ***************");
		
		service.removeMember("0101231240");
	}
	
	
}
