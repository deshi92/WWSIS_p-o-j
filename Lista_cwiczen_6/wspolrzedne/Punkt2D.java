package wspolrzedne;

/**
 * @author Adam Czechowski
 *
 */
public class Punkt2D {
	
	private int x;
	private int y;
	
	
	public Punkt2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	@Override
	public Punkt2D clone() {
		return new Punkt2D(this.x, this.y);
	}
	
	@Override
	public String toString() {
		return "x = " + this.x + ", y = " + this.y;
	}
	
	/**
	 * Dwa punkty uznajemy za równe, je¿eli ich wspolrzedne maja taka sama wartosc
	 */
	@Override
	public boolean equals(Object object) {
		return ((Punkt2D) object).getX() == this.getX() && ((Punkt2D) object).getY() == this.getY();
	}
	
}
