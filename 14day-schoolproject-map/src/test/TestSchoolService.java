package test;

import model.Employee;
import model.SchoolMember;
import model.SchoolMemberAdministrationService;
import model.Student;
import model.Teacher;

/*
 * ����Ͻ� ������ ����ϴ� SchoolService�� ���� �׽�Ʈ�ϴ� Ŭ����
 */
public class TestSchoolService {
 public static void main(String[] args) {
  SchoolMemberAdministrationService service=new SchoolMemberAdministrationService();
  System.out.println("**������ ���� �߰� ����**");
    service.addMember(new Student("������","0101231234","����","17"));
    service.addMember(new Teacher("�ż�ȣ","0101231235","����","����"));
    service.addMember(new Student("������","0101231236","����","16"));
    service.addMember(new Employee("�ۿ���","0101231237","ȭ��","�繫��"));
    service.addMember(new Student("������","0101231238","����","18"));
    service.addMember(new Teacher("����","0101231239","����","����"));
  System.out.println("**������ ���� �߰� �Ϸ�**");
  System.out.println("**�߰��� �ߺ�Ȯ��**");  
  //�����ϴ� ��ȭ��ȣ�� �������� �߰��Ƿ��� �� �� 
  service.addMember(new Student("������","0101231234","����","19"));
  //���� ���� ������ tel�� ���� �������� �߰����� �� 
  // tel �� �ߺ��Ǿ� �߰��� �� �����ϴ�! �޼��� ����ϰ� �߰����� �ʴ´� 
  System.out.println("**�ߺ��׽�Ʈ �� ����Ʈ Ȯ��**");
  service.printAll();
  System.out.println("**������ ��ü ���**");
  service.printAll();
  
  
  System.out.println("**tel�� �˻��޼��� �׽�Ʈ**");
  SchoolMember p = service.findMember("0101231236");
  if(p == null) {
	  System.out.println("Tel�� �˻��Ǵ� �ο��� �����ϴ�.");
  } else {
  System.out.println("�˻���� : " + p);
  }
  
  System.out.println("**���� �׽�Ʈ**");
  SchoolMember rp = service.removeMember("0101231236");
  if(p == null) {
	  System.out.println("Tel�� �˻��Ǵ� �ο��� �����ϴ�.");
  } else {
	  System.out.println("������� : " + rp + "�� �����Ͽ����ϴ�.");
  }
  
  System.out.println("**���� �� ����Ʈ Ȯ��**");
  service.printAll();
  
  service.updateMember(new Teacher("0101231237","�ۿ���","����","�ڹ�"));
  System.out.println("**���� �� ����Ʈ Ȯ��**");
  service.printAll();
  
 }
}
