package step2;

public class TestIf {
	public static void main(String[] args) {
		int age = 19;
		if(age > 18) { // 18세를 초과하는 경우
			System.out.println(age + "세는 성인입니다.");
		}else if(age > 13){
			System.out.println(age + "세는 청소년입니다.");
		}else {
			System.out.println(age + "세는 미성년자입니다.");
		}//else
	}//main
}// class
