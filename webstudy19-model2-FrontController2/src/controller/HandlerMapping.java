package controller;
/*
 * 요청에 따라 개별 컨트롤러 객체 생성을 전담하는 팩토리 클래스
 */
public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller c = null;
		if(command.contentEquals("selectCar")) {
			c = new SelectCarController();
		} else if(command.contentEquals("registCar")) {
			c = new RegistCarController();
		} else if(command.contentEquals("deleteCar")) {
			c = new DeleteCarController();
		}
		return c;
	}
}
