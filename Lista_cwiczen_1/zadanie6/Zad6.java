package zadanie6;

import java.util.Random;
import java.util.Scanner;

public class Zad6 {
	
	public static void main(String[] args) {
		
		System.out.print("Podaj liczbê ca³kowit¹ wiêksz¹ ni¿ 1: ");
		Scanner wczyt = new Scanner(System.in);
		int a = wczyt.nextInt();		// wczytanie zmiennej
		int []t1 = new int[a];			// inicjalizacja i deklaracja tablicy t1
		System.out.print("tabela t1: ");
		for (int b = 0; b < a; b++){	// pêtla uzupe³niaj¹ca tablice t1 liczbami z ci¹gu Fibonacciego
			if(b==0 || b==1) t1[b] = 1;
			else t1[b] = t1[b-2]+t1[b-1];
			System.out.print(t1[b]+", ");
		}
		System.out.print("\ntabela t2: ");

		Random r = new Random();		// utworzenie zmiennej pseudolosowanej
		int []t2 = new int[a-1];		// inicjalizacja i deklaracja tablicy t2
		for(int b=0; b<a-1; b++){		// pêtla uzupe³niaj¹ca tablice t2
			t2[b] = r.nextInt(9)+1;
			System.out.print(t2[b]+ ", ");
		}

		int [][]t3 = new int[a][a];		// inicjalizacja i deklaracja tablicy dwuwymiarowej t3
		for(int e=0; e<a; e++){
			t3[0][e] = t1[e];			// uzupe³nienie "górnej" czêœci tablicy t3 danymi z tablicy t1
			if(e<a-1){
				t3[e+1][0] = t2[e];		// uzupe³nienie "lewej" czêœci tablicy t3 danymi z tablicy t2
				for(int f=0; f<a-1; f++){
					t3[e+1][f+1] = t1[f+1]*t2[e];  // uzupe³nienie pozosta³ej czêœci tablicy
				}	
			}
		}
		System.out.print("\ntabela t3: ");

		for (int i = 0; i < t3.length; i++) {	// pêtla wyœwietlaj¹ca zawartoœæ tablicy t3
			System.out.println();
			for (int j = 0; j < t3[i].length; j++) {
			System.out.printf("%-4d", t3[i][j]);
			}
		}
		
		wczyt.close();
	}

}
