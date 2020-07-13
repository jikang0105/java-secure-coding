package step5;

public class TestSwitch2 {
	public static void main(String[] args) {
		/*
		 * grade 1이면 하버드
		 * 2이면 북경대
		 * 3, 4, 5 는 카네기멜론
		 * 나머지 스탠포드
		 */
		
		int grade = 9;
		
		switch(grade) {
		case 1:
			System.out.println("하버드");
			break;
		case 2:
			System.out.println("북경대");
			break;
		case 3: case 4: case 5:
			System.out.println("카네기멜론");
			break;
		default :
			System.out.println("스탠포드");

		}
		
	}
}
