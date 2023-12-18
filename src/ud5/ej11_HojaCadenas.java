package ud5;

import java.util.Scanner;

public class ej11_HojaCadenas {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		boolean correoCorrecto = false;

		do {
			System.out.println("Introduce un correo: ");
			String cad = in.nextLine();

			if (buscarArroba(cad) && contarArroba(cad, 0) == 1 && !hayPuntos(cad) && !hayEspacios(cad)) {
				correoCorrecto = true;
				System.out.println("Correo correcto");
			} else if (buscarArroba(cad) && contarArroba(cad, 0) > 1) {
				System.out.println("No puede haber más de dos @. Inténtalo de nuevo");
			} else if (buscarArroba(cad) && contarArroba(cad, 0) == 1 && hayPuntos(cad)==true) {
				System.out.println("No puede haber dos puntos despues del arroba. Inténtalo de nuevo");
			}
			
			else {
				System.out.println("No cumple con los requisitos. Inténtalo de nuevo.");
			}

		} while (!correoCorrecto);
	}

	public static boolean buscarArroba(String cad) {
		// Comprobar letra a letra si hay alguna arroba
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '@') {
				// Descomentar la siguiente línea para enseñar la posición del arroba
				// System.out.println("El @ se encuentra en la posición " + (i + 1));
				return true;
			}
		}
		return false;
	}

	public static int contarArroba(String cad, int cont) {
		// comprobar las veces que hay un arroba
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '@') {
				cont++;
			}
		}
		return cont;
	}

	public static boolean hayPuntos(String cad) {
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '@') {
				// Verificar si hay dos puntos seguidos después del arroba
				if (i < cad.length() - 2 && cad.charAt(i + 1) == '.' && cad.charAt(i + 2) == '.') {
					return true;
				}
				return false;
			}
		}
		return false;
	}

	public static boolean hayEspacios(String cad) {
		// NO comienza por espacio
		if (cad.charAt(0) == ' ') {
			System.out.println("No puede empezar con espacios");
			return true;
		}
		for (int i = 1; i < cad.length(); i++) {
			if (cad.charAt(i) == ' ') {
				System.out.println("No puede haber espacios");
				return true;
			}
		}
		return false;
	}
}