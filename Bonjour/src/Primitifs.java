
public class Primitifs {
	public static void main(String[] args) {
		
		
		//vrai ou faux
		boolean bool;
		
		//chaine de caractères
		String strChaine;
		
		//un caractère
		char cara;
		
		//1 octet
		// -128 						-2 7 			et 			+ 127  							2 7  - 1
		byte entier1oPetitNegPos;
		
		// 2 octets
		// -32 768  					-2 15 			et 			+ 32 767						2 15 - 1 
		short entier2oCourtNegPos;
		
		// 4 octets
		// - 2 147 483 648 	  			-2 31			et 			+ 2 147 483 647					2 31 - 1
		int entier4oNegPos;
		
		// 8 octets
		// - 9 223 372 036 854 775 808	-2 93			et 			+ 9 223 372 036 854 775 807		2 93 - 1
		long entier8olongNegPos;
	
		// 4 octets
		//dans ce cas max vaut 255 : ensemble des nombres [-3.40282347E38 .. -1.40239846E-45], 0, [1.40239846E-45 .. 3.40282347E38]
		float chiffreVirguleCourt;
		
		//8 octets
		//dans ce cas max vaut 2047 : ensemble des nombres [-1.79769313486231570E308 .. -4.94065645841246544E-324], 0, [4.94065645841246544E-324 .. 1.79769313486231570E308]
		double chiffreVirguleLong;
		
		
		
		bool = false;
		
		strChaine = "ma chaine";
		
		cara = 'a';
		
		entier1oPetitNegPos = -100;
		
		entier2oCourtNegPos = -30000;
		
		entier4oNegPos = -2000000000;
		
		entier8olongNegPos = -500000000;
		
		chiffreVirguleCourt = 12;
		
		chiffreVirguleLong = 4567.8;
		
		System.out.println(strChaine + " " + bool + " " + cara); 
		System.out.println(entier1oPetitNegPos + " " + entier2oCourtNegPos + " " + entier4oNegPos + " "+ entier8olongNegPos + " " + chiffreVirguleCourt + " " + chiffreVirguleLong) ;
		
	}

}
