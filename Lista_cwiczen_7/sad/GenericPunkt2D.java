package sad;

import java.lang.Number;

public class GenericPunkt2D<X, Y> implements Comparable<Object> {

	private X argumenty;
	private Y wartosci;
	
	public GenericPunkt2D(X argumenty, Y wartosci) {
		this.argumenty = argumenty;
		this.wartosci = wartosci;
	}
	
	public int getY() {
		return ((Number) argumenty).intValue();
	}
	
	public void setY(X argumenty) {
		this.argumenty = argumenty;
	}
	
	public int getX() {
		return ((Number) wartosci).intValue();
	}
	
	public void setX(Y wartosci) {
		this.wartosci = wartosci;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.getX();
		result = prime * result + this.getY();
		return result;
	}

	@Override
	public boolean equals(Object punkt){
		if(this == punkt) 
			return true;
		if(punkt == null)
			return false;
		if(this.getClass() != punkt.getClass()) 
			return false;
		if(!(punkt instanceof Punkt2D))
			return false;
		Punkt2D pktPomocniczy = (Punkt2D) punkt;
		if(this.getX() != pktPomocniczy.getX())
			return false;
		if(this.getY() != pktPomocniczy.getY())
			return false;
		return true;
	}

	@Override
	public int compareTo(Object punkt) {
		if(!(punkt instanceof Punkt2D)){
			System.err.println("Porwnano objekt, który nie nale¿y do klasy 'Punkt2D'");
			return 0;
		}
		Punkt2D pktPomocniczy = (Punkt2D) punkt;
		double localA = Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
		double localB = Math.sqrt(Math.pow(pktPomocniczy.getX(), 2) + Math.pow(pktPomocniczy.getY(), 2));
		return (localA < localB) ? -1 : ((localA == localB) ? 0 : 1);
	}
	
	@Override
	public String toString() {
		return "GenericPunkt2D "+this.getX()+"x,"+this.getY()+"y";
	}

}
