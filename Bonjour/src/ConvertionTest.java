
public class ConvertionTest {

	public static void main(String[] args) {
		
		
		byte byteChiffre = 1;
		short shortChiffre = 2;
		int intChiffre = 3;
		long longChiffre = 4;
		
		
		//byte < short < int < long
		
		byteChiffre = (byte)shortChiffre;
		
		intChiffre = shortChiffre;
		
		intChiffre = (int)longChiffre;
		
		longChiffre = shortChiffre;

		System.out.println(byteChiffre + " " + shortChiffre + " " + intChiffre + " " + longChiffre);
	}

}
