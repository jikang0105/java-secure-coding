package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller = null;
		if(command.contentEquals("home")){
			controller = new HomeController();
		}else if(command.contentEquals("itemDetail")) {
			controller = new ItemDetailController();
		}
		return controller;
	}
}
