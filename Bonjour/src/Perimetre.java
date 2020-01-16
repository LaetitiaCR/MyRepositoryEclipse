import java.util.Scanner;

public class Perimetre {

	
	public static float calculPerimetre(int pintScanInputlongueur, int pintScanInputlargeur){
		
		
		float perimetre;
		perimetre = (pintScanInputlongueur + pintScanInputlargeur)*2;
		
		//System.out.println(perimetre);
		return perimetre;
	}
	
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Insérer un chiffre :");
		
		
		int intScanInputlongueur = scan.nextInt();
		
		System.out.println("Insérer un chiffre :");
		
		int intScanInputlargeur = scan.nextInt();
		
		scan.close();
		
		Float returnPerimetre;
		
		returnPerimetre = calculPerimetre(intScanInputlongueur, intScanInputlargeur);
		System.out.println(returnPerimetre);
		
	}
}
