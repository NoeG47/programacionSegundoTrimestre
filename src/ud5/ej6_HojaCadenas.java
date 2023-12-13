package ud5;

import java.util.Scanner;

/*
 * Realizar un programa que dada una cadena de 
 * caracteres por caracteres, genere otra cadena
 * resultado de invertir la primera.
 *
 * */
public class ej6_HojaCadenas {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("introduce una cadena: ");
		String cad = in.nextLine();

		System.out.println(cad);
		System.out.println(invierteCadena(cad));

	}

	public static String invierteCadena(String cad) {
		String cadInv = "";
		for (int i = cad.length() - 1; i >= 0; i--) {
			cadInv = cadInv + cad.charAt(i);
		}
		return (cadInv);
	}

}
