package ud5;

import java.util.Scanner;

public class ej5_hojaCadenasSolPaul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad = in.nextLine();
		String iniciales=cad.charAt(0)+"";
		//sepramos en palabras
		int contPalabras = 0;
		//caso general
		for (int i = 1; i < cad.length(); i++) {
			if (cad.charAt(i-1)== ' ' && cad.charAt(i)!=' ')
				iniciales = iniciales+cad.charAt(i);
		}
		iniciales = iniciales.toUpperCase();
		System.out.println(iniciales);
	
	}

}
