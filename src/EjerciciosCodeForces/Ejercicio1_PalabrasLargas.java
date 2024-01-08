package EjerciciosCodeForces;

import java.util.Scanner;

public class Ejercicio1_PalabrasLargas {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int numPalabras = 0;
		numPalabras = in.nextInt();	
		in.nextLine();
		
		
		int contPalabras = 0;
		
		do {
		String palabra = in.nextLine();
		char caracterPrincipio = palabra.charAt(0);
		char caracterFinal = palabra.charAt(palabra.length()-1);
		int i = 0;
		if(palabra.length() <= 4 || palabra.length() < 10 ) {
			System.out.print(palabra);
			numPalabras--;
		}
	
		if (palabra.length() >= 10) {
			
			System.out.print(caracterPrincipio);
			
			for ( i = 1; i < palabra.length()-1; i++) {
				 contPalabras ++;
			}
			System.out.print(contPalabras);
			System.out.print(caracterFinal);
			numPalabras--;
		}
		System.out.println("\n");
		contPalabras = 0;
		} while (numPalabras != 0);
		
	
	}
}
