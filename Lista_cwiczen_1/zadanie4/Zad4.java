package zadanie4;

import java.util.Random;

public class Zad4 {

	public static void main(String[] args) {

		int[] tablicaliczb = new int[20];		//utworzenie tabeli przechowuj�cej losowe liczby
		int[] tablicasum = new int[10];			//utworzenie tabeli sumuj�cej wyst�pienia danej liczby
		
		Random r = new Random();			// utworzenie zmiennej pseudolosowanej
		System.out.print("Tablica: ");
		for(int a=0; a<20; a++){			// utworzenie p�tli uzupe�niaj�cej tablice
			tablicaliczb[a] = r.nextInt(10)+1;		// przypisanie losowej liczby do zmiennej w tablicy o indeksie iteracji p�tli
			if (tablicaliczb[a] == 1) tablicasum[0]++;			//warunki przypisuj�ce warto�� +1 dla poszczeg�lnych zmiennych tablicy sumuj�cej wyst�pienia 
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
		
		System.out.println("Liczba - liczba wyst�pie�");
		int b = 1;
		for(int element : tablicasum){			//p�tla wy�wietlaj�ca wyniki wyst�pnie� poszczeg�lnych liczb 
			System.out.println(b+" - "+element);
			b++;
		}

	}

}
