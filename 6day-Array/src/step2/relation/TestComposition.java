package step2.relation;

public class TestComposition {
	public static void main(String[] args) {
		Car car = new Car("소나타");
		System.out.println(car.getModel()); //소나타
		System.out.println(car.getEngine()); // 엔진 주소값
		System.out.println(car.getEngine().getType()); // L4
		System.out.println(car.getEngine().getDisplacement()); // 20000
	}
}
