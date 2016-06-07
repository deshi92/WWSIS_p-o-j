package latarka;

/**
 * @author Adam Czechowski
 *
 */
public class Bateria {

	private static final int MIN_MOC = 0;
	private static final int MAX_MOC = 100;
	
	/**
	 * Kazda bateria posiada swoja moc
	 */
	private int moc = MAX_MOC;

	
	public int getMoc() {
		return moc;
	}

	/**
	 * moc 0..100
	 */
	public void setMoc(int moc) throws IllegalArgumentException {
		if (moc < MIN_MOC) {
			throw new IllegalArgumentException("Minimalna moc to 0");
		} else if (moc > MAX_MOC) {
			throw new IllegalArgumentException("Maksymalna moc to 100");
		} else {
			this.moc = moc;
		}
	}
}
