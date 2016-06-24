package sad;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

//		zadanie_1_3();
//		
//		zadanie_1_4();
//		
//		zadanie_1_5(zadanie_1_6());  
//		/*
//		 * HashMap'a zosta�a stworzona w metodzie zwracaj�cej map� wi�c zosta�a osadzona jako argument metody poprzedniej,
//		 * mo�na zastosowa� metode z zad_1.5 wewn�trz innej metody zamiast zwracania (zad_1.7). 
//		 */
		zadanie_1_7_1(zadanie_1_6());
		
		System.out.println("");
		
		zadanie_1_7_2(zadanie_1_6());
//		
//		zadanie_2();
	}
	
	public static void zadanie_1_3(){
		Set<Punkt2D> setPunktow = new HashSet<Punkt2D>();
		/*
		 * Utworzenie trzech punktow, dwa z nich posiadaj� identyczne wsp�rz�dne
		 */
		Punkt2D punkt1 = new Punkt2D(10,10);
		Punkt2D punkt2 = new Punkt2D(10,10);
		Punkt2D punkt3 = new Punkt2D(5,5);
		/*
		 * Dodanie wszystkich punkt�w do HashSet'u
		 */
		setPunktow.add(punkt1);
		setPunktow.add(punkt2);
		setPunktow.add(punkt3);
		/*
		 * Sprawdzenie czy zosta�y dodane duplikaty
		 */
		for(Punkt2D x : setPunktow){
			System.out.println("Id punktu: "+x+", X: "+x.getX()+", Y: "+x.getY());
		}
	}
	
	public static void zadanie_1_4(){
		
		Set<Punkt2D> treeSetPunktow = new TreeSet<Punkt2D>();
		/*
		 *  Utworzenie trzech punkt�w z kt�rych pierwszy jest najdalej,
		 *  a drugi najbli�ej, pocz�tku uk�adu wsp�rz�dnych 
		 */
		Punkt2D punkt1 = new Punkt2D(10,10);
		Punkt2D punkt2 = new Punkt2D(5,2);
		Punkt2D punkt3 = new Punkt2D(5,5);
		/*
		 * Dodanie wszystkich punkt�w do TreeSet'u
		 */
		treeSetPunktow.add(punkt1);
		treeSetPunktow.add(punkt2);
		treeSetPunktow.add(punkt3);
		/*
		 * Sprawdzenie czy zosta�y dodane w odpowiedniej kolejno�ci
		 */
		for(Punkt2D x : treeSetPunktow){
			System.out.println("Id punktu: "+x+", X: "+x.getX()+", Y: "+x.getY());
		}
	}
	
	public static void zadanie_1_5(Map<?,?> mapa){
		/*
		 * pobranie mapy o dowolnym typie klucza i warto�ci oraz wy�wietlenie jej
		 */
		 for (Map.Entry<?, ?> x : mapa.entrySet()){
			System.out.print(x.getKey()+": '"+x.getValue()+"'; ");
		}
	}
	
	public static Map<Punkt2D, Integer> zadanie_1_6(){
		Map<Punkt2D, Integer> mapa = new HashMap<>();
		/*
		 * Utworzenie czterech punkt�w
		 */
		Punkt2D punkt1 = new Punkt2D(10,10);
		Punkt2D punkt2 = new Punkt2D(7,2);
		Punkt2D punkt3 = new Punkt2D(5,5);
		Punkt2D punkt4 = new Punkt2D(2,0);
		/*
		 * Dodanie punkt�w do mapy
		 */
		mapa.put(punkt1, punkt1.getX()+punkt1.getY());
		mapa.put(punkt2, punkt2.getX()+punkt2.getY());
		mapa.put(punkt3, punkt3.getX()+punkt3.getY());
		mapa.put(punkt4, punkt4.getX()+punkt4.getY());
		/*
		 * Zwr�cenie mapy
		 */
		return mapa;
	}
	
	public static void zadanie_1_7_1(Map<Punkt2D, Integer> mapa){
		Map<Punkt2D, Integer> treeMapa = new TreeMap<>();
		/*
		 * Prze�o�enie kluczy i warto�ci do nowej mapy
		 */
		treeMapa.putAll(mapa);
		zadanie_1_5(treeMapa);
	}

	public static void zadanie_1_7_2(Map<Punkt2D, Integer> mapa){
		Map<Punkt2D, Integer> treeMapa = new TreeMap<>(new Comparator<Punkt2D>() {
            /*
             * Odwr�cenie warto�ci por�wna�
             * (non-Javadoc)
             * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
             */
            @Override
			public int compare(Punkt2D o1, Punkt2D o2) {
				return -(o1.compareTo(o2));
			}
		});
		/*
		 * Prze�o�enie kluczy i warto�ci do nowej mapy
		 */
		treeMapa.putAll(mapa);
		zadanie_1_5(treeMapa);
	}
	
	public static void zadanie_2(){
		/*
		 * Stworzenie punkt�w z r�nymi typami wsp�rz�dnych
		 */
		GenericPunkt2D<Integer, Integer> punktIntInt = new GenericPunkt2D<Integer, Integer>(10, 10);
        GenericPunkt2D<Double, Double> punktDoubDoub = new GenericPunkt2D<Double, Double>((double) 2, (double) 3);
        GenericPunkt2D<Long, Long> punktLongLong = new GenericPunkt2D<Long, Long>((long) 5, (long) 15);
        System.out.println(punktIntInt + ": " + punktIntInt.getX() + "x, " + punktIntInt.getY() + "y. \n" + punktDoubDoub+": " + punktDoubDoub.getX() + "x, " + punktDoubDoub.getY() + "y. \n" + punktLongLong + ": " + punktLongLong.getX() + "x, " + punktLongLong.getY() + "y.");
	}
}
