
public class ZbiorRozszerzony extends Zbior {

	private int rozmiarZbioru;
	
	public ZbiorRozszerzony(){	//konstruktor domyślny
		super(20);
		this.rozmiarZbioru = 20;
	}
	
	public ZbiorRozszerzony(int rozmiarZbioru){	// konstruktor pobierający rozmiar zbioru
		super(rozmiarZbioru);
		this.rozmiarZbioru = rozmiarZbioru;
	}
	
	@Override
	public int ile(){		// metoda podająca rozmiar zbioru
		return this.rozmiarZbioru;		// zwrócenie rozmiaru
	}
	
	public Para szukaj(Para para){		// metoda szukająca na podstawie pojedyńczego argumentu
		Zbior tempZbior = (Zbior) this; // wykorzystanie polimorfizmu
		return tempZbior.szukaj(para.klucz);
	}
	
	public Para szukaj(Para... pary){	// metoda szukająca na podstawie wielu argumentów
		Zbior tempZbior = (Zbior) this;	// wykorzystanie polimorfizmu
		for(Para pa : pary){
			return tempZbior.szukaj(pa.klucz);
		}return null;
	}
}