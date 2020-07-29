package model;

import java.util.ArrayList;

public class SchoolMemberAdministrationService {
	ArrayList<SchoolMember> memberList = new ArrayList<SchoolMember>();
	
    
	/**
	 * 매개변수로 전달된 tel과 리스트의 요소내의 구성원 tel과 비교해서
	 * 일치하는 요소가 없으면 -1을 반환하고 일치하는 요소가 있으면
	 * 리스트 요소의 인덱스를 반환하는 메서드
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
	 *				return true; // 중복되는 전화번호가 있으면 true를 반환한다.
	 *			}  // if
	 *		}// for
	 *		return false;
	 *	} // method
	 */
			
	public void addMember(SchoolMember member) {
		if(findIndexByTel(member.getTel()) == -1){
			memberList.add(member);
		} else {
			System.out.println("기존의 인원과 전화번호가 중복됩니다.");
		}
	}
	
	public void printAll() {
		for(int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}
	
	public void findMember(String tel) {
		if(findIndexByTel(tel) == -1) {
			System.out.println("해당 전화번호로 찾을수 있는 인원이 없습니다.");
		} else {
			System.out.println(memberList.get(findIndexByTel(tel)));
		}
	}
	/*
	 * public Person findPersonByTel(String tel) {
	 *	Person p=null;
	 *	int position=findIndexByTel(tel);// tel이 존재하는지 유무와 존재하면 그 위치를 반환
	 *	if(position!=-1) {
	 *		p=list.get(position);
	 *	}
	 *	return p;
	 *}
	 */
	public void removeMember(String tel) {
		if(findIndexByTel(tel) == -1) {
			System.out.println("해당 전화번호로 삭제할 수 있는 인원이 없습니다.");
		} else {
			SchoolMember remove = memberList.remove(findIndexByTel(tel));
			System.out.println(remove + "을 삭제하였습니다.");
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
