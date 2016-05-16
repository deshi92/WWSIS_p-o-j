package pojazd.poduszkowiec;

import pojazd.ladowy.PojazdLadowy;

public abstract class PojazdPoduszkowiec extends PojazdLadowy {

	private double wypornosc;
	
	public PojazdPoduszkowiec(String nazwa){
		super(nazwa);
	}
	
	public abstract void wyplyn();
	
	public void setWypornosc(double i){
		this.wypornosc = i;
	}
	
	public double getWypornosc(){
		return this.wypornosc;
	}
}
