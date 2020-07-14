package step3;
// 객체 초기화 단계 공부 예제
public class TestObjectInit2 {
	public static void main(String[] args) {
		Friend f = new Friend("김수민", 21);
		System.out.println(f.getName() + " " + f.getAge() + "세");
		// money는 명시적 초기화 10000이 되어있으므로
		// 10000이 반환된다.
		System.out.println(f.getMoney());
	}
}
