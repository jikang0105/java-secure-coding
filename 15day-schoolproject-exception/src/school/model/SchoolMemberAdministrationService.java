package school.model;

import java.util.Iterator;
import java.util.LinkedHashMap;

import model.exception.DuplicateTelException;
import model.exception.SchoolMemberNotFoundException;

public class SchoolMemberAdministrationService {
	private LinkedHashMap<String, SchoolMember> map = new LinkedHashMap<String, SchoolMember>();
	
	
	// tel�� �ߺ��Ǹ� �߰����� �ʰ� DuplicateTelException �߻�
	public void addMember(SchoolMember member) throws DuplicateTelException{
		if(map.containsKey(member.getTel())) { // ������ true , ������ false
			throw new DuplicateTelException("���� �ο��� ��ȭ��ȣ�� �ߺ��˴ϴ�. Ȯ�����ּ���.");
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
	// tel�� �ش��ϴ� �������� ������� SchoolMemberNotFoundException�� �߻���Ű��
	// ȣ���� ������ �����Ѵ�.
	public SchoolMember findMember(String tel) throws SchoolMemberNotFoundException{
		
		if(map.containsKey(tel)) { // ������ true , ������ false
			return map.get(tel);
		} else {
			throw new SchoolMemberNotFoundException("��ȭ��ȣ�� �ߺ��Ǵ� ���� �ο��� �����ϴ�. Ȯ�����ּ���.");
		}
	}
	
	public SchoolMember removeMember(String tel) throws SchoolMemberNotFoundException{
		
		if(map.containsKey(tel)) {
			return map.remove(tel);
		} else {
			throw new SchoolMemberNotFoundException("��ȭ��ȣ�� �ߺ��Ǵ� ���� �ο��� �����ϴ�. Ȯ�����ּ���.");
		}
	}
	
	public SchoolMember updateMember(SchoolMember member) throws SchoolMemberNotFoundException{
		
		if(map.containsKey(member.getTel())) { // ������ true , ������ false
			
			
			return map.put(member.getTel(), member);
			
		} else {
			throw new SchoolMemberNotFoundException("��ȭ��ȣ�� �ߺ��Ǵ� ���� �ο��� �����ϴ�. Ȯ�����ּ���.");
		}
	}
	
	
	
	

	
	
	
}
