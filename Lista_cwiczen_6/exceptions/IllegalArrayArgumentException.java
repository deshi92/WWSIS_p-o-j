package exceptions;

public class IllegalArrayArgumentException extends IllegalArgumentException {
	
	public IllegalArrayArgumentException(){ }
	
	public IllegalArrayArgumentException(String string) {
		super(string);
	}
	
}
