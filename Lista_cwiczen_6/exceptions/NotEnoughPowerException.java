package exceptions;

public class NotEnoughPowerException extends Exception {

	public NotEnoughPowerException(int i){
		System.err.println("W "+i+" bateri/ach brakuje mocy!");
	}
}
