package zadanie5;

import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {

		System.out.print("Podaj liczbê ca³kowit¹ wiêksz¹ ni¿ 1: ");
		Scanner wczyt = new Scanner(System.in);		// inicjacja skanera
		int x = wczyt.nextInt();				// wczytanie liczby
		while (x<=1){		// pêtla sprawdzaj¹ca czy druga zmienna jest wiêksza od 1
			System.out.println("podana liczba jest mniejsza/równa 1");
			System.out.print("Proszê inn¹ liczbê: ");
			x = wczyt.nextInt();
		}
				// test sprawdzaj¹cy pierwszoœæ liczby
		boolean test = true;		// ustawienie pocz¹tkowej testu wartoœci na prawdziwy
		for(int i=2;i*i<=x;i++){	// pêtla sprawdzaj¹ca reszty z dzielenia do pierwiastka wprowadzonej liczby
		   if(x%i==0)				// w przypadku znalezienia liczny przez któr¹ mo¿na podzieliæ wprowadzan¹ liczbê, wynik testu zmienia sie na fa³szywy
		    test = false;
		}
		if(test){
			System.out.println("Podana liczba jest liczb¹ pierwsz¹");
		}
		else{
			System.out.println("Podana liczba nie jest liczb¹ pierwsz¹");
		}
	
		wczyt.close();
	}

}
