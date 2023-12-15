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
		int contador = 0;
		int i = 0;
		boolean contieneArroba = false;
		System.out.println("Introduce un correo: ");
		String cad = in.nextLine();
		// comprobar letra a letra si hay alguna arroba
		for ( i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '@') {
				contieneArroba = true;
				contador++;
				System.out.println("el @ se encuentra en la posicion " +  (i+1));
			}
		}
		if (contieneArroba == true && contador == 1) {
            System.out.println("Contiene un arroba");
         
        } else if (contieneArroba == true && contador > 1) {
            System.out.println("No puede haber más de dos @");
        } else {
        	System.out.println("No hay @");
        }
	}
}
