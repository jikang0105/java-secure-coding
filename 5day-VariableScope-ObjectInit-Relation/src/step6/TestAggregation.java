package step6;
/*
 *  객체 간의 관계
 *  association > aggregation
 *  use a		  has a
 */

public class TestAggregation {
	public static void main(String[] args) {
		// 사람은 스마트 폰을 가지고 사용한다.
		// 필요 클래스는? Person, SmartPhone
		// 아래 코드를 보고 알맞는 Person class를 구현한다.
		Person p = new Person("이동욱");
		System.out.println(p.getName()); // 이동욱
		p.setSmartPhone(new SmartPhone("갤9", 100));
		System.out.println(p.getSmartPhone().getModel()); // 갤9
		// 이동욱님의 폰 가격을 출력해본다.
		System.out.println(p.getSmartPhone().getPrice()); // 100
		// 이동욱님의 폰 모델명을 갤20으로 수정해본다.
		p.getSmartPhone().setModel("갤20");
		System.out.println(p.getSmartPhone().getModel()); // 갤20
	}
}
