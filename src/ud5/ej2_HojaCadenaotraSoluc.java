package ud5;

import java.util.Scanner;

public class ej2_HojaCadenaotraSoluc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad = in.nextLine();
		System.out.println("Introduce una subcadena");
		String subcad = in.nextLine();
		
		if (comienzaConSubcadena(cad, subcad)==true)
			System.out.println("la subcadena esta incluida en la cadena y empieza por ella");
		else
			System.out.println("la subcadena NO esta incluida en la cadena o no empieza por ella");
	}
	public static boolean comienzaConSubcadena(String cad, String subcad){
		int contLetras = 0;
		//compruebo si la cadena es menor a la subcadena
		if (cad.length() <= subcad.length()) {
			return false;
		}
		//compruebo letra a letra e incremento el contador en ese caso
		for (int i=0; i < subcad.length(); i++) {
			if (cad.charAt(i)==subcad.charAt(i)) 
				contLetras++;
		}	
		//comprobamos si el contador es igual al tamaño de la subcadena
		if(contLetras == subcad.length()) 
			return true;
		
		else 
			return false;
		
		
	}
}
