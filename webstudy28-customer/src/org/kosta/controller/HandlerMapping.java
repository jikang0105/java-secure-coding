package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller = null;
		if(command.contentEquals("countMember")) {
			controller = new CountController();
		} else if(command.contentEquals("join")) {
			controller = new JoinController();
		} else if(command.contentEquals("checkId")) {
			controller = new checkIdController();
		} else if(command.contentEquals("login")) {
			controller = new loginController();
		}
		return controller;
	}
	
}
