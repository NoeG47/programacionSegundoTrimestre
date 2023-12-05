package ud5;

import java.util.Scanner;

public class ej2_HojaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad = in.nextLine();
		System.out.println("Introduce una subcadena");
		String subcad = in.nextLine();
		
		//verificar si empieza por la subcadena
		if (comienzaConSubcadena(cad,subcad)){
			System.out.println("Empieza por la subcadena");
		}
		else {
			System.out.println("no empieza por la subcadena");
		}
	}
	public static boolean comienzaConSubcadena(String cad, String subcad){
		if (subcad.length() <= cad.length()) {
			String parteCadena = cad.substring(0, subcad.length());
			return parteCadena.equals(subcad);
		}
			
		else {
			return false;
		}	
	}

}
