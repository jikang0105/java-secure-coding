package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller = null;
		if(command.contentEquals("getAllPostList")) {
			controller = new GetAllPostListController();
		} else if (command.contentEquals("login")){
			controller = new LoginController();
		} else if (command.contentEquals("logout")) {
			controller = new LogoutController();
		} else if (command.contentEquals("getPostDetail")) {
			controller = new GetPostDetailController();
		} else if (command.contentEquals("writePost")) {
			controller = new WritePostController();
		} else if (command.contentEquals("writePostForm")) {
			controller = new WritePostFormController();
		} else if (command.contentEquals("writePost")) {
			controller = new WritePostController();
		} else if (command.contentEquals("writePostResult")) {
			controller = new WritePostResultController();
		} else if (command.contentEquals("updatePostForm")) {
			controller = new UpdatePostFormController();
		} else if (command.contentEquals("updatePost")) {
			controller = new UpdatePostController();
		}
		return controller;
	}
}
