package pojazd.wodny;

import pojazd.Pojazd;

public abstract class PojazdWodny extends Pojazd {

	private double wypornosc;
	
	public PojazdWodny(String nazwa){
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
