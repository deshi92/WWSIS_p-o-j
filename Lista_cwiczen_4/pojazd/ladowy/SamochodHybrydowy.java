package pojazd.ladowy;

import pojazd.Spalinowy;
import pojazd.Elektryczny;

public class SamochodHybrydowy extends Samochod implements Spalinowy,Elektryczny{

	private double poziomNaladowania;
	private double poziomSpalania;
	private int pojemnoscBaku;

	public SamochodHybrydowy(String nazwa) {
		super(nazwa);
	}

	@Override
	public double getPoziomNaladowania() {
		return this.poziomNaladowania;
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
		System.out.println("Samochod hybrydowy ruszy³!");
	}
}
