
public class Zbior {
	
	private Para[] p;
	
	public Zbior(){ 		//konstruktor domyœlny
		this.p = new Para[10];
	}
	
	public Zbior(int rozmiarZbioru){		// konstruktor pobieraj¹cy rozmiar zbioru
		this.p = new Para[rozmiarZbioru];
	}
	
	public Para szukaj(String klucz){	// metoda wyszukuj¹ca pary kluczy
		for(Para para : this.p){
			if(para != null){			// pominiêcie pustych miejsc
				if(klucz.equals(para.klucz)){// porównanie wprowadzonego klucza z kluczami par ze zbioru
					return para;			// w przypadku znalezienia zwrócenie pary z danym kluczem
				}
			}
		}return null;
	}
	
	public void wstaw(Para para){		// metoda wstawiaj¹ca now¹ parê do zbioru
		boolean czyJestMaPara = false;
		boolean czyJestWolnaPozycja = false;
		boolean czyPorownany = false;
		int wolnaPozycja = 0;
		for(int i=0;i<p.length;i++){
			if(p[i] != null){			// warunek pomijaj¹cy sprawdzanie wolnego miejsca
				if(para.equals(p[i])){ 	// warunek porównuj¹cy elementy zbioru z wstawian¹ par¹
					czyJestMaPara = true;
				}
				czyPorownany = true;	// zmienna na wypadek gdyby ca³y zbiór by³ pusty
			}
			if(!czyJestWolnaPozycja && p[i] == null){	// warunek wyszukuj¹cy pierwsz¹ woln¹ pozycjê w zbiorze 
				czyJestWolnaPozycja = true;
				wolnaPozycja = i;
			}
		}
		if(!czyJestMaPara || czyPorownany){	// jeœli nie znaleziono identycznej pary,
			if(czyJestWolnaPozycja){		// oraz znaleziono woln¹ pozycjê w zbiorze,
				p[wolnaPozycja] = para;	// nowa para zostanie tam dodana
				System.out.println("Dodano do zbioru parê: "+para);
			}else {
				System.out.println("Tablica zbioru pe³na.");
			}
		}else {
			System.out.println("Para o tym kluczu istnieje ju¿ w zbiorze.");
		}
	}
	
	public void wstawAlboAktualizuj(Para para){	// metoda wstawiaj¹ca parê lub aktualizuj¹ca wartoœæ pary
		boolean czyJestPara = false;
		boolean czyJestWolnaPozycja = false;
		boolean czyPorownany = false;
		int wolnaPozycja = 0;
		for(int i=0;i<p.length;i++){
			if(p[i] != null){						// warunek pomijaj¹cy sprawdzanie wolnego miejsca
				if(para.equals(p[i])){					// warunek porównuj¹cy elementy zbioru z wstawian¹ par¹
					p[i].setWartosc(para.getWartosc());	// w przypadku znalezienia tego samego klucza, wartoœæ zostanie zaktualizowana
					czyJestPara = true;
				}
				czyPorownany = true;		// zmienna na wypadek gdyby ca³y zbiór by³ pusty
			}
			if(!czyJestWolnaPozycja && p[i] == null){	// warunek wyszukuj¹cy pierwsz¹ woln¹ pozycjê w zbiorze
				czyJestWolnaPozycja = true;
				wolnaPozycja = i;
			}
		}
		if(!czyJestPara || czyPorownany){	// jeœli nie znaleziono identycznej pary
			if(czyJestWolnaPozycja){		// oraz znaleziono woln¹ pozycjê w zbiorze,
				p[wolnaPozycja] = para;	// nowa para zostanie tam dodana
				System.out.println("Dodano do zbioru parê: "+para);
			}else {
				System.out.println("Tablica zbioru pe³na.");
			}
		}else {
			System.out.println("Para o tym kluczu istnieje, wartoœæ zaktualizowana.");
		}
	}
	
	public int ile(){		// metoda zwracaj¹ca iloœæ zajêtych pozycji w zbiorze
		int i = 0;
		for(Para z : this.p){
			if(z != null) i++;
		}
		return i;
	}
	
	public void wyczysc(){		//	metoda czyszcz¹ca zbiór
		for(Para z : this.p){
			z = null;
		}
	}
	
	public void dodaj(Zbior zbior){		// metoda dodaj¹ca do aktualnego zbioru 
										// nowe elementy ze zbioru podanego w argumencie
		
		Zbior zbiorTymczasowy = zbior;	// utworzenie klonu zbioru podanego w argumencie
		
		zbiorTymczasowy.odejmij(this);	// odjêcie od zbioru tymczasowego par które siê powtarzaj¹
										// za pomoc¹ metody odejmij(Zbior zbior)
		
		int l;
		if((this.ile()+zbiorTymczasowy.ile()) > this.p.length){	// sprawdzenie czy obecny zbiór pomieœci wszystkie pary 
			l = this.ile()+zbiorTymczasowy.ile();
		}else l = this.p.length;
		
		Para[] nowyZbior = new Para[l];	// utworzenie nowego zbioru 
		int liczbaPar = 0;
		for(Para i : this.p){
			if(i != null){		// implementacja par ze zbioru na którym zosta³a zastosowana metoda do nowego zbioru
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
		this.p = nowyZbior;		// zast¹pienie obecnego zbioru nowym zawieraj¹cym pary z obu zbiorów
	}
	
	public void odejmij(Zbior zbior){	// metoda odejmuj¹ca pary ze zbioru które powtarzaj¹ siê w zbiorze zadeklarowanym w argumencie
		for(Para i : zbior.p){
			if(i != null){
				for(Para j : this.p){
					if(j != null && i.equals(j)) {	// porównanie ka¿dej pary z tego zbioru z par¹ ze zbioru zadeklarowanego w argumencie
						j = null;	// usuniêcie pary w przypadku znalezienia tego samego klucza
					}
				}
			}
		}
	}
	
	public void pomno¿(Zbior zbior){	// metoda pozostawiaj¹ca w zbiorze pary które wystêpuj¹ tak¿e w zbiorze zadeklarowanym w argumencie
		for(Para i : this.p){			// pêtla przez wszystkie elementy zbioru
			boolean czyJestPara = false;// pocz¹tkowe ustawienie zmiennej czyJestPara na false
			if(i != null){
				for(Para j : zbior.p){	// pêtla przez wszystkie elementy zbioru z argumentu
					if(i.equals(j)) {	// porównanie kluczy z pary ze zbioru z kluczami z par ze zbioru zadeklarowanego w argumencie
						czyJestPara = true;	//	w przypadku znalezienia pary zmiana zmiennej czyJestPara na true 
					}
				}
			}
			if(!czyJestPara) i = null; 	// w przypadku gdy ¿aden klucz z pary ze zbioru z argumentu nie pasuje do klucza z pary z aktualnej i-teracji zbioru
										// para ta zostaje skasowana ze zbioru
		}
	}

	
//	public void test(){		//	metoda wyœwietlaj¹ca zawartoœæ zbioru
//		for(Para z : p){
//			System.out.println(z);
//		}
//	}
}
