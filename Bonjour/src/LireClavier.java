import java.util.Scanner;

public class LireClavier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		
		
		System.out.println("Insérer un texte :");
		
		String strScanInput = scan.nextLine();
		
		
		
		System.out.println(strScanInput);
		
		
		System.out.println("Insérer un texte :");
		
				
		
		strScanInput = strScanInput + scan.nextLine();
		
		System.out.println(strScanInput);
		
		scan.close();
	}

}
