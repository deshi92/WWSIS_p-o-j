package zadanie1_i_2;


public class Statek {
	
	public Statek() {	}

	/*
	 * zmienne z pozycj¹ startowej 
	 */
	private int Sx = 0;
	private int Sy = 0;
		
	/*
	 * zmienne z aktualn¹ pozycj¹ 
	 */
	private int x = 0;
	private int y = 0;
	
	
	public void setPozycjaStart(int a, int b){
		Sx = a;
		Sy = b;
		x = a;
		y = b;
		}
	
	public void returnXY(){
		x = Sx;
		y = Sy;
	}

	
	public int getPozycjaX(){
		return x;
	}
	
	public int getPozycjaY(){
		return y;
	}
	
	/*
	 * metoda pobieraj¹ca dane o zmianie pozycji i pilnuj¹ca,
	 * by statek nie przekroczy³ dozwolonego obszaru
	 * */
	public void setPozycja(int a, int b){
		if(a != 0){
			if(x>=0){
				if(a > Integer.MAX_VALUE-x){
					x = Integer.MAX_VALUE;
				}
				else {
					x += a;
				}
			}
			else{
				if(a < Integer.MIN_VALUE-x){
					x = Integer.MIN_VALUE;
				}		
				else {
					x += a;
				}
			}
		}
		if(b!=0){
			if(y>=0){
				if(b > Integer.MAX_VALUE-y){
					y = Integer.MAX_VALUE;
				}
				else {
					y += b;
				}
			}
			else{
				if(b < Integer.MIN_VALUE-y){
					y = Integer.MIN_VALUE;
				}		
				else {
					y += b;
				}
			}
		}
	}
	
	
	/*
	 * metody przekierowuj¹ce statek na konkretne koordynaty
	 * */
	public void setPozycjaXto(int a){
		x = a;
	}
	
	public void setPozycjaYto(int a){
		y = a;
	}
}