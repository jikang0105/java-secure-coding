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
		}else if(command.contentEquals("login")) {
			controller = new LoginController();
		}else if(command.contentEquals("logout")) {
			controller = new LogoutController();
		}else if(command.contentEquals("registerItemForm")) {
			controller = new RegisterItemFormController();
		}else if(command.contentEquals("itemRegister")) {
			controller = new ItemRegisterController();
		}else if(command.contentEquals("addcart")) {
			controller = new AddCartController();
		}else if(command.contentEquals("cartView")) {
			controller = new CartViewController();
		}else if(command.contentEquals("deleteCart")) {
			controller = new DeleteCartItemController();
		}
		return controller;
	}
}
