
public class Main {

	public static void main(String[] args) {

		Zbior x = new Zbior(5);
		Para p1 = new Para("pierwsza para");
		Para p2 = new Para("druga para");
		
		x.wstaw(p1);
		x.wstaw(p2);
		Para p3 = (Para) p2;
		System.out.println(p3.getClass());
		Para p4 = new Para("czwarta para");
		
		ZbiorRozszerzony xRoz = new ZbiorRozszerzony(5);
		xRoz.wstaw(p1);
		xRoz.wstaw(p3);
		System.out.println(xRoz.szukaj(p2));
		System.out.println(xRoz.szukaj(p4));

	}
}
