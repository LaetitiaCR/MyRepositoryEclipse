import java.util.Scanner;
//import java.util.StringTokenizer;

public class PerimetreRectangle {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		/*
		
		int longueur = 5;
		int largeur = 2;
		

		float perimetre;
		perimetre = (float)(longueur + largeur) / 2 ;
		
		System.out.println(perimetre);
		
		
		
		System.out.println("Insérer un chiffre :");
		
		
		int intScanInputlongueur = scan.nextInt();
		
		System.out.println("Insérer un chiffre :");
		
		int intScanInputlargeur = scan.nextInt();
		
		float perimetre2;
		perimetre2 = (float)(intScanInputlongueur + intScanInputlargeur)/2;
		
		System.out.println(perimetre2);
		
		
		*/
		
		
		
		
		//exo 1.1
		
		/*
		System.out.println("Insérer un chiffre :");
		
		
		int strScanInputNb1 = scan.nextInt();
		
		System.out.println("Insérer un chiffre :");
		
		int strScanInputNb2 = scan.nextInt();
		
		double resultMoyenne = (float)(strScanInputNb1 + strScanInputNb2)/2;
		
		System.out.println(resultMoyenne);
		*/
		
		String strScanInput;
		char caractereReponse;
		boolean refaire = false;
		
		do{
		
			System.out.println("Insérer un chiffre un espace puis un autre chiffre :");
			
			strScanInput =  scan.nextLine();
			
			
			String strChaine = strScanInput.trim();
		
			String[] parts = strChaine.split(" ");
			String partnb1 = parts[0]; 
			String partnb2 = parts[1]; 
			
		
			
			System.out.println(partnb1 + " " + partnb2 + " ");
			
			
			
			
			int nb1 = Integer.parseInt(partnb1);
			int nb2 = Integer.parseInt(partnb2);
			
			double resultMoyenne2 = (float)(nb1 + nb2)/2;
			
			System.out.println(resultMoyenne2);
			
			System.out.println("Voulez-vous effectuer un uatre calcul, O/N ?" );
			caractereReponse = scan.nextLine().charAt(0);
			//caractereReponse = scan.next();
			if (caractereReponse != 'O') {
				refaire = false;
				
			}
			else {
				refaire = true;
			}
		}
		while(refaire==true);
		
		scan.close();
	}

}
