package exceptions;

public class BatteriesMissingException extends Exception {
	
	public BatteriesMissingException(int i){
		System.err.println("Brakuje "+i+" baterii!");
	}

}
