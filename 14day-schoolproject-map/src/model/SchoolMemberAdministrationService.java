package model;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolMemberAdministrationService {
	private LinkedHashMap<String, SchoolMember> map = new LinkedHashMap<String, SchoolMember>();
	
	
	
	public void addMember(SchoolMember member) {
		if(map.containsKey(member.getTel())) { // 있으면 true , 없으면 false
			System.out.println("Tel이 중복되어 추가할 수 없습니다.");
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
		if(map.containsKey(tel)) { // 있으면 true , 없으면 false
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
		if(map.containsKey(member.getTel())) { // 있으면 true , 없으면 false
			System.out.println(map.get(member.getTel()) + "을 " + map.put(member.getTel(), member) + "로 업데이트하였습니다.");
			
		} else {
			System.out.println("등록되어있는 Tel존재하지 않습니다. 신규 등록해주세요.");
		}
	}
	
	
	
	

	
	
	
}
