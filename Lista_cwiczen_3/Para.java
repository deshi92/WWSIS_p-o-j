public class Para {
	
	public final String klucz;
	private double wartosc;
	
	public Para(String klucz){
		if("".equals(klucz)){			// null test
            throw new IllegalArgumentException("Argument konstruktora obiektu klasy 'Para' nie mo¿e byæ null");
		}else this.klucz = klucz;
	}
	
	@Override
	public String toString(){
		return klucz;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj) 
			return true;
		if(this.getClass() != obj.getClass()) 
			return false;
		Para inny = (Para) obj;
		if (this.klucz.equals(inny.klucz))
			return true;
		return false;
	}
	
	public double getWartosc(){
		return this.wartosc;
	}
	
	public void setWartosc(double wartosc){
		this.wartosc = wartosc;
	}
	
//	public String getKlucz(){
//		return this.klucz;
//	}
}
