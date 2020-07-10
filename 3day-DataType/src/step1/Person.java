package step1;

/*
 * Encapsulation 적용 클래스
 * 외부에 공개하지 않은 부분은 private 접근 제어자를 명시
 */
public class Person {

	private	String name;
	private int age = 1;
	//private int check = 0;
	
	// setter 는 외부에서 정보를 할당받기 위한 메서드
	public void setName(String name) {
		// this 예약어(keyword)는 인스턴스 변수를 가리키기 위하여 사용한다.
		// this 를 이용해 인스턴스변수와 매개변수를 구분한다.
		this.name = name;
	}
	/*
	 *  매개변수 age의 전달된 값이
	 *  1미만일 경우 '잘못된 나이이므로 할당할 수 없습니다.'를 출력하고
	 *  1 이상이면 객체의 인스턴스 변수 age에 할당한다.
	 */
	public void setAge(int age) {
		//this.check = 0;
		if(age > 1) {
			this.age = age;
		} else {
		System.out.println("잘못된 나이이므로 할당할 수 없습니다.");
		//this.check = 1;
		}
	}

	// getter 외부에서 정보를 반환받기 위한 메서드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		//if(check == 1) {
		//	System.out.println("잘못된 나이이므로 출력할 수 없습니다.");
		//}else {
		return age;
		//}
	}

}
