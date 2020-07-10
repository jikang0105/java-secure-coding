package step4;

public class TestConstructor2 {
	public static void main(String[] args) {
		// 매개변수 없는 디폴트 생성자가 없으므로 아래와 같이 
		// 객체를 생성할 수 없다.
		// 	CreditCard c = new CreditCard();
		CreditCard c = new CreditCard("아이유 개인정보");
		System.out.println(c.getCustomerInfo());
		c.setCustomerInfo("강지훈 개인정보");
		System.out.println(c.getCustomerInfo());
	}
}
