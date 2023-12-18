package ud5;

import java.util.Random;
import java.util.Scanner;

/*18. Realizar un juego que genera un número aleatorio entre 50 y 100 (incluidos), y, el jugador
tiene 3 intentos para adivinar el número.
*/
public class Ej18_hojaAleatorios {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Random ale = new Random ();
		int numAle = ale.nextInt(51)+50;
		int intentos = 1;
		int num =0;
		System.out.println("El num secreto es: " + numAle);
		do {
			//pedir al usuario un numero
			System.out.println("Introduce un numero para adivinar el numero secreto: ");
			boolean esInt = in.hasNextInt();
			if (esInt == true) {
				 num = in.nextInt();
				if (num != numAle) {
					System.out.println("Numero incorrecto, intentalo de nuevo");
					
					System.out.println("llevas " + intentos + " intentos de 3");
					intentos++;
					
				}
				else {
					System.out.println("Has acertado");
				}
			} else {
				
				System.out.println("No se admiten decimales o NO es numero");
				  in.next(); 
			}
			
		}
		while (num!= numAle && intentos < 3);
		
	}

}
