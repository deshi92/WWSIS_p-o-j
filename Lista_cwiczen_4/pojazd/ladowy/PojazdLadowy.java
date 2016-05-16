package pojazd.ladowy;

import pojazd.Pojazd;

public abstract class PojazdLadowy extends Pojazd {
	
	private int liczbaKol;
	
	public PojazdLadowy(String nazwa){
		super(nazwa);
	}
	
	public abstract void rozpocznijJazde();
	
	public void setLiczbaKol(int i){
		this.liczbaKol = i;
	}
	
	public int getLiczbaKol(){
		return this.liczbaKol;
	}
}
