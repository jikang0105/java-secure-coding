package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.contentEquals("home")) {
			controller=new HomeController();
		}else if(command.contentEquals("findMemberByIdForm")) {
			controller=new FindMemberByIdFormController();
		}else if(command.contentEquals("findMemberById")) {
			controller=new FindMemberByIdController();
		}else if(command.contentEquals("registerForm")) {
			controller=new RegisterFormController();
		}else if(command.contentEquals("register")) {
			controller=new RegisterController();
		}else if(command.contentEquals("registerResult")) {
			controller=new RegisterResultController();
		}else if(command.contentEquals("login")) {
			controller=new LoginController();
		}else if(command.contentEquals("logout")) {
			controller=new LogoutController();
		}else if(command.contentEquals("updateForm")) {
			controller=new UpdateFormController();
		}else if(command.contentEquals("updateMember")) {
			controller=new UpdateMemberController();
		}else if(command.contentEquals("updateMemberResult")) {
			controller=new UpdateMemberResultController();
		}else if(command.equals("findMemberByAddressForm")) {
			controller=new FindMemberByAddressFormController();
		}else if(command.equals("findMemberByAddress")) {
			controller=new FindMemberByAddressController();
		}else if(command.equals("idcheck")) {
			controller=new IdCheckController();
		}
		return controller;
	}
}






















