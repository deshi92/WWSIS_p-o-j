package operacje.napunktach;

import operacje.Dzialanie;
import operacje.OperacjaMatematyczna;
import wspolrzedne.Punkt2D;

public class Main {

	private static Punkt2D oblicz(OperacjaMatematyczna operacja, Punkt2D... punkt){
		if(punkt.length == 0)return null;	// jeœli punkty s¹ puste zwraca null
		int obliczenieX = punkt[0].getX();	// w innym przypadku przypisanie pierwszych liczb do zmiennych które s¹ zwracane
		int obliczenieY = punkt[0].getY();
		if(punkt.length > 1){		// jeœli jest wiêcej ni¿ jeden punkt wykonanie odpowiedniej operacji
			if(operacja.getSymbol() == "+"){
				for(int i=1;i<punkt.length;i++){
					obliczenieX += punkt[i].getX();
					obliczenieY += punkt[i].getY();
				}
			}else if(operacja.getSymbol() == "-"){
				for(int i=1;i<punkt.length;i++){
					obliczenieX -= punkt[i].getX();
					obliczenieY -= punkt[i].getY();
				}
			}else if(operacja.getSymbol() == "*"){
				for(int i=1;i<punkt.length;i++){
					obliczenieX *= punkt[i].getX();
					obliczenieY *= punkt[i].getY();
				}
			}else if(operacja.getSymbol() == "/"){
				for(int i=1;i<punkt.length;i++){
					obliczenieX /= punkt[i].getX();
					obliczenieY /= punkt[i].getY();
				}
			}
		}return new Punkt2D(obliczenieX, obliczenieY); // zwracanie punktu z obliczonymi zmiennymi
	}
	
	public static void main(String[] args) {
		Punkt2D punkt1 = oblicz(OperacjaMatematyczna.DODAWANIE, new Punkt2D(1, 1), new Punkt2D(2, 3));
		Punkt2D punkt11 = oblicz(OperacjaMatematyczna.DODAWANIE);
		Punkt2D punkt12 = oblicz(OperacjaMatematyczna.DODAWANIE, new Punkt2D(1, 1));
		Punkt2D punkt2 = oblicz(OperacjaMatematyczna.ODEJMOWANIE, new Punkt2D(1, 1), new Punkt2D(2, 3), new Punkt2D(4, 2));
		Punkt2D punkt3 = oblicz(OperacjaMatematyczna.MNOZENIE, new Punkt2D(1, 2), new Punkt2D(2, 3));
		Punkt2D punkt4 = oblicz(OperacjaMatematyczna.DZIELENIE, new Punkt2D(4, 6), new Punkt2D(2, 3));
		
		System.out.println(punkt1.getX() == 3);
		System.out.println(punkt1.getY() == 4);
		
		System.out.println(punkt11 == null);
		
		System.out.println(punkt12.getX() == 1);
		System.out.println(punkt12.getY() == 1);
		
		System.out.println(punkt2.getX() == -5);
		System.out.println(punkt2.getY() == -4);
		
		System.out.println(punkt3.getX() == 2);
		System.out.println(punkt3.getY() == 6);
		
		System.out.println(punkt4.getX() == 2);
		System.out.println(punkt4.getY() == 2);
	}
	
}
