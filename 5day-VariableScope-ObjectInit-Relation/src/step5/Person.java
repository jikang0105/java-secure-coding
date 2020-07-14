package step5;

public class Person {
	/*
	 *  Association 관계(use a)는 '사람이 렌트카를 사용하다'와 같이
	 *  특정 객체가 대상 객체를 사용하는 관계를 의미한다.
	 *  아래 메서드에서는 일시적으로 RentCar 객체를 사용하므로 association 관계이다.
	 */
	public void tour(String item) {
		RentCar car = new RentCar(item);
		System.out.println(car.getModel() + " 을(를) 타고 여행하다");
	}
}
