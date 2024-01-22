package ud5;

import java.util.Scanner;

public class ej7_cadenas_replace {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 System.out.println("Introduce una cadena");
	        String cad = in.nextLine();
	        System.out.println("Introduce un carácter a buscar");
	        char letraA = in.nextLine().charAt(0);
	        
	        //comprobar si esa letra se encuentra en la cad
	        boolean letraEncontrada = false;
	        while (letraEncontrada == false) {
	        	for (int i =  0; i < cad.length(); i++) {
	        		if (letraA == cad.charAt(i)) {
	        			
	        			 System.out.println("Introduce un carácter para sustituir");
	        		        char letraB = in.nextLine().charAt(0);

	        		        // Validar que sea un carácter
	        		        while (letraA == letraB) {
	        		            System.out.println("Ambos caracteres son iguales. Introduce un carácter diferente para sustituir: ");
	        		            letraB = in.nextLine().charAt(0);
	        		        }
	        		        
	        		        cad =  sustituirLetra(cad, letraA, letraB);
	        		        System.out.println(cad);
	        		        i = cad.length();
	        		        letraEncontrada = true;
	        		}
	        	}
	        	if (letraEncontrada == false) {
	        		System.out.println("Letra no encontrada, introduce otra");
		        	letraA = in.nextLine().charAt(0);
	        	}
	        }
	        
	       
	        
	}
	public static String sustituirLetra(String cad, char letraB, char letraS) {
		cad = cad.replace(letraB, letraS);
		return cad;
	}

}
