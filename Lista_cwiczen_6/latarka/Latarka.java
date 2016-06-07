package latarka;

import exceptions.BatteriesMissingException;
import exceptions.IllegalArrayArgumentException;
import exceptions.NotEnoughPowerException;

/**
 * @author Adam Czechowski
 *
 */
public class Latarka {
	
	private static final int MIN_MOC_BATERII = 15;
	private static final int MAX_LICZBA_BATERII = 4;
	
	/**
	 * Latarka posiada zarowke oraz baterie
	 */
	private Zarowka zarowka;
	private Bateria[] baterie;

	
	public Latarka() {
		this.zarowka = new Zarowka();
		this.baterie = new Bateria[4];
//		for (int i = 0; i < baterie.length; i++) {
//			baterie[i] = new Bateria();
//		}
	}
	
	/**
	 * latarke mozna wlaczyc
	 * @throws BatteriesMissingException 
	 * @throws NotEnoughPowerException 
	 */
	public void on() throws  BatteriesMissingException, NotEnoughPowerException {
		try{
			if (czyMoznaWlaczyc()) {
				this.zarowka.setZaswiecona(true);
				// przy wlaczeniu latarki, moc kazdej z baterii zmniejsza sie jednorazowo o wartosc poziomu jasnosci zarowki
				for (Bateria b : baterie) {
					b.setMoc(b.getMoc() - this.zarowka.getJasnosc());
				}
			}
		}catch(BatteriesMissingException a){
			a.printStackTrace();
			System.exit(0);
		}catch(NotEnoughPowerException b){
			b.printStackTrace();
		}
	}
	
	/**
	 * wylaczyc
	 */
	public void off() {
		if (this.zarowka != null) {
			this.zarowka.setZaswiecona(false);
		}
	}
	
	/**
	 * latarke mozna wlaczyc tylko wtedy, jesli jest w niej zamontowana zarowka, sa zamontowane wszystkie baterie
	 * oraz jest wystarczajaco mocy w bateriach
	 * @throws BatteriesMissingException 
	 * @throws NotEnoughPowerException 
	 */
	public boolean czyMoznaWlaczyc() throws BatteriesMissingException, NotEnoughPowerException {
		return zarowka != null && czySaZamontowaneBaterie() && czyJestWystarczajacoMocy();
	}
	
	private boolean czySaZamontowaneBaterie() throws BatteriesMissingException {
		int i = 0;
		for (Bateria b : baterie) {
			if (b == null) {
				i++;
			}
		}
		if (i>0) throw new BatteriesMissingException(i);
		
		return true;
	}
	
	private boolean czyJestWystarczajacoMocy() throws NotEnoughPowerException {
		int i = 0;
		for (Bateria b : baterie) {
			if (b.getMoc() < MIN_MOC_BATERII) {
				i++;
			}
		}
		if (i>0) throw new NotEnoughPowerException(i);
		
		return true;
	}
	
	public Zarowka getZarowka() {
		return zarowka;
	}

	/**
	 * mozna w niej wymienic zarowke
	 */
	public void setZarowka(Zarowka zarowka) {
		// zarowke mozna wymienic tylko wtedy, kiedy w latarce jest juz zainstalowana zarowka i jesli w tym momencie nie swieci
		if (this.zarowka != null && !this.zarowka.isZaswiecona()) {
			this.zarowka = zarowka;
		}
	}

	public Bateria[] getBaterie() {
		return baterie;
	}

	/**
	 * oraz baterie
	 */
	public void setBaterie(Bateria[] baterie) throws IllegalArrayArgumentException {
		// w latarce moze byc max 4 baterie
		if (baterie != null && baterie.length <= MAX_LICZBA_BATERII) {
			// przed wymiana baterii nalezy wylaczyc latarke
			off();
			for(int i=0;i<baterie.length;i++){
				this.baterie[i] = new Bateria();
			}
		}else if(baterie == null)throw new IllegalArrayArgumentException("Pusta tablica baterii");
		else if (baterie.length > MAX_LICZBA_BATERII)throw new IllegalArrayArgumentException("Za du¿o baterii");
	}
}
