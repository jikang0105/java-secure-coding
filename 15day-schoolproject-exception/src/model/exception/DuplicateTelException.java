package model.exception;

public class DuplicateTelException extends Exception {
	
	private static final long serialVersionUID = 112315956294104376L;

	public DuplicateTelException(String message){
		super(message);
	}
}
