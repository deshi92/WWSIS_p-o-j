package zadanie2;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		System.out.print("Prosz� poda� pierwsz� liczb�: ");
		Scanner liczbaznak = new Scanner(System.in);	// inicjacja skanera
		int x = liczbaznak.nextInt();					// pobranie pierwszej liczby do zmiennej "x"
		
		System.out.print("Prosz� wybra� dzia�anie: \n+ dodawanie \n- odejmowanie \n* mno�enie \n/ dzielenie  ");
		String dzialanie = liczbaznak.next();		// pobranie znaku
		char znak = dzialanie.charAt(0);			// wyci�gni�cie pierwszego wpisanego znaku do typu char
		
		System.out.print("Prosz� poda� drug� liczb�: ");
		int y = liczbaznak.nextInt();				//	pobranie drugiej liczby do zmiennej "y"

		switch(znak){			// p�tla switch wy�wietla wynik w zale�no�ci od wybranego dzia�ania
			case '+' : System.out.println(x+"+"+y+"="+(x+y));
			break;
			case '-' : System.out.println(x+"-"+y+"="+(x-y));
			break;
			case '*' : System.out.println(x+"*"+y+"="+(x*y));
			break;
			case '/' : while (y==0){	// p�tla sprawdzaj�ca czy druga zmienna nie jest zerem
				System.out.println("Nie mo�na podzieli� przez 0");
				System.out.print("Prosz� inn� liczb�: ");
				y = liczbaznak.nextInt();
			}
			System.out.println(x+"/"+y+"="+(x/y));
			break;
			default : System.out.println("Wprowadzono niepoprawny znak: "+znak);
		}
		liczbaznak.close();
		
	}	

}