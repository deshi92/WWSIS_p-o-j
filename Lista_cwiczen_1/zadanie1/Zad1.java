package zadanie1;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		System.out.print("Podaj temperature w skali Celcjusza: ");	// wyœwietlenie tekstu instrukcji
		Scanner stopnieC = new Scanner(System.in);					// zainicjowanie skanera
		
		while (!stopnieC.hasNextInt()) {							// utworzenie pêtli sprawdzaj¹cej poprawnoœæ wprowadzania do skanera
			System.out.println("To nie jest liczba calkowita: " + stopnieC.next());
			System.out.print("Proszê podaæ liczbê calkowit¹: ");
		}
		
		int stopnieF = stopnieC.nextInt();				// utworzenie zmiennej typu int  aby móc zastosowaæ algorytm przekszta³cania
		int intstopnieC = stopnieF;						// utworzenie zmiennej typu int  aby móc podaæ pierwotnie wpisane dane
		stopnieF =((stopnieF * 9)/5)+32;				// algorytm przekszta³cania
		System.out.print(intstopnieC + " stopni Celciusza równa siê " + stopnieF + " stopni Fahrenheita");  // koñcowy tekst wyœwietlaj¹cy wynik programu
		stopnieC.close();
	}

}
