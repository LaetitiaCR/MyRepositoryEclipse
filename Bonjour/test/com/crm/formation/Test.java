package com.crm.formation;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello tous le monde");
		System.out.println("Comment ça va ?");
		System.out.println("Comment ça va ?");
		
		
			
		/*
		 * char Caractère Unicode 2 '\u0000' ? '\uffff' (0 à 65535) 
		 * byte Entier très court 1 -128 ? +127 
		 * short Entier court 2 -32 768 ? +32 767 
		 * int Entier 4 -2^31?-2,147×10^9 ? +2^31-1?2,147×10^9 
		 * long Entier long 8 -2^63?-9,223×10^18 ? +2^63-1?9,223×1018 
		 * float Nombre réel simple 4 ±2^-149?1.4×10^-45 ? ±2^128-2^104?3.4×10^38 
		 * double Nombre réel 
		 * double 8 ±2^-1074?4,9×10^-324 ? ±2^1024-2^971?1,8×10^308 
		 * boolean Valeur logique (booléen) 1 true (vrai), ou false (faux)
		 */
		
				
		
		/*
		 * byte : (1 octet ) entiers compris entre -128 et +127 (-27 et 27-1)
		 * short : (2 octets ) entiers compris entre -32768 et +32767 (-215 et 215-1) 
		 * int : (4 octets ) entiers compris entre -2147483648 et +2147483647 (-231 et 231-1)
		 * long : (8 octets ) entiers compris entre -9 223 372 036 854 775 808 et +9223372036854775807 (-263 et 263-1)
		 */
		
		
		// les 8 variables primitifs
		
		char cara =  '\u0000';
		char caraBis = '\uffff';
		
		String maChaine = "Ma chaine de caractères";
		
		byte maVarByte = 127;
		short maVarShort = 32_767;
		
		int maVarInt = 2_147_483_647;
		int maVarIntBis; 
		maVarIntBis = (int) Math.pow(2, 31);        //2^31
		
		long maVarLong;
		
		maVarLong = (long) Math.pow(2, 63);			//2^63
		
		
		
		float virgule = 10;
		//virgule = (float) Math.pow(2, 149);
		
		double dble = 125.36;
		//dble = Math.pow(2, 1074);
		
		
		System.out.println(cara + " " + caraBis + " " + maChaine);
		System.out.println(maVarByte + " " + maVarShort + " " + maVarInt + " " + maVarIntBis + " " + maVarLong);
		System.out.println(virgule + " " + dble);
	}

}
