package zadanie5;

import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {

		System.out.print("Podaj liczb� ca�kowit� wi�ksz� ni� 1: ");
		Scanner wczyt = new Scanner(System.in);		// inicjacja skanera
		int x = wczyt.nextInt();				// wczytanie liczby
		while (x<=1){		// p�tla sprawdzaj�ca czy druga zmienna jest wi�ksza od 1
			System.out.println("podana liczba jest mniejsza/r�wna 1");
			System.out.print("Prosz� inn� liczb�: ");
			x = wczyt.nextInt();
		}
				// test sprawdzaj�cy pierwszo�� liczby
		boolean test = true;		// ustawienie pocz�tkowej testu warto�ci na prawdziwy
		for(int i=2;i*i<=x;i++){	// p�tla sprawdzaj�ca reszty z dzielenia do pierwiastka wprowadzonej liczby
		   if(x%i==0)				// w przypadku znalezienia liczny przez kt�r� mo�na podzieli� wprowadzan� liczb�, wynik testu zmienia sie na fa�szywy
		    test = false;
		}
		if(test){
			System.out.println("Podana liczba jest liczb� pierwsz�");
		}
		else{
			System.out.println("Podana liczba nie jest liczb� pierwsz�");
		}
	
		wczyt.close();
	}

}
