package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller = null;
		if(command.contentEquals("findMemberById")) {
			controller = new FindMemberByIdContorller();
		} else if(command.contentEquals("getAddressKind")) {
			controller = new GetAddressKindController();
		}
		return controller;
	}
}
