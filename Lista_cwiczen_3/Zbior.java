
public class Zbior {
	
	private Para[] p;
	
	public Zbior(){ 		//konstruktor domy�lny
		this.p = new Para[10];
	}
	
	public Zbior(int rozmiarZbioru){		// konstruktor pobieraj�cy rozmiar zbioru
		this.p = new Para[rozmiarZbioru];
	}
	
	public Para szukaj(String klucz){	// metoda wyszukuj�ca pary kluczy
		for(Para para : this.p){
			if(para != null){			// pomini�cie pustych miejsc
				if(klucz.equals(para.klucz)){// por�wnanie wprowadzonego klucza z kluczami par ze zbioru
					return para;			// w przypadku znalezienia zwr�cenie pary z danym kluczem
				}
			}
		}return null;
	}
	
	public void wstaw(Para para){		// metoda wstawiaj�ca now� par� do zbioru
		boolean czyJestMaPara = false;
		boolean czyJestWolnaPozycja = false;
		boolean czyPorownany = false;
		int wolnaPozycja = 0;
		for(int i=0;i<p.length;i++){
			if(p[i] != null){			// warunek pomijaj�cy sprawdzanie wolnego miejsca
				if(para.equals(p[i])){ 	// warunek por�wnuj�cy elementy zbioru z wstawian� par�
					czyJestMaPara = true;
				}
				czyPorownany = true;	// zmienna na wypadek gdyby ca�y zbi�r by� pusty
			}
			if(!czyJestWolnaPozycja && p[i] == null){	// warunek wyszukuj�cy pierwsz� woln� pozycj� w zbiorze 
				czyJestWolnaPozycja = true;
				wolnaPozycja = i;
			}
		}
		if(!czyJestMaPara || czyPorownany){	// je�li nie znaleziono identycznej pary,
			if(czyJestWolnaPozycja){		// oraz znaleziono woln� pozycj� w zbiorze,
				p[wolnaPozycja] = para;	// nowa para zostanie tam dodana
				System.out.println("Dodano do zbioru par�: "+para);
			}else {
				System.out.println("Tablica zbioru pe�na.");
			}
		}else {
			System.out.println("Para o tym kluczu istnieje ju� w zbiorze.");
		}
	}
	
	public void wstawAlboAktualizuj(Para para){	// metoda wstawiaj�ca par� lub aktualizuj�ca warto�� pary
		boolean czyJestPara = false;
		boolean czyJestWolnaPozycja = false;
		boolean czyPorownany = false;
		int wolnaPozycja = 0;
		for(int i=0;i<p.length;i++){
			if(p[i] != null){						// warunek pomijaj�cy sprawdzanie wolnego miejsca
				if(para.equals(p[i])){					// warunek por�wnuj�cy elementy zbioru z wstawian� par�
					p[i].setWartosc(para.getWartosc());	// w przypadku znalezienia tego samego klucza, warto�� zostanie zaktualizowana
					czyJestPara = true;
				}
				czyPorownany = true;		// zmienna na wypadek gdyby ca�y zbi�r by� pusty
			}
			if(!czyJestWolnaPozycja && p[i] == null){	// warunek wyszukuj�cy pierwsz� woln� pozycj� w zbiorze
				czyJestWolnaPozycja = true;
				wolnaPozycja = i;
			}
		}
		if(!czyJestPara || czyPorownany){	// je�li nie znaleziono identycznej pary
			if(czyJestWolnaPozycja){		// oraz znaleziono woln� pozycj� w zbiorze,
				p[wolnaPozycja] = para;	// nowa para zostanie tam dodana
				System.out.println("Dodano do zbioru par�: "+para);
			}else {
				System.out.println("Tablica zbioru pe�na.");
			}
		}else {
			System.out.println("Para o tym kluczu istnieje, warto�� zaktualizowana.");
		}
	}
	
	public int ile(){		// metoda zwracaj�ca ilo�� zaj�tych pozycji w zbiorze
		int i = 0;
		for(Para z : this.p){
			if(z != null) i++;
		}
		return i;
	}
	
	public void wyczysc(){		//	metoda czyszcz�ca zbi�r
		for(Para z : this.p){
			z = null;
		}
	}
	
	public void dodaj(Zbior zbior){		// metoda dodaj�ca do aktualnego zbioru 
										// nowe elementy ze zbioru podanego w argumencie
		
		Zbior zbiorTymczasowy = zbior;	// utworzenie klonu zbioru podanego w argumencie
		
		zbiorTymczasowy.odejmij(this);	// odj�cie od zbioru tymczasowego par kt�re si� powtarzaj�
										// za pomoc� metody odejmij(Zbior zbior)
		
		int l;
		if((this.ile()+zbiorTymczasowy.ile()) > this.p.length){	// sprawdzenie czy obecny zbi�r pomie�ci wszystkie pary 
			l = this.ile()+zbiorTymczasowy.ile();
		}else l = this.p.length;
		
		Para[] nowyZbior = new Para[l];	// utworzenie nowego zbioru 
		int liczbaPar = 0;
		for(Para i : this.p){
			if(i != null){		// implementacja par ze zbioru na kt�rym zosta�a zastosowana metoda do nowego zbioru
				nowyZbior[liczbaPar] = i;
				liczbaPar++;
			}
		}
		for(Para j : zbiorTymczasowy.p){
			if(j != null){		// implementacja par ze zbioru zadeklarowanego w argumencie do nowego zbioru
				nowyZbior[liczbaPar] = j;
				liczbaPar++;
			}
		}
		this.p = nowyZbior;		// zast�pienie obecnego zbioru nowym zawieraj�cym pary z obu zbior�w
	}
	
	public void odejmij(Zbior zbior){	// metoda odejmuj�ca pary ze zbioru kt�re powtarzaj� si� w zbiorze zadeklarowanym w argumencie
		for(Para i : zbior.p){
			if(i != null){
				for(Para j : this.p){
					if(j != null && i.equals(j)) {	// por�wnanie ka�dej pary z tego zbioru z par� ze zbioru zadeklarowanego w argumencie
						j = null;	// usuni�cie pary w przypadku znalezienia tego samego klucza
					}
				}
			}
		}
	}
	
	public void pomno�(Zbior zbior){	// metoda pozostawiaj�ca w zbiorze pary kt�re wyst�puj� tak�e w zbiorze zadeklarowanym w argumencie
		for(Para i : this.p){			// p�tla przez wszystkie elementy zbioru
			boolean czyJestPara = false;// pocz�tkowe ustawienie zmiennej czyJestPara na false
			if(i != null){
				for(Para j : zbior.p){	// p�tla przez wszystkie elementy zbioru z argumentu
					if(i.equals(j)) {	// por�wnanie kluczy z pary ze zbioru z kluczami z par ze zbioru zadeklarowanego w argumencie
						czyJestPara = true;	//	w przypadku znalezienia pary zmiana zmiennej czyJestPara na true 
					}
				}
			}
			if(!czyJestPara) i = null; 	// w przypadku gdy �aden klucz z pary ze zbioru z argumentu nie pasuje do klucza z pary z aktualnej i-teracji zbioru
										// para ta zostaje skasowana ze zbioru
		}
	}

	
//	public void test(){		//	metoda wy�wietlaj�ca zawarto�� zbioru
//		for(Para z : p){
//			System.out.println(z);
//		}
//	}
}
