package zadanie1;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		System.out.print("Podaj temperature w skali Celcjusza: ");	// wy�wietlenie tekstu instrukcji
		Scanner stopnieC = new Scanner(System.in);					// zainicjowanie skanera
		
		while (!stopnieC.hasNextInt()) {							// utworzenie p�tli sprawdzaj�cej poprawno�� wprowadzania do skanera
			System.out.println("To nie jest liczba calkowita: " + stopnieC.next());
			System.out.print("Prosz� poda� liczb� calkowit�: ");
		}
		
		int stopnieF = stopnieC.nextInt();				// utworzenie zmiennej typu int  aby m�c zastosowa� algorytm przekszta�cania
		int intstopnieC = stopnieF;						// utworzenie zmiennej typu int  aby m�c poda� pierwotnie wpisane dane
		stopnieF =((stopnieF * 9)/5)+32;				// algorytm przekszta�cania
		System.out.print(intstopnieC + " stopni Celciusza r�wna si� " + stopnieF + " stopni Fahrenheita");  // ko�cowy tekst wy�wietlaj�cy wynik programu
		stopnieC.close();
	}

}
