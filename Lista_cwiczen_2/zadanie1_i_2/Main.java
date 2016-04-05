package zadanie1_i_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);

		Statek ship1 = new Statek();
		System.out.println("Program 'Statek'");
		
		/* Wczytanie pocz¹tkowej pozycji statku, wraz z sprawdzeniem poprawnoœci liczb 
		 *
		 *
		 */
		
		System.out.println("Podaj pozycje startow¹ pionow¹ X (w przedziale wartoœci int): ");
		while (!skan.hasNextInt()) {
			System.out.println("To nie jest liczba calkowita: " + skan.next());
			System.out.print("Proszê podaæ liczbê calkowit¹ typu Integer: ");
		}
		int a = skan.nextInt();
		System.out.println("Podaj pozycje startow¹ poziomom Y (w przedziale wartoœci int): ");
		while (!skan.hasNextInt()) {
			System.out.println("To nie jest liczba calkowita: " + skan.next());
			System.out.print("Proszê podaæ liczbê calkowit¹ typu Integer: ");
		}
		int b = skan.nextInt();
		
		
		ship1.setPozycjaStart(a, b);		// Ustawienie statku na pozycji startowej
		
		
		/*
		 *	Pêtla umo¿liwaj¹ca wybór funkcji sterowania statkiem oraz zakoñczenie programu 
		 */
		int z = 0;
		do{
			System.out.println("Pozycja statku: "+ ship1.getPozycjaX()+" x, "+ship1.getPozycjaY()+" y.");
			// zwracanie pozycji przy ka¿dym wykonaniu pêtli
			
			System.out.println("Co chcesz zrobiæ? : \n1 Przemieœæ statek w górê \n2 Przemieœæ statek w dó³ "
					+ "\n3 Przemieœæ statek w prawo \n4 Przemieœæ statek w lewo "
					+ "\n5 Przemieœæ statek na pozycje startow¹ \n6 wyjœcie");
			z = skan.nextInt();
			switch (z){
				case 1 : /*góra*/;
					System.out.println("Podaj wartoœæ przemieszczenia: ");
					while (!skan.hasNextInt()) {
						System.out.println("To nie jest liczba calkowita: " + skan.next());
						System.out.print("Proszê podaæ liczbê calkowit¹ typu Integer: ");
					}
					a = skan.nextInt();
					ship1.setPozycja(a, 0);
				break;
				case 2 : /*dó³*/;
					System.out.println("Podaj wartoœæ przemieszczenia: ");
					while (!skan.hasNextInt()) {
						System.out.println("To nie jest liczba calkowita: " + skan.next());
						System.out.print("Proszê podaæ liczbê calkowit¹ typu Integer: ");
					}
					a = skan.nextInt();
					ship1.setPozycja(-a, 0);
				break;
				case 3 : /*prawo*/;
					System.out.println("Podaj wartoœæ przemieszczenia: ");
					while (!skan.hasNextInt()) {
						System.out.println("To nie jest liczba calkowita: " + skan.next());
						System.out.print("Proszê podaæ liczbê calkowit¹ typu Integer: ");
					}
					b = skan.nextInt();
					ship1.setPozycja(0, b);
					break;
				case 4 : /*lewo*/;
					System.out.println("Podaj wartoœæ przemieszczenia: ");
					while (!skan.hasNextInt()) {
						System.out.println("To nie jest liczba calkowita: " + skan.next());
						System.out.print("Proszê podaæ liczbê calkowit¹ typu Integer: ");
					}
					b = skan.nextInt();
					ship1.setPozycja(0, -b);
				break;
				case 5 : /*start*/;
					ship1.returnXY();
				break;
				case 6 : /*exit*/;
				break;
				default : System.out.println("Nieprawid³owy wybór");
			}
		}while(z != 6);
		skan.close();
	}

}
