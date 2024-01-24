package ud5;

import java.util.Scanner;

public class ej4_hojaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad = in.nextLine();
		int contPalabras = 0;
		//caso general
		for (int i = 1; i < cad.length(); i++) {
			if (cad.charAt(i-1)== ' ' && cad.charAt(i)!=' ')
				contPalabras++;
		}
		//caso de que la primera palabra NO comienza por espacio
		if (cad.charAt(0)!= ' ')
			contPalabras++;
		System.out.println(cad + " tiene " + contPalabras + " palabras");
		 in.close();
	}

}
