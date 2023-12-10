package ud5;

import java.util.Scanner;

public class ej2_HojaCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad = in.nextLine();
		//pedimos subcadena
		System.out.println("Introduce una subcadena");
		String subcad = in.nextLine();
		 // Comprobar si la cadena comienza con la subcadena usando substring
        if (comienzaConsubCadena(cad, subcad)) {
            System.out.println("La cadena comienza con la subcadena.");
        } else {
            System.out.println("La cadena no comienza con la subcadena.");
        }
	}
	public static boolean comienzaConsubCadena(String cadena, String subcadena){
		 if (subcadena.length() <= cadena.length()) {
	            // Usar substring para obtener una parte de la cadena con la misma longitud que la subcadena
	            String parteDeCadena = cadena.substring(0, subcadena.length());
	            
	            // Comparar la parte de la cadena con la subcadena
	            return parteDeCadena.equals(subcadena);
	        } else {
	            // Si la longitud de la subcadena es mayor que la longitud de la cadena, no puede comenzar con ella
	            return false;
	        }	
	}

}
