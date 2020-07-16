package step2;
/*
 * java.lang 팩키지는 기본으로 사용할 수 있는 팩키지다.
 * java.lang.String class 의 메서드를 사용해보는 예제
 */
public class TestStringAPI {
	public static void main(String[] args) {
		String str = "강상훈,강지훈,강희석,고병철";
		System.out.println(str);
		// 위 문자열을 , 를 기준으로 구분해서 배열로 관리하고 싶다면,
		// String class에서 제공하는 split()을 사용하면 된다.
		String sa[] = str.split(",");
		for(int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
		String name1 = "강하늘";
		// name1 이 몇개의 문자로 구성되었는지 확인하고 싶은때
		System.out.println(name1.length());
		// 강으로 시작되는 문자열인지 여부 확인 , true, false
		System.out.println(name1.startsWith("강"));
		System.out.println(name1.startsWith("김"));
		System.out.println("**자바 문자열 비교**");
		String angel = "아이유";
		String angel2 = "옹성우";
		System.out.println(angel == angel2);
		String angel3 = new String("아이유");
		System.out.println(angel3);
		// 같은 아이유 문자열이지만 만드는 방식에 따라 예상한 결과 true 가 반환되지 않는 경우가 발생하기 때문에
		// 아래 == 연산자는 문자열 비교에 적합하지 않다. 
		System.out.println(angel == angel3);
		// 자바 문자열 비교시에는 반드시 String 에서 제공하는 equals() 메서드를 이용해야 한다!!!!!!!!!!!!!!
		System.out.println(angel.equals(angel3));
		
	}
}
