package pojazd.ladowy;

import pojazd.Elektryczny;

public class SamochodElektryczny extends Samochod implements Elektryczny{

	private double poziomNaladowania;
	
	public SamochodElektryczny(String nazwa){
		super(nazwa);
	}

	@Override
	public double getPoziomNaladowania() {
		return this.poziomNaladowania;
	}

	@Override
	public void rozpocznijJazde() {
		System.out.println("Samochod elektryczny ruszy³!");
	}
	
	
}
