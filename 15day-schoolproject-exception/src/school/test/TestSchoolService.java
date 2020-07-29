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
 * ����Ͻ� ������ ����ϴ� SchoolService�� ���� �׽�Ʈ�ϴ� Ŭ����
 */
public class TestSchoolService {
 public static void main(String[] args) {
	  SchoolMemberAdministrationService service=new SchoolMemberAdministrationService();
	  System.out.println("**������ ���� �߰� ����**");
	  try {
		  service.addMember(new Student("����","011","�Ǳ�","14"));
	  } catch (DuplicateTelException de) {
		  System.out.println(de.getMessage());
	  }
	  
	  try {
	    service.addMember(new Teacher("����","016","����","����"));
	  } catch (DuplicateTelException de) {
		  System.out.println(de.getMessage());
	  }
	  
	  try {
		  service.addMember(new Student("������","017","�Ǳ�","�ѹ�"));
	  } catch (DuplicateTelException de) {
		  System.out.println(de.getMessage());
	  }
	  
	  try {
		  service.addMember(new Employee("����","016","�Ǳ�","�ڹ�"));
	  } catch (DuplicateTelException de) {
		  System.out.println(de.getMessage());
	  }
	  service.printAll();	 
	  System.out.println("******** step1.add �Ϸ� ***********");
	  	  
	  try {
		  System.out.println("�˻���� : ");
		  SchoolMember sm = service.findMember("017");
		  System.out.println(sm);
	  } catch (SchoolMemberNotFoundException se) {
		  System.out.println(se.getMessage());
	  }
	  
	  try {
		  System.out.println("�˻���� : ");
		  SchoolMember sm = service.findMember("010");
		  System.out.println(sm);
	  } catch (SchoolMemberNotFoundException se) {
		  System.out.println(se.getMessage());
	  }
	  
	  System.out.println("********* step2.find �Ϸ� **********");
	  
	  try {
		  System.out.println("������� : ");
		  SchoolMember sm = service.removeMember("016");
		  System.out.println(sm + "�� �����Ͽ����ϴ�.");		  
	  } catch (SchoolMemberNotFoundException se) {
		  System.out.println(se.getMessage());
	  }
	 
	  
	  System.out.println("*********** step3.delete �Ϸ� *************");
	 	  
	  try {
		  System.out.println("������� : ");
		  SchoolMember s = new Teacher("����","011","����","�ڹ�");
		  SchoolMember sm = service.updateMember(s);
		  System.out.println(sm + "�� " + s + "�� �����Ͽ����ϴ�.");
	  } catch (SchoolMemberNotFoundException se) {
		  System.out.println(se.getMessage());
	  }
	  System.out.println("*********** step4. update �Ϸ� **************");
	  	  
	 }
}
