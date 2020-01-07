import java.util.Scanner;

public class Methodes {

	public static void main(String[] args) {
	
		int nb1=2, nb2=3;
		int s = Methodes.somme(nb1, nb2);
		System.out.println(s);
		
		
		int nb3=5, nb4=7;
		int s2 = Methodes.somme(nb3, nb4);
		System.out.println(s2);
		
		
		
		
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Insérer un chiffre :");
		
		
		int intScanInputlongueur = scan.nextInt();
		
		System.out.println("Insérer un chiffre :");
		
		int intScanInputlargeur = scan.nextInt();
		
		scan.close();
		
		float perimetre = Methodes.calculPerimetre(intScanInputlongueur, intScanInputlargeur);
		System.out.println(perimetre);
		
		
	}
	
	public static int somme(int a, int b) {
		int s = a + b;
		return s;
	}
	
	
	public static float calculPerimetre(int pintScanInputlongueur, int pintScanInputlargeur){
		
		
		float perimetre;
		perimetre = (pintScanInputlongueur + pintScanInputlargeur)*2;
		return perimetre;
	}
	
}
