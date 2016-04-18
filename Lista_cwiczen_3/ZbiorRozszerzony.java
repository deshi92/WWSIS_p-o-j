
public class ZbiorRozszerzony extends Zbior {

	private int rozmiarZbioru;
	
	public ZbiorRozszerzony(){	//konstruktor domyœlny
		super(20);
		this.rozmiarZbioru = 20;
	}
	
	public ZbiorRozszerzony(int rozmiarZbioru){	// konstruktor pobieraj¹cy rozmiar zbioru
		super(rozmiarZbioru);
		this.rozmiarZbioru = rozmiarZbioru;
	}
	
	@Override
	public int ile(){		// metoda podaj¹ca rozmiar zbioru
		return this.rozmiarZbioru;		// zwrócenie rozmiaru
	}
	
	public Para szukaj(Para para){		// metoda szukaj¹ca na podstawie pojedyñczego argumentu
		Zbior tempZbior = (Zbior) this; // wykorzystanie polimorfizmu
		return tempZbior.szukaj(para.klucz);
	}
	
	public Para szukaj(Para... pary){	// metoda szukaj¹ca na podstawie wielu argumentów
		Zbior tempZbior = (Zbior) this;	// wykorzystanie polimorfizmu
		for(Para pa : pary){
			return tempZbior.szukaj(pa.klucz);
		}return null;
	}
}