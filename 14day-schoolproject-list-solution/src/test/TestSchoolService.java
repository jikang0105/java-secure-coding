package test;

import model.Employee;
import model.SchoolMemberAdministrationService;
import model.Student;
import model.Teacher;

/*
 * ����Ͻ� ������ ����ϴ� SchoolService�� ���� �׽�Ʈ�ϴ� Ŭ����
 */
public class TestSchoolService {
	public static void main(String[] args) {
		SchoolMemberAdministrationService service = new SchoolMemberAdministrationService();
		service.addMember(new Student("������", "0101231234", "����", "17"));
		service.addMember(new Teacher("�ż�ȣ", "0101231235", "����", "����"));
		service.addMember(new Student("������", "0101231236", "����", "16"));
		service.addMember(new Employee("�ۿ���", "0101231237", "ȭ��", "�繫��"));
		service.addMember(new Student("������", "0101231238", "����", "18"));
		service.addMember(new Teacher("����", "0101231239", "����", "����"));
		service.addMember(new Teacher("����", "0101231239", "����", "����"));
		
	System.out.println("������ ���� �߰� �Ϸ�");
	System.out.println("������ ��ü ���");
	service.printAll();
	System.out.println("** findIndexByTel() �׽�Ʈ**");
	System.out.println("���� : " + service.findIndexByTel("0101231236"));
	System.out.println("����x : " + service.findIndexByTel("0111111111"));
	System.out.println("** ��ȭ��ȣ �˻� �׽�Ʈ **");
	System.out.print("�˻��Ϸ� : ");
	service.findMember("0101231236");
	System.out.print("�˻��Ϸ� : ");
	service.findMember("0111111111");
	System.out.println("** ��ȭ��ȣ ���� �׽�Ʈ**");
	service.removeMember("0101231236");
	service.removeMember("0111111111");
	service.removeMember("0101231236");
	
	
	}// main
}// class
