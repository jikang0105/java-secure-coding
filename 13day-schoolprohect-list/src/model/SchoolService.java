package model;

import java.util.ArrayList;

public class SchoolService {
	//private int listNumber = 0;
	ArrayList<SchoolMember> list = new ArrayList<SchoolMember>();
	
	public void addPerson(SchoolMember m) {
		if(list.size() == 0) {
			list.add(m);
		}else {
			boolean flag = true;
			for(int i = 0; i < list.size(); i++) {
				if(m.getPhoneNumber().equals(list.get(i).getPhoneNumber())) {
					System.out.println("전화번호가 중복됩니다 확인해주세요");
					flag = false;
					break;
				}			
			}
			if(flag)
			    list.add(m);
		}
	
	}
	public void printAll() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void findMember(String pNumber) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPhoneNumber().equals(pNumber)) {
				System.out.println(list.get(i));
			}
		}
	}
	public void removeMember(String pNumber) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPhoneNumber().equals(pNumber)) {
				SchoolMember m = list.remove(i);
				System.out.println(m + "을 삭제하였습니다.");
			}
		}
	}
	
	
}
