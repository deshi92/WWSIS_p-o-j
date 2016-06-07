package latarka;


/**
 * @author Adam Czechowski
 *
 */
public class Zarowka {
	
	private static final int MIN_JASNOSC = 1;
	private static final int MAX_JASNOSC = 10;
	
	/**
	 * zarowka moze byc zaswiecona badz zgaszona
	 */
	private boolean zaswiecona;
	/**
	 * oraz posiada swoja jasnosc
	 */
	private int jasnosc = MAX_JASNOSC;

	
	public boolean isZaswiecona() {
		return zaswiecona;
	}

	public void setZaswiecona(boolean zaswiecona) {
		this.zaswiecona = zaswiecona;
	}

	public int getJasnosc() {
		return jasnosc;
	}

	/**
	 * jasnosc od 1..10
	 */
	public void setJasnosc(int jasnosc) throws IllegalArgumentException {
		if (jasnosc < MIN_JASNOSC) {
			throw new IllegalArgumentException("Minimalna jastosc to 1");
		} else if (jasnosc > MAX_JASNOSC) {
			throw new IllegalArgumentException("Maksymalna jastosc to 10");
		} else {
			this.jasnosc = jasnosc;
		}
	}
}
