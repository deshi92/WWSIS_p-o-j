package pojazd;

public abstract class Pojazd {
	
	private String nazwa;	
	private int liczbaPasazerow;
	private int maxPredkosc;

	public Pojazd(String nazwa){
		this.nazwa = (nazwa != null) ? nazwa : "";
		
	}
	
	@Override
	public String toString(){
		return "Jest to pojazd: "+this.nazwa+".";
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}else if(this == obj){
			return true;
		}else if(obj instanceof Pojazd){
			Pojazd inny = (Pojazd) obj;
			this.nazwa.equals(inny.nazwa);
		}
		return false;
	}
	
	public void setLiczbaPasazerow(int liczba){
		this.liczbaPasazerow = liczba;
	}
	
	public int getLiczbaPasazerow(){
		return this.liczbaPasazerow;
	}
	
	public void setMaxPredkosc(int predkosc){
		this.maxPredkosc = predkosc;
	}
	
	public int getMaxPredkosc(){
		return this.maxPredkosc;
	}
	
	public String getNazwa(){
		return this.nazwa;
	}
}
