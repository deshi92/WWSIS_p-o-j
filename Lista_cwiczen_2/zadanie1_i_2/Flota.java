package zadanie1_i_2;

public class Flota {

	private Statek[] ship;
	private Statek lider = null;
	
	
	public Flota(){							//		metoda tworz¹ca flotê 10 statków
		this.ship = new Statek[10];
		for(int i=0;i<ship.length;i++){
			this.ship[i] = new Statek();
			
		}
	}
	
	public void setFlota(){					//		metoda rozmieszczaj¹ca statki (0,1)(0,2)....(0,10)
		int i = 1;
		for(Statek s : ship){
			s.setPozycjaStart(0, i);
			i++;
		}
	}
	public void setLider(int i){			//		metoda ustawiaj¹ca lidera
		this.lider = this.ship[i];
	}
	
	public void pozycjaFlota(){					//		metoda umo¿liwiaj¹ca podgl¹d pozycji statków
		int i = 0;
		for (Statek s : ship){
			System.out.println("Ship"+i+": "+s.getPozycjaX()+"x, "+s.getPozycjaY()+"y");
			i++;
			if(i==10)System.out.println("");
		}
	}
	

	public void moveTo(int x, int a, int b){	// metoda przesuwaj¹ca statek x o wspó³¿êdn¹ X, Y.
		if(this.ship[x] == this.lider){			// sprawdzenie czy wybrany statek jest liderem
			for(int i=0;i<ship.length;i++){		// przesuniêcie wszystkich statków w przypadku potwierdzenia
				int c = this.ship[i].getPozycjaX();		// utworzenie zmiennych c i d przechowywuj¹cych pozycjê wejœciow¹
				int d = this.ship[i].getPozycjaY();
				this.ship[i].setPozycja(a, b);		// zmiana pozycji statku "i" na now¹
				for(int k=0;k<10;k++){				// pêtla porównuj¹ca nowe miejsce z pozycjami innych statków
					if(i == k)continue;
					if(this.ship[i].getPozycjaX() == this.ship[k].getPozycjaX() && this.ship[i].getPozycjaY() == this.ship[k].getPozycjaY()) { 
						this.ship[i].setPozycjaXto(c);			// powrót na poprzedni¹ pozycjê w przypadku gdy miejsce jest ju¿ zajête
						this.ship[i].setPozycjaYto(d);
						System.out.println("Pozycja jest ju¿ zajêta\n");
						break;
					}
				}
			}
			
		} else{									// w przypadku gdy wybrany statek nie jest liderem przesuniêcie jedynie jego
			int c = this.ship[x].getPozycjaX();		// utworzenie zmiennych c i d przechowywuj¹cych pozycjê wejœciow¹
			int d = this.ship[x].getPozycjaY();
			this.ship[x].setPozycja(a, b);		// zmiana pozycji statku x na now¹
			for(int k=0;k<10;k++){				// pêtla porównuj¹ca nowe miejsce z pozycjami innych statków
				if(x == k)continue;
				if(this.ship[x].getPozycjaX() == this.ship[k].getPozycjaX() && this.ship[x].getPozycjaY() == this.ship[k].getPozycjaY()) { 
					this.ship[x].setPozycjaXto(c);			// powrót na poprzedni¹ pozycjê w przypadku gdy miejsce jest ju¿ zajête
					this.ship[x].setPozycjaYto(d);
					System.out.println("Pozycja jest ju¿ zajêta\n");
					break;
				}
			}
		}
	}
	
	public void moveToStart(int x){				// metoda powrót statku do pozycji startowej
		if(this.ship[x] == this.lider){
			moveToStartAll();
		}else{
			int c = this.ship[x].getPozycjaX();		// utworzenie zmiennych c i d przechowywuj¹cych pozycjê wejœciow¹
			int d = this.ship[x].getPozycjaY();
			this.ship[x].returnXY();				// powrót statku do pozycji startowej
			
			for(int k=0;k<10;k++){				// pêtla porównuj¹ca nowe miejsce z pozycjami innych statków
				if(k == x)continue;
				if(this.ship[x].getPozycjaX() == this.ship[k].getPozycjaX() && this.ship[x].getPozycjaX() == this.ship[k].getPozycjaY()) { 
					this.ship[x].setPozycjaXto(c);			// powrót na poprzedni¹ pozycjê w przypadku gdy miejsce jest ju¿ zajête
					this.ship[x].setPozycjaYto(d);
					System.out.println("Pozycja jest ju¿ zajêta\n");
					break;
				}
			}
		}
	}
	
	public void moveToStartAll(){		// metoda powrotu wszystkich statków do pozycji startowej
		for (Statek s : ship){
			s.returnXY();
		}
	}
	
	public int getPozycjaX(int x){
		return this.ship[x].getPozycjaX();
	}
	
	public int getPozycjaY(int x){
		return this.ship[x].getPozycjaY();
	}
}
