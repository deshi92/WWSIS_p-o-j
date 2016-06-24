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
//		 * HashMap'a zosta³a stworzona w metodzie zwracaj¹cej mapê wiêc zosta³a osadzona jako argument metody poprzedniej,
//		 * mo¿na zastosowaæ metode z zad_1.5 wewn¹trz innej metody zamiast zwracania (zad_1.7). 
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
		 * Utworzenie trzech punktow, dwa z nich posiadaj¹ identyczne wspó³rzêdne
		 */
		Punkt2D punkt1 = new Punkt2D(10,10);
		Punkt2D punkt2 = new Punkt2D(10,10);
		Punkt2D punkt3 = new Punkt2D(5,5);
		/*
		 * Dodanie wszystkich punktów do HashSet'u
		 */
		setPunktow.add(punkt1);
		setPunktow.add(punkt2);
		setPunktow.add(punkt3);
		/*
		 * Sprawdzenie czy zosta³y dodane duplikaty
		 */
		for(Punkt2D x : setPunktow){
			System.out.println("Id punktu: "+x+", X: "+x.getX()+", Y: "+x.getY());
		}
	}
	
	public static void zadanie_1_4(){
		
		Set<Punkt2D> treeSetPunktow = new TreeSet<Punkt2D>();
		/*
		 *  Utworzenie trzech punktów z których pierwszy jest najdalej,
		 *  a drugi najbli¿ej, pocz¹tku uk³adu wspó³rzêdnych 
		 */
		Punkt2D punkt1 = new Punkt2D(10,10);
		Punkt2D punkt2 = new Punkt2D(5,2);
		Punkt2D punkt3 = new Punkt2D(5,5);
		/*
		 * Dodanie wszystkich punktów do TreeSet'u
		 */
		treeSetPunktow.add(punkt1);
		treeSetPunktow.add(punkt2);
		treeSetPunktow.add(punkt3);
		/*
		 * Sprawdzenie czy zosta³y dodane w odpowiedniej kolejnoœci
		 */
		for(Punkt2D x : treeSetPunktow){
			System.out.println("Id punktu: "+x+", X: "+x.getX()+", Y: "+x.getY());
		}
	}
	
	public static void zadanie_1_5(Map<?,?> mapa){
		/*
		 * pobranie mapy o dowolnym typie klucza i wartoœci oraz wyœwietlenie jej
		 */
		 for (Map.Entry<?, ?> x : mapa.entrySet()){
			System.out.print(x.getKey()+": '"+x.getValue()+"'; ");
		}
	}
	
	public static Map<Punkt2D, Integer> zadanie_1_6(){
		Map<Punkt2D, Integer> mapa = new HashMap<>();
		/*
		 * Utworzenie czterech punktów
		 */
		Punkt2D punkt1 = new Punkt2D(10,10);
		Punkt2D punkt2 = new Punkt2D(7,2);
		Punkt2D punkt3 = new Punkt2D(5,5);
		Punkt2D punkt4 = new Punkt2D(2,0);
		/*
		 * Dodanie punktów do mapy
		 */
		mapa.put(punkt1, punkt1.getX()+punkt1.getY());
		mapa.put(punkt2, punkt2.getX()+punkt2.getY());
		mapa.put(punkt3, punkt3.getX()+punkt3.getY());
		mapa.put(punkt4, punkt4.getX()+punkt4.getY());
		/*
		 * Zwrócenie mapy
		 */
		return mapa;
	}
	
	public static void zadanie_1_7_1(Map<Punkt2D, Integer> mapa){
		Map<Punkt2D, Integer> treeMapa = new TreeMap<>();
		/*
		 * Prze³o¿enie kluczy i wartoœci do nowej mapy
		 */
		treeMapa.putAll(mapa);
		zadanie_1_5(treeMapa);
	}

	public static void zadanie_1_7_2(Map<Punkt2D, Integer> mapa){
		Map<Punkt2D, Integer> treeMapa = new TreeMap<>(new Comparator<Punkt2D>() {
            /*
             * Odwrócenie wartoœci porównañ
             * (non-Javadoc)
             * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
             */
            @Override
			public int compare(Punkt2D o1, Punkt2D o2) {
				return -(o1.compareTo(o2));
			}
		});
		/*
		 * Prze³o¿enie kluczy i wartoœci do nowej mapy
		 */
		treeMapa.putAll(mapa);
		zadanie_1_5(treeMapa);
	}
	
	public static void zadanie_2(){
		/*
		 * Stworzenie punktów z ró¿nymi typami wspó³rzêdnych
		 */
		GenericPunkt2D<Integer, Integer> punktIntInt = new GenericPunkt2D<Integer, Integer>(10, 10);
        GenericPunkt2D<Double, Double> punktDoubDoub = new GenericPunkt2D<Double, Double>((double) 2, (double) 3);
        GenericPunkt2D<Long, Long> punktLongLong = new GenericPunkt2D<Long, Long>((long) 5, (long) 15);
        System.out.println(punktIntInt + ": " + punktIntInt.getX() + "x, " + punktIntInt.getY() + "y. \n" + punktDoubDoub+": " + punktDoubDoub.getX() + "x, " + punktDoubDoub.getY() + "y. \n" + punktLongLong + ": " + punktLongLong.getX() + "x, " + punktLongLong.getY() + "y.");
	}
}
