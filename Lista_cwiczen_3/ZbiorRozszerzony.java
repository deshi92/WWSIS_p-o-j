
public class ZbiorRozszerzony extends Zbior {

	private int rozmiarZbioru;
	
	public ZbiorRozszerzony(){	//konstruktor domy�lny
		super(20);
		this.rozmiarZbioru = 20;
	}
	
	public ZbiorRozszerzony(int rozmiarZbioru){	// konstruktor pobieraj�cy rozmiar zbioru
		super(rozmiarZbioru);
		this.rozmiarZbioru = rozmiarZbioru;
	}
	
	@Override
	public int ile(){		// metoda podaj�ca rozmiar zbioru
		return this.rozmiarZbioru;		// zwr�cenie rozmiaru
	}
	
	public Para szukaj(Para para){		// metoda szukaj�ca na podstawie pojedy�czego argumentu
		Zbior tempZbior = (Zbior) this; // wykorzystanie polimorfizmu
		return tempZbior.szukaj(para.klucz);
	}
	
	public Para szukaj(Para... pary){	// metoda szukaj�ca na podstawie wielu argument�w
		Zbior tempZbior = (Zbior) this;	// wykorzystanie polimorfizmu
		for(Para pa : pary){
			return tempZbior.szukaj(pa.klucz);
		}return null;
	}
}