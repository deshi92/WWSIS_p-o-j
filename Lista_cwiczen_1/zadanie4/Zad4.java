package zadanie4;

import java.util.Random;

public class Zad4 {

	public static void main(String[] args) {

		int[] tablicaliczb = new int[20];		//utworzenie tabeli przechowuj¹cej losowe liczby
		int[] tablicasum = new int[10];			//utworzenie tabeli sumuj¹cej wyst¹pienia danej liczby
		
		Random r = new Random();			// utworzenie zmiennej pseudolosowanej
		System.out.print("Tablica: ");
		for(int a=0; a<20; a++){			// utworzenie pêtli uzupe³niaj¹cej tablice
			tablicaliczb[a] = r.nextInt(10)+1;		// przypisanie losowej liczby do zmiennej w tablicy o indeksie iteracji pêtli
			if (tablicaliczb[a] == 1) tablicasum[0]++;			//warunki przypisuj¹ce wartoœæ +1 dla poszczególnych zmiennych tablicy sumuj¹cej wyst¹pienia 
			if (tablicaliczb[a] == 2) tablicasum[1]++;
			if (tablicaliczb[a] == 3) tablicasum[2]++;
			if (tablicaliczb[a] == 4) tablicasum[3]++;
			if (tablicaliczb[a] == 5) tablicasum[4]++;
			if (tablicaliczb[a] == 6) tablicasum[5]++;
			if (tablicaliczb[a] == 7) tablicasum[6]++;
			if (tablicaliczb[a] == 8) tablicasum[7]++;
			if (tablicaliczb[a] == 9) tablicasum[8]++;
			if (tablicaliczb[a] == 10) tablicasum[9]++;
			System.out.print(tablicaliczb[a] + ", ");
		}
		
		System.out.println("Liczba - liczba wyst¹pieñ");
		int b = 1;
		for(int element : tablicasum){			//pêtla wyœwietlaj¹ca wyniki wyst¹pnieñ poszczególnych liczb 
			System.out.println(b+" - "+element);
			b++;
		}

	}

}
