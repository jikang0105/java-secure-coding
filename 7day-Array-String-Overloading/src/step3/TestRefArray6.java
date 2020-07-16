package step3;

public class TestRefArray6 {
	public static void main(String[] args) {
		FriendVO[] f = {
				new FriendVO("강상훈", "노을", 29, "분당"),
				new FriendVO("배율희", "율무", 29, "모란"),
				new FriendVO("김수민", "21c", 21, "용인"),
				new FriendVO("정준상", "욘사마", 28, "분당"),
				new FriendVO("정예울", "엔젤", 27, "분당")
		};
		FriendService service =  new FriendService();
		//25세 이상인 친구 이름들만 출력
		System.out.println("********** 나이 검색 출력 ***********");
		service.findNamesByAge(f, 25);
		System.out.println("********* 주소 검색 출력 **********");
		// 분당에 사는 친구의 닉네임이 출력
		service.findNickByAddress(f, "분당");
		System.out.println("********* 이름(성) 검색 출력 **********");
		service.findNameByFristName(f, "강");
		
	}// main
}// class
