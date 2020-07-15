package step5;
// 참조형 데이터
public class TestRefArray1 {
	public static void main(String[] args) {
		Person p[];
		p = new Person[3]; // 배열 생성
		// 배열 첫번째 방에 아이유 28 객체를 저장
		p[0]=new Person("아이유", 28);
		// 배열 첫번째 요소의 Person 객체의 이름을 출력
		System.out.println(p[0].getName());
		p[1] = new Person("장기하", 34);
		p[2] = new Person("옹성우", 22);
		System.out.println("**배열 요소의 name을 모두 출력");
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName());
		}
	}
}
