package com.crm.formation;

public class OperateurTest {

	public static void main(String[] args) {
		int maVarInt;
		maVarInt = 36;
		
		int maVarInt2 = maVarInt;
		
		int somme1 = 5 + 6;
		int somme2 = somme1 + 7;
		
		int soustraction3 = somme2 - somme1;
		
		int produit4 = somme1 * somme2;
		
		float produit5 = produit4 * 2;
		
		double produit6 = produit5 * 2.6;
		
		int quotient1 = 5/2;
		float quotient2 = 5/2;
		double quotient3 = 5/2;
		
	
		
		float quotient5 = 5f/2;
		
		double quotient6 = 5f/2;
		double quotient7 = (float)5/2;

		System.out.println(maVarInt + " " + maVarInt2);
		
		System.out.println(somme1 + " " + somme2 + " " + soustraction3 + " " + produit4 + " " + produit5 + " " + produit6);
		
		System.out.println(quotient1 + " " + quotient2 + " " + quotient3);
		System.out.println(quotient5 +  " " + quotient6 +  " " + quotient7);
	}

}
