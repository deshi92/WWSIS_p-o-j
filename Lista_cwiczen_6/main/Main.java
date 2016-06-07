package main;

import exceptions.BatteriesMissingException;
import exceptions.NotEnoughPowerException;
import latarka.Bateria;
import latarka.Latarka;
import latarka.Zarowka;
import wspolrzedne.Punkt2D;

public class Main {
	
	// nie mozesz zmienic w zaden sposob ponizszej linii kodu
	private static final int[] INT_ARRAY = {1, 2, 3, 4, 5};
	
	
	public static final void main(String... args) throws BatteriesMissingException, NotEnoughPowerException {
		int x = generateX(1);
		System.out.println("X = " + x);
		
		int y = generateY(10);
		System.out.println("Y = " + y);
		
		Punkt2D punkt = new Punkt2D(x, y);
		if (punkt.equals(punkt.clone())) {
			System.out.println("TAK");
		} else {
			System.out.println("NIE");
		}
		
		testLatarki();
		
		
		Zarowka zar = new Zarowka();
		
		//IllegalArgumentException
		zar.setJasnosc(10);
		
		System.out.println(zar.getJasnosc());
		Latarka lat = new Latarka();
		lat.setZarowka(zar);
		
		//BatteriesMissingException
		//IllegalArrayArgumentException
		lat.setBaterie(new Bateria[4]);
		
		lat.on();
		lat.off();
		lat.on();
		lat.off();
		lat.on();
		lat.off();
		lat.on();
		lat.off();
		System.out.println("Moc: "+lat.getBaterie()[0].getMoc());
		lat.on();
		lat.off();
		lat.on();
		lat.off();
		lat.on();
		lat.off();
		lat.on();
		lat.off();
		System.out.println("Moc: "+lat.getBaterie()[0].getMoc());
		lat.on();
		lat.off();
		//NotEnoughtPowerExcption
//		lat.on();
//		lat.off();
	}
	
	/**
	 * @return suma liczby podanej w argumencie i wszystkich elementow z tablicy INT_ARRAY
	 */
	private static int generateX(int initialNumber) {
		for (int i = 0; i < INT_ARRAY.length; i++) {
			initialNumber += INT_ARRAY[i];
		}
		
		return initialNumber;
	}
	
	/**
	 * @return iloczyn liczby podanej w argumencie i wszystkich elementow z tablicy INT_ARRAY
	 */
	private static int generateY(int initialNumber) {
		for (int i = 0; i < INT_ARRAY.length; i++) {
			initialNumber *= INT_ARRAY[i];
		}
		
		return initialNumber;
	}
	
	private static void testLatarki() throws BatteriesMissingException, NotEnoughPowerException {
		Latarka latarka = new Latarka();
		latarka.setZarowka(new Zarowka());
		latarka.setBaterie(new Bateria[4]);
		for (Bateria bateria : latarka.getBaterie()) {
			System.out.println("MOC: " + bateria.getMoc());
		}
		// ponizej, jak juz zostana naprawione bledy, powinno sie wyswietlic 'true'
		System.out.println(latarka.czyMoznaWlaczyc());
	}
}
