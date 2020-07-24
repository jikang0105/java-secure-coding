package step5;

public class TestInterface5 {
	public static void main(String[] args) {
		// 배열 length 100
		FlyerService service = new FlyerService(100);
		service.addFlyer(new Bird());
		service.addFlyer(new Airplane());
		service.addFlyer(new SuperMan());
		service.executeFly();
		/*
		 * 새가 날다
		 * 비행기가 날다
		 * 수퍼맨이 날다
		 */
	}
}
