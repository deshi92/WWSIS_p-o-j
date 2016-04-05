package zadanie1_i_2;

public class Flota {

	private Statek[] ship;
	private Statek lider = null;
	
	
	public Flota(){							//		metoda tworz�ca flot� 10 statk�w
		this.ship = new Statek[10];
		for(int i=0;i<ship.length;i++){
			this.ship[i] = new Statek();
			
		}
	}
	
	public void setFlota(){					//		metoda rozmieszczaj�ca statki (0,1)(0,2)....(0,10)
		int i = 1;
		for(Statek s : ship){
			s.setPozycjaStart(0, i);
			i++;
		}
	}
	public void setLider(int i){			//		metoda ustawiaj�ca lidera
		this.lider = this.ship[i];
	}
	
	public void pozycjaFlota(){					//		metoda umo�liwiaj�ca podgl�d pozycji statk�w
		int i = 0;
		for (Statek s : ship){
			System.out.println("Ship"+i+": "+s.getPozycjaX()+"x, "+s.getPozycjaY()+"y");
			i++;
			if(i==10)System.out.println("");
		}
	}
	

	public void moveTo(int x, int a, int b){	// metoda przesuwaj�ca statek x o wsp��dn� X, Y.
		if(this.ship[x] == this.lider){			// sprawdzenie czy wybrany statek jest liderem
			for(int i=0;i<ship.length;i++){		// przesuni�cie wszystkich statk�w w przypadku potwierdzenia
				int c = this.ship[i].getPozycjaX();		// utworzenie zmiennych c i d przechowywuj�cych pozycj� wej�ciow�
				int d = this.ship[i].getPozycjaY();
				this.ship[i].setPozycja(a, b);		// zmiana pozycji statku "i" na now�
				for(int k=0;k<10;k++){				// p�tla por�wnuj�ca nowe miejsce z pozycjami innych statk�w
					if(i == k)continue;
					if(this.ship[i].getPozycjaX() == this.ship[k].getPozycjaX() && this.ship[i].getPozycjaY() == this.ship[k].getPozycjaY()) { 
						this.ship[i].setPozycjaXto(c);			// powr�t na poprzedni� pozycj� w przypadku gdy miejsce jest ju� zaj�te
						this.ship[i].setPozycjaYto(d);
						System.out.println("Pozycja jest ju� zaj�ta\n");
						break;
					}
				}
			}
			
		} else{									// w przypadku gdy wybrany statek nie jest liderem przesuni�cie jedynie jego
			int c = this.ship[x].getPozycjaX();		// utworzenie zmiennych c i d przechowywuj�cych pozycj� wej�ciow�
			int d = this.ship[x].getPozycjaY();
			this.ship[x].setPozycja(a, b);		// zmiana pozycji statku x na now�
			for(int k=0;k<10;k++){				// p�tla por�wnuj�ca nowe miejsce z pozycjami innych statk�w
				if(x == k)continue;
				if(this.ship[x].getPozycjaX() == this.ship[k].getPozycjaX() && this.ship[x].getPozycjaY() == this.ship[k].getPozycjaY()) { 
					this.ship[x].setPozycjaXto(c);			// powr�t na poprzedni� pozycj� w przypadku gdy miejsce jest ju� zaj�te
					this.ship[x].setPozycjaYto(d);
					System.out.println("Pozycja jest ju� zaj�ta\n");
					break;
				}
			}
		}
	}
	
	public void moveToStart(int x){				// metoda powr�t statku do pozycji startowej
		if(this.ship[x] == this.lider){
			moveToStartAll();
		}else{
			int c = this.ship[x].getPozycjaX();		// utworzenie zmiennych c i d przechowywuj�cych pozycj� wej�ciow�
			int d = this.ship[x].getPozycjaY();
			this.ship[x].returnXY();				// powr�t statku do pozycji startowej
			
			for(int k=0;k<10;k++){				// p�tla por�wnuj�ca nowe miejsce z pozycjami innych statk�w
				if(k == x)continue;
				if(this.ship[x].getPozycjaX() == this.ship[k].getPozycjaX() && this.ship[x].getPozycjaX() == this.ship[k].getPozycjaY()) { 
					this.ship[x].setPozycjaXto(c);			// powr�t na poprzedni� pozycj� w przypadku gdy miejsce jest ju� zaj�te
					this.ship[x].setPozycjaYto(d);
					System.out.println("Pozycja jest ju� zaj�ta\n");
					break;
				}
			}
		}
	}
	
	public void moveToStartAll(){		// metoda powrotu wszystkich statk�w do pozycji startowej
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
