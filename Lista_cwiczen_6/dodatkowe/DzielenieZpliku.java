package dodatkowe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DzielenieZpliku {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new FileReader("dane.txt"))) {

			String a = br.readLine();
			int x = Integer.parseInt(a);
			
			String b = br.readLine();
			int y = Integer.parseInt(b);	
			
			System.out.println("Wynik dzielenia "+x+" / "+y+" = "+(x/y));
		} catch (FileNotFoundException e) {
			System.out.println("Wyj¹tek - problem z otwarciem pliku!");
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
