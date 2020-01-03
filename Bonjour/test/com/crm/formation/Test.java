package com.crm.formation;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello tous le monde");
		System.out.println("Comment ça va ?");
		System.out.println("Comment ça va ?");
		
		
		
	
		
		
		/*
		 * byte : (1 octet ) entiers compris entre -128 et +127 (-27 et 27-1)
		 * short : (2 octets ) entiers compris entre -32768 et +32767 (-215 et 215-1) 
		 * int : (4 octets ) entiers compris entre -2147483648 et +2147483647 (-231 et 231-1)
		 * long : (8 octets ) entiers compris entre -9 223 372 036 854 775 808 et +9223372036854775807 (-263 et 263-1)
		 */
		
		byte maVarByte = 127;
		short maVarShort = 32_767;
		
		int maVarInt = 2_147_483_647;
		int maVarIntBis; 
		maVarIntBis = (int) Math.pow(2, 31);        //2^31
		
		
		long maVarLong;
		
		maVarLong = (long) Math.pow(2, 63);
		
		//System.out.println(maVarInt)maVarLong);
		
		
		System.out.println(maVarByte + " " + maVarShort + " " + maVarInt + " " + maVarIntBis + " " + maVarLong);
	}

}
