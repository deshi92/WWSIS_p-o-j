package zadanie3;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		// pierwsza metoda
		System.out.print("Prosz� poda� liczb� ca�kowit�: ");
		Scanner wpisanaliczba = new Scanner(System.in);		// zainicjowanie skanera
		int x = wpisanaliczba.nextInt();			// pobranie liczby, do warto�ci kt�rej to maj� zosta� wy�wietlone pot�gi
		System.out.print("Warto�ci pot�gi liczby 2 mniejsze b�d� r�wne wpisanej liczbie: 1, ");
		for (int a = 1; (a*2)<=x ; a*=2){			// utworzenie p�tli mno��cej poprzedni� iteracje i wy�wietlaj�cej wynik je�li jest on mniejszy od wpisanej liczby
			System.out.print(a+" ");
		}
		System.out.println("");
		
		// druga metoda z wyko�ystaniem biblioteki Math
		System.out.print("Prosz� poda� liczb� ca�kowit�: ");
		int z = wpisanaliczba.nextInt(); 		// pobranie liczby, do warto�ci kt�rej to maj� zosta� wy�wietlone pot�gi
		System.out.print("Warto�ci pot�gi liczby 2 mniejsze b�d� r�wne wpisanej liczbie: ");
		double c = 0; 						// utworzenie zmiennej typu double do operacji pot�gowania
		for(int b=0; (c*2)<=z;b++){			// utworzenie p�tli mno��cej poprzedni� iteracje i wy�wietlaj�cej wynik je�li jest on mniejszy od wpisanej liczby
			c = Math.pow(2, b);				// operacja pot�gowania liczby 2 przez aktualn� iteracje p�tli
			System.out.print(c+" ");
		}
		wpisanaliczba.close();
	}

}
