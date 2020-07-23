package step3;

public class TestStatic1 {
	// Object의 member ( instance variable )
	// 아래 money 변수와, test 메서드는 객체생성을 할 때만 메모리에 로드되고 사용가능하다.
	int money = 100;
	public void test() {}
	
	// Class의 member인 static 변수와 메서드는 실행 첫 시점 즉 class loading 시점에
	// 메모리에 적재된다. 즉 별도의 객체생성이 필요없다.
	static int sMoney = 100;
	static {
		System.out.println("upstatic 메서드 로딩");
		System.out.println(sMoney);
	}
	public static void sTest() {
		System.out.println("sTest 메서드 로딩");
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메서드 로딩");
		// 아래 코드를 실행시 compile error가 나는 이유는 static method 내부이므로
		// non-static( Object의 member ) 에게 직접 접근할 수 없도록 문법적으로 지정되어 있다.
		// 즉 static 에서 non-static으로 직접 접근할 수 없다.
		//System.out.println(money);
		//test();
		// 같은 static 끼리는 접근이 가능하다.
		System.out.println(sMoney);
		sTest();
	}
	static {
		System.out.println("downstatic 메서드 로딩");
		System.out.println(sMoney);
	}
}
