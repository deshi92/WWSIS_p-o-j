package pojazd.ladowy;

import pojazd.Spalinowy;

public class SamochodSpalinowy extends Samochod implements Spalinowy {

	private double poziomSpalania;
	private int pojemnoscBaku;
	
	public SamochodSpalinowy(String nazwa) {
		super(nazwa);
	}

	@Override
	public double getPoziomSpalania() {
		return poziomSpalania;
	}

	@Override
	public int getPojemnoscBaku() {
		return pojemnoscBaku;
	}

	@Override
	public void rozpocznijJazde() {
		System.out.println("Samochod spalinowy ruszy³!");
	}

}
