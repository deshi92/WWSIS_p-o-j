package operacje;

/**
 * @author Adam Czechowski
 *
 */
public interface Dzialanie {
	
	/**
	 * @return Symbol operacji matematycznej, czyli np. "+" dla dodawania
	 */
	String getSymbol();
	
	/**
	 * @param symbol Symbol operacji matematycznej, np. "+"
	 * @return OperacjaMatematyczna reprezentowana przez symbol podany w argumencie, badz null, jeœli nie ma OperacjiMatematycznej
	 * z tym symbolem. Metoda powinna byæ zaimplementowana w taki sposob, aby nie musiala byc w zaden sposob modyfikowana po dodaniu
	 * kolejnej operacji matematycznej do enuma, badz usunieciu istniejacej.
	 */
	OperacjaMatematyczna getBySymbol(String symbol);
	
}
