package ud5;

import java.util.Scanner;

/*Hacer un progrma que lea un numero entero y lo multiplique por 2. Se debe controlar que es un entero*/
public class EjemploEscaner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		boolean esInt = in.hasNextInt();
		if (esInt==true) {
		int num = in.nextInt();
		System.out.println("El numero multiplicado por 2 es: " + (num * 2));
}
		else {
			System.out.println("El numero NO es entero");
		}
	}

}
