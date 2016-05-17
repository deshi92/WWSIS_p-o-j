package zad1;

public class Zad22 {

	class Silnik {
		// TODO: tutaj wpisz swoj kod, aby na konsoli wyswietlil sie napis "Sukces", nie mozesz zmienic istniejacy kod
		Silnik(){
			System.out.println("Sukces");
		}
	}
	
	public static void main(String[] args) {
		new Zad2().go();
	}
	
	void go() {
		new Silnik();
	}
	
	void drive() {
		System.out.println("Sukces");
	}
}
