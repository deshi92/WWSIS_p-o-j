package zad1;

public class Zad1 {
	
	public static void main(String[] args) {
		Zad1Inner zad1Inner = new Zad1Inner();
		
		Zad1Inner.Zad1InnerInner s = zad1Inner.new Zad1InnerInner();// TODO: tutaj wpisz jedna linie kodu, aby na konsoli wyswietlil sie napis "Sukces", nie mozesz zmienic istniejacy kod
		
		s.print();
	}
	
}

class Zad1Inner {
	class Zad1InnerInner {
		void print() {
			System.out.println("Sukces");
		}
	}
}
