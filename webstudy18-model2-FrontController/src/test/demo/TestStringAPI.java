package test.demo;

public class TestStringAPI {
	public static void main(String[] args) {
		String url = " redirect:register_result.jsp";
		url = url.trim(); // 여백을 제거
		//url = "find-ok.jsp";
		if(url.startsWith("redirect")) {
			//substring(beginIndex)
			url = url.substring(9); // 9번째 문자열부터 마지막까지 반환
			System.out.println("redirect방식으로 이동" + url);
		} else {
			System.out.println("forward 방식으로 이동" + url);
		}
	}
}
