package zadanie1_i_2;

import java.util.Scanner;

public class MainFlota {

	public static void main(String[] args) {

		Scanner skan = new Scanner(System.in);

		
		Flota flota = new Flota();	// zainicjowanie obiektu flota
		flota.setFlota();			// umieszczenie statk�w floty w pozycji startowej
		flota.pozycjaFlota();		// podgl�d pozycji wszystkich statk�w
//		flota.getPozycjaX(x);		// zwraca wsp�rz�dn� X statku "x"
//		flota.getPozycjaY(x);		// zwraca wsp�rz�dn� Y statku "x"
//		flota.setLider(i);			// ustawia lidrem statek "i"
//		flota.moveToStart(x);		/* ustawia statek "x" na pozycji startowej (je�li jest wolna) 
//										oraz wszystkie statki na pozycji startowej je�li zosta� wskazany lider */
//		flota.moveToStartAll();		// ustawia wszystkie statki na pozycji startowej
		flota.moveTo(1, 500, -3750);		// przes�wa statek "x" o warto�� "a" na osi X oraz o warto�� "b" na osi Y
		flota.pozycjaFlota();
		flota.moveTo(2, 10, 750000);
		flota.pozycjaFlota();
		flota.setLider(2);
		flota.moveTo(2, Integer.MAX_VALUE, Integer.MAX_VALUE);
		flota.pozycjaFlota();
		
		skan.close();
	}

}
