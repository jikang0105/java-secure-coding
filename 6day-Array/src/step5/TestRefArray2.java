package step5;

public class TestRefArray2 {
	public static void main(String[] arg) {
		// 배열 선언 생성 할당 동시에
		Person[] p = {new Person("옹성우", 22), new Person("아이유", 28),
				new Person("장기하", 34)};
		System.out.println(p.length); // 3
		System.out.println("**배열 요소의 name과 age를 출력**");
		// 옹성우 22
		// 아이유 28
		// 장기하 34
		// for문 이용
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName() + " " + p[i].getAge());
		}
		System.out.println("*****배열 요소 나이를 20을 더한다.******");
		for(int i = 0; i < p.length; i++) {
			p[i].setAge(p[i].getAge() + 20);
			// int age = p[i].getAge(); // 기존 나이를 리턴
			// p[i].setAge(age+20); // 기존 나이에 20을 더해서 할당한다.
		}
		// 옹성우 42
		// 아이유 48
		// 장기하 54
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName()+ " " + p[i].getAge());
		}
	}
}
