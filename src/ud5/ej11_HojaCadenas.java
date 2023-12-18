package ud5;

import java.util.Scanner;

/*
 *  Realizar una función a la que se le pasa por parámetro una cadena
con un email, y dicha función devuelve si el mail está bien formado.
Un email está bien formado cuando:
1.1.- Contiene una y solo una arroba.
1.2.- No puede contener dos puntos seguidos '.' después de la arroba.
1.3.- No puede contener ' '
*/
public class ej11_HojaCadenas {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int i = 0;
		
	//	do {
			System.out.println("Introduce un correo: ");
			String cad = in.nextLine();

			if (buscarArroba(cad) == true && contarArroba(cad, i) == 1 && hayPuntos(cad) == false) {
				System.out.println("No puede haber 2 puntos seguidos despues del @");
			}

			else if (buscarArroba(cad) == true && contarArroba(cad, i) > 1) {
				System.out.println("No puede haber más de dos @");
			} else {
				System.out.println("No hay @");
			}
			
//		}

		//while ();
	}

	public static boolean buscarArroba(String cad) {

		// Comprobar letra a letra si hay alguna arroba
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '@') {
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
					return false;

				}
				return true;
			}
		}
		return false;
	}

}
