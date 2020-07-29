package model;

import java.util.ArrayList;

public class SchoolMemberAdministrationService {
	ArrayList<SchoolMember> memberList = new ArrayList<SchoolMember>();
	
    
	/**
	 * �Ű������� ���޵� tel�� ����Ʈ�� ��ҳ��� ������ tel�� ���ؼ�
	 * ��ġ�ϴ� ��Ұ� ������ -1�� ��ȯ�ϰ� ��ġ�ϴ� ��Ұ� ������
	 * ����Ʈ ����� �ε����� ��ȯ�ϴ� �޼���
	 * @param tel
	 * @return
	 */
	
	public int findIndexByTel(String tel) {
		int index = -1;
		for(int i = 0; i < memberList.size(); i++) {
			if(tel.equals(memberList.get(i).getTel())) {
				index = i;
				break;
			} //if
		} // for
		return index;
	}
	
	/*
     *	public boolean checkTelDuplication(SchoolMember member) {
	 *		for(int i = 0; i < memberList.size(); i++) {
	 *			if(member.getTel().equals(memberList.get(i).getTel())) {
	 *				return true; // �ߺ��Ǵ� ��ȭ��ȣ�� ������ true�� ��ȯ�Ѵ�.
	 *			}  // if
	 *		}// for
	 *		return false;
	 *	} // method
	 */
			
	public void addMember(SchoolMember member) {
		if(findIndexByTel(member.getTel()) == -1){
			memberList.add(member);
		} else {
			System.out.println("������ �ο��� ��ȭ��ȣ�� �ߺ��˴ϴ�.");
		}
	}
	
	public void printAll() {
		for(int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}
	
	public void findMember(String tel) {
		if(findIndexByTel(tel) == -1) {
			System.out.println("�ش� ��ȭ��ȣ�� ã���� �ִ� �ο��� �����ϴ�.");
		} else {
			System.out.println(memberList.get(findIndexByTel(tel)));
		}
	}
	/*
	 * public Person findPersonByTel(String tel) {
	 *	Person p=null;
	 *	int position=findIndexByTel(tel);// tel�� �����ϴ��� ������ �����ϸ� �� ��ġ�� ��ȯ
	 *	if(position!=-1) {
	 *		p=list.get(position);
	 *	}
	 *	return p;
	 *}
	 */
	public void removeMember(String tel) {
		if(findIndexByTel(tel) == -1) {
			System.out.println("�ش� ��ȭ��ȣ�� ������ �� �ִ� �ο��� �����ϴ�.");
		} else {
			SchoolMember remove = memberList.remove(findIndexByTel(tel));
			System.out.println(remove + "�� �����Ͽ����ϴ�.");
		}
	}
	/*
	 * public Person removePersonByTel(String tel) {
	 *	Person p=null;
	 *	int position=findIndexByTel(tel);
	 *	if(position!=-1) {
	 *		p=list.remove(position);
	 *	}
	 *	return p;
	 *}
	 */
	
	
}
