package ud5;

import java.util.Random;
import java.util.Scanner;

/*
 * 6. Escribe un programa que piense un número
 *  al azar entre 0 y 100.
 *  El usuario debe adivinarlo y
tiene para ello 5 oportunidades. 
Después de cada intento fallido, 
el programa dirá cuántas
oportunidades quedan y si el número introducido 
es menor o mayor que el número secreto.
 * 
 * */
public class ej6_HojaAleatorios {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Random ale = new Random();
		// numero aleatorio
		int tirada = ale.nextInt(101);
		// pedimos un numero al usuario
		boolean acertado = false;
		int intentos = 5;
		System.out.println("este es el num secreto: " + tirada);
		do {
			System.out.println("Introduce un numero para adivinar el original");
			int buscarNum = in.nextInt();
			
			if (buscarNum > tirada) {
				System.out.println("El numero es mayor al numero secreto");
			}
			else if (buscarNum < tirada) {
				System.out.println("El numero es menor al numero secreto");
			}
			else  {
				System.out.println("Bingo, has acertado el numero");
				acertado = true;
			}
			intentos--;
			System.out.println("Te quedan " + intentos + " oportunidades");
		}  while (acertado == false && intentos > 0);
		if (acertado == false) {
		    System.out.println("¡Agotaste tus oportunidades! El número correcto era " + tirada);
		}
	}

}
