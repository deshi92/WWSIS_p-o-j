package zadanie1_i_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);

		Statek ship1 = new Statek();
		System.out.println("Program 'Statek'");
		
		/* Wczytanie pocz�tkowej pozycji statku, wraz z sprawdzeniem poprawno�ci liczb 
		 *
		 *
		 */
		
		System.out.println("Podaj pozycje startow� pionow� X (w przedziale warto�ci int): ");
		while (!skan.hasNextInt()) {
			System.out.println("To nie jest liczba calkowita: " + skan.next());
			System.out.print("Prosz� poda� liczb� calkowit� typu Integer: ");
		}
		int a = skan.nextInt();
		System.out.println("Podaj pozycje startow� poziomom Y (w przedziale warto�ci int): ");
		while (!skan.hasNextInt()) {
			System.out.println("To nie jest liczba calkowita: " + skan.next());
			System.out.print("Prosz� poda� liczb� calkowit� typu Integer: ");
		}
		int b = skan.nextInt();
		
		
		ship1.setPozycjaStart(a, b);		// Ustawienie statku na pozycji startowej
		
		
		/*
		 *	P�tla umo�liwaj�ca wyb�r funkcji sterowania statkiem oraz zako�czenie programu 
		 */
		int z = 0;
		do{
			System.out.println("Pozycja statku: "+ ship1.getPozycjaX()+" x, "+ship1.getPozycjaY()+" y.");
			// zwracanie pozycji przy ka�dym wykonaniu p�tli
			
			System.out.println("Co chcesz zrobi�? : \n1 Przemie�� statek w g�r� \n2 Przemie�� statek w d� "
					+ "\n3 Przemie�� statek w prawo \n4 Przemie�� statek w lewo "
					+ "\n5 Przemie�� statek na pozycje startow� \n6 wyj�cie");
			z = skan.nextInt();
			switch (z){
				case 1 : /*g�ra*/;
					System.out.println("Podaj warto�� przemieszczenia: ");
					while (!skan.hasNextInt()) {
						System.out.println("To nie jest liczba calkowita: " + skan.next());
						System.out.print("Prosz� poda� liczb� calkowit� typu Integer: ");
					}
					a = skan.nextInt();
					ship1.setPozycja(a, 0);
				break;
				case 2 : /*d�*/;
					System.out.println("Podaj warto�� przemieszczenia: ");
					while (!skan.hasNextInt()) {
						System.out.println("To nie jest liczba calkowita: " + skan.next());
						System.out.print("Prosz� poda� liczb� calkowit� typu Integer: ");
					}
					a = skan.nextInt();
					ship1.setPozycja(-a, 0);
				break;
				case 3 : /*prawo*/;
					System.out.println("Podaj warto�� przemieszczenia: ");
					while (!skan.hasNextInt()) {
						System.out.println("To nie jest liczba calkowita: " + skan.next());
						System.out.print("Prosz� poda� liczb� calkowit� typu Integer: ");
					}
					b = skan.nextInt();
					ship1.setPozycja(0, b);
					break;
				case 4 : /*lewo*/;
					System.out.println("Podaj warto�� przemieszczenia: ");
					while (!skan.hasNextInt()) {
						System.out.println("To nie jest liczba calkowita: " + skan.next());
						System.out.print("Prosz� poda� liczb� calkowit� typu Integer: ");
					}
					b = skan.nextInt();
					ship1.setPozycja(0, -b);
				break;
				case 5 : /*start*/;
					ship1.returnXY();
				break;
				case 6 : /*exit*/;
				break;
				default : System.out.println("Nieprawid�owy wyb�r");
			}
		}while(z != 6);
		skan.close();
	}

}
