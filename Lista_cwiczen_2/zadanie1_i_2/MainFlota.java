package zadanie1_i_2;

import java.util.Scanner;

public class MainFlota {

	public static void main(String[] args) {

		Scanner skan = new Scanner(System.in);

		
		Flota flota = new Flota();	// zainicjowanie obiektu flota
		flota.setFlota();			// umieszczenie statków floty w pozycji startowej
		flota.pozycjaFlota();		// podgl¹d pozycji wszystkich statków
//		flota.getPozycjaX(x);		// zwraca wspó³rzêdn¹ X statku "x"
//		flota.getPozycjaY(x);		// zwraca wspó³rzêdn¹ Y statku "x"
//		flota.setLider(i);			// ustawia lidrem statek "i"
//		flota.moveToStart(x);		/* ustawia statek "x" na pozycji startowej (jeœli jest wolna) 
//										oraz wszystkie statki na pozycji startowej jeœli zosta³ wskazany lider */
//		flota.moveToStartAll();		// ustawia wszystkie statki na pozycji startowej
		flota.moveTo(1, 500, -3750);		// przesówa statek "x" o wartoœæ "a" na osi X oraz o wartoœæ "b" na osi Y
		flota.pozycjaFlota();
		flota.moveTo(2, 10, 750000);
		flota.pozycjaFlota();
		flota.setLider(2);
		flota.moveTo(2, Integer.MAX_VALUE, Integer.MAX_VALUE);
		flota.pozycjaFlota();
		
		skan.close();
	}

}
