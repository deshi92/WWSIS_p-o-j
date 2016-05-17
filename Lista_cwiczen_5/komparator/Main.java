package komparator;

import wspolrzedne.Punkt2D;

public class Main {
	
	private Punkt2D punkt1;
	private Punkt2D punkt2;
	
	public Main() {
		// mozesz zmienic wartosci argumentow w konstruktorach punktow, aby przetestowac program
		punkt1 = new Punkt2D(5, 2);
		punkt2 = new Punkt2D(6, 5);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.porownajPunkty(new Punkt2DComparatorX()); // wywolaj z instancja klasy Punkt2DComparatorX
		main.porownajPunkty(new Punkt2DComparatorY()); // wywolaj z instancja klasy Punkt2DComparatorY
		main.porownajPunkty(new Punkt2DComparator() {
			@Override
			public CompareResult compare(Punkt2D a, Punkt2D b) {
				if(a.getX() < b.getX() && a.getY() < b.getY())return CompareResult.LESS;
				if(a.getX() == b.getX() && a.getY() == b.getY())return CompareResult.EQUAL;
				return CompareResult.HIGHER;
			}
		}); 
		// wywolaj z anonimowym komparatorem.
		// Metoda compare w anonimowym komparatorze zwraca:
		// LESS, jesli x punktu pierwszego jest mniejsza od x drugiego i y pierwszego jest mniejsze od y drugiego
		// EQUAL jesli x punktu pierwszego jest rowne x drugiego i y pierwszego jest rowne y drugiego
		// HIGHER, w pozostalych przypadkach
	}
	
	private void porownajPunkty(Punkt2DComparator comparator) {
		System.out.println(comparator.compare(this.punkt1, this.punkt2));
				
		// TODO: tutaj napisz kod, ktory porowna this.punkt1 i this.punkt2 za pomoca comparatora otrzymanego w argumencie metody
		// TODO: metoda wyswietla na ekranie informacje, czy punkt1 jest wiekszy, mniejszy, czy rowny punkt2
	}
}
