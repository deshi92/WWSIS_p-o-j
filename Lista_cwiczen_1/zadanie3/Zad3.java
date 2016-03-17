package zadanie3;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		// pierwsza metoda
		System.out.print("Proszê podaæ liczbê ca³kowit¹: ");
		Scanner wpisanaliczba = new Scanner(System.in);		// zainicjowanie skanera
		int x = wpisanaliczba.nextInt();			// pobranie liczby, do wartoœci której to maj¹ zostaæ wyœwietlone potêgi
		System.out.print("Wartoœci potêgi liczby 2 mniejsze b¹dŸ równe wpisanej liczbie: 1, ");
		for (int a = 1; (a*2)<=x ; a*=2){			// utworzenie pêtli mno¿¹cej poprzedni¹ iteracje i wyœwietlaj¹cej wynik jeœli jest on mniejszy od wpisanej liczby
			System.out.print(a+" ");
		}
		System.out.println("");
		
		// druga metoda z wyko¿ystaniem biblioteki Math
		System.out.print("Proszê podaæ liczbê ca³kowit¹: ");
		int z = wpisanaliczba.nextInt(); 		// pobranie liczby, do wartoœci której to maj¹ zostaæ wyœwietlone potêgi
		System.out.print("Wartoœci potêgi liczby 2 mniejsze b¹dŸ równe wpisanej liczbie: ");
		double c = 0; 						// utworzenie zmiennej typu double do operacji potêgowania
		for(int b=0; (c*2)<=z;b++){			// utworzenie pêtli mno¿¹cej poprzedni¹ iteracje i wyœwietlaj¹cej wynik jeœli jest on mniejszy od wpisanej liczby
			c = Math.pow(2, b);				// operacja potêgowania liczby 2 przez aktualn¹ iteracje pêtli
			System.out.print(c+" ");
		}
		wpisanaliczba.close();
	}

}
