package ud5;

import java.util.Scanner;

/*
 * Pide una cadena y dos caracteres por teclado 
 * (valida que sea un carácter), sustituye la aparición
 * del primer carácter en la cadena por el segundo carácter.
 * 
 * */
public class ej7_HojaCadenas {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce una cadena");
		String cad = in.nextLine();
		System.out.println("Introduce un carácter a buscar");
		char letraA = in.nextLine().charAt(0);
		System.out.println("Introduce un carácter para sustituir");
		char letraB = in.nextLine().charAt(0);
		boolean encontrada = false;
		// primero comprobar si la letra se encuentra
		while (encontrada == false) {
			for (int i = 0; i < cad.length(); i++) {
				if (letraA == cad.charAt(i)) {
					//System.out.println("se encuentra");
					cad = cad.substring(0, i) + letraB + cad.substring(i + 1);
					encontrada = true;
					System.out.println(cad);
				}
			}
			if (encontrada == false) {
				 System.out.println("Carácter introducido no válido, vuelve a introducir otro: ");
				 letraA = in.nextLine().charAt(0);
			}
		}

	}

}
