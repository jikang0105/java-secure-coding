package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller = null;
		if(command.contentEquals("registerProduct")) {
			controller = new RegisterProductController();
		} else if(command.contentEquals("productList")) {
			controller = new productListController();
		} else if(command.contentEquals("detailProduct")) {
			controller = new ProductDetailController();
		}
		return controller;
	}
}
