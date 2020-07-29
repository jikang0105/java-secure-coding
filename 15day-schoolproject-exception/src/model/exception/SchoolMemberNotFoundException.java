package model.exception;

public class SchoolMemberNotFoundException extends Exception {
		
	private static final long serialVersionUID = 560931026257219887L;

	public SchoolMemberNotFoundException(String message){
		super(message);
	}
}
