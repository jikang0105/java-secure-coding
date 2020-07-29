package school.model;

import java.util.Iterator;
import java.util.LinkedHashMap;

import model.exception.DuplicateTelException;
import model.exception.SchoolMemberNotFoundException;

public class SchoolMemberAdministrationService {
	private LinkedHashMap<String, SchoolMember> map = new LinkedHashMap<String, SchoolMember>();
	
	
	// tel이 중복되면 추가하지 않고 DuplicateTelException 발생
	public void addMember(SchoolMember member) throws DuplicateTelException{
		if(map.containsKey(member.getTel())) { // 있으면 true , 없으면 false
			throw new DuplicateTelException("기등록 인원과 전화번호가 중복됩니다. 확인해주세요.");
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
	// tel에 해당하는 구성원이 없을경우 SchoolMemberNotFoundException을 발생시키고
	// 호출한 곳으로 전달한다.
	public SchoolMember findMember(String tel) throws SchoolMemberNotFoundException{
		
		if(map.containsKey(tel)) { // 있으면 true , 없으면 false
			return map.get(tel);
		} else {
			throw new SchoolMemberNotFoundException("전화번호가 중복되는 기등록 인원이 없습니다. 확인해주세요.");
		}
	}
	
	public SchoolMember removeMember(String tel) throws SchoolMemberNotFoundException{
		
		if(map.containsKey(tel)) {
			return map.remove(tel);
		} else {
			throw new SchoolMemberNotFoundException("전화번호가 중복되는 기등록 인원이 없습니다. 확인해주세요.");
		}
	}
	
	public SchoolMember updateMember(SchoolMember member) throws SchoolMemberNotFoundException{
		
		if(map.containsKey(member.getTel())) { // 있으면 true , 없으면 false
			
			
			return map.put(member.getTel(), member);
			
		} else {
			throw new SchoolMemberNotFoundException("전화번호가 중복되는 기등록 인원이 없습니다. 확인해주세요.");
		}
	}
	
	
	
	

	
	
	
}
