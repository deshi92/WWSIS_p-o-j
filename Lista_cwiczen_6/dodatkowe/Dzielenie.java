package dodatkowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dzielenie {

	public static void main(String[] args){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Wprowadz licznik");
			String a = reader.readLine();
			int x = Integer.parseInt(a);
			
			System.out.println("Wprowadz mianownik");
			String b = reader.readLine();
			int y = Integer.parseInt(b);	
			
			System.out.println("Wynik dzielenia "+x+" / "+y+" = "+(x/y));
			
		} catch(ArithmeticException ae){
			System.err.println("Wyj¹tek - dzielenie przez 0!");
			ae.printStackTrace();
		} catch(NumberFormatException nfe){
			System.err.println("Wyj¹tek - niew³aœciwy format danych!");
			nfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
