package model;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolMemberAdministrationService {
	private LinkedHashMap<String, SchoolMember> map = new LinkedHashMap<String, SchoolMember>();
	
	
	
	public void addMember(SchoolMember member) {
		if(map.containsKey(member.getTel())) { // ������ true , ������ false
			System.out.println("Tel�� �ߺ��Ǿ� �߰��� �� �����ϴ�.");
		} else {
			map.put(member.getTel(), member);
		}
	}
	
	public void printAll() {
		Iterator<SchoolMember> it = map.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public SchoolMember findMember(String tel) {
		if(map.containsKey(tel)) { // ������ true , ������ false
			return map.get(tel);
		} else {
			return null;
		}
	}
	
	public SchoolMember removeMember(String tel) {
		if(map.containsKey(tel)) {
			return map.remove(tel);
		} else {
			return null;
		}
	}
	
	public void updateMember(SchoolMember member) {
		if(map.containsKey(member.getTel())) { // ������ true , ������ false
			System.out.println(map.get(member.getTel()) + "�� " + map.put(member.getTel(), member) + "�� ������Ʈ�Ͽ����ϴ�.");
			
		} else {
			System.out.println("��ϵǾ��ִ� Tel�������� �ʽ��ϴ�. �ű� ������ּ���.");
		}
	}
	
	
	
	

	
	
	
}
