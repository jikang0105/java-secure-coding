package school.exception;

public class PersonNotFoundException extends Exception {
		
	private static final long serialVersionUID = 560931026257219887L;

	public PersonNotFoundException(String message){
		super(message);
	}
}
