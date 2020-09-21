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
		} else if(command.contentEquals("ItemRegistForm")) {
			controller = new ItemRegistFormController();
		} else if(command.contentEquals("FindItemForm")) {
			controller = new FindItemFormController();
		} else if(command.contentEquals("FindItem")) {
			controller = new FindItemController();
		} else if(command.contentEquals("ItemRegister")) {
			controller = new ItemRegisterController();
		} else if(command.contentEquals("ItemRegisterResult")) {
			controller = new ItemRegisterResultController();
		}
		return controller;
	}
}
