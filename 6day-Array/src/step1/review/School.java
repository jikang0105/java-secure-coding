package step1.review;

public class School {
	/*
	 *  인스턴스 변수 : 객체 속성정보 저장 , Heap 메모리 영역
	 *  선언만 해도 기본 초기화 된다.
	 *  아래는 String 참조형 데이터타입이므로 null
	 */
	private String name;
	/*
	 * 생성자에 선언된 name은 지역변수이자 매개변수이다.
	 * this 키워드는 현재 객체 즉 인스턴스를 가르킨다.
	 */
	private Student student;
	
	public School(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
