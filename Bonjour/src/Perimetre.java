import java.util.Scanner;

public class Perimetre {

	
	public static calculPerimetre(){
		Scanner scan  = new Scanner(System.in);
			
		System.out.println("Insérer un chiffre :");
		
		
		int intScanInputlongueur = scan.nextInt();
		
		System.out.println("Insérer un chiffre :");
		
		int intScanInputlargeur = scan.nextInt();
		
		scan.close();
		
		float perimetre;
		perimetre = (intScanInputlongueur + intScanInputlargeur)*2;
		
		System.out.println(perimetre);
	}
	
	public static void main(String[] args) {
		
	}
}
