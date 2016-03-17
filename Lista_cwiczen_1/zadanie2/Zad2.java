package zadanie2;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		System.out.print("Proszê podaæ pierwsz¹ liczbê: ");
		Scanner liczbaznak = new Scanner(System.in);	// inicjacja skanera
		int x = liczbaznak.nextInt();					// pobranie pierwszej liczby do zmiennej "x"
		
		System.out.print("Proszê wybraæ dzia³anie: \n+ dodawanie \n- odejmowanie \n* mno¿enie \n/ dzielenie  ");
		String dzialanie = liczbaznak.next();		// pobranie znaku
		char znak = dzialanie.charAt(0);			// wyci¹gniêcie pierwszego wpisanego znaku do typu char
		
		System.out.print("Proszê podaæ drug¹ liczbê: ");
		int y = liczbaznak.nextInt();				//	pobranie drugiej liczby do zmiennej "y"

		switch(znak){			// pêtla switch wyœwietla wynik w zale¿noœci od wybranego dzia³ania
			case '+' : System.out.println(x+"+"+y+"="+(x+y));
			break;
			case '-' : System.out.println(x+"-"+y+"="+(x-y));
			break;
			case '*' : System.out.println(x+"*"+y+"="+(x*y));
			break;
			case '/' : while (y==0){	// pêtla sprawdzaj¹ca czy druga zmienna nie jest zerem
				System.out.println("Nie mo¿na podzieliæ przez 0");
				System.out.print("Proszê inn¹ liczbê: ");
				y = liczbaznak.nextInt();
			}
			System.out.println(x+"/"+y+"="+(x/y));
			break;
			default : System.out.println("Wprowadzono niepoprawny znak: "+znak);
		}
		liczbaznak.close();
		
	}	

}