package step4;
// 도스 실행창에서 실행
// java step4. TestMainArray 아이유 장기하 옹성우
public class TestMainArray {
	public static void main(String[] args) {
	// 위의 메인 메서드 매개변수 배열을 이용해 보는 예제
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("메인메서드 종료");
	}
}
