package ud6;

import java.util.Scanner;

public class UsoFraccion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Fraccion f1 = new Fraccion (1,3);
		// Fraccion f2 = new Fraccion (2,6);
		int num, den;

		// pedir numerado y denominador de fraccion 1
		System.out.println("Introduce el numerador de la 1º Fraccion");
		num = in.nextInt();
		System.out.println("Introduce el denominador de la 1º Fraccion");
		den = in.nextInt();
		Fraccion f1 = new Fraccion(num, den);
		// pedir numerado y denominador de fraccion 2
		System.out.println("Introduce el numerador de la 2º Fraccion");
		num = in.nextInt();
		System.out.println("Introduce el denominador de la 2º Fraccion");
		den = in.nextInt();
		Fraccion f2 = new Fraccion(num, den);

		// cambiar aqui el método
		Fraccion f3 = f1.dividir(f2);
		System.out.println("la division de " + f1 + " y " + f2 + " es");
		f3.mostrar();

		// llamar al metodo para simplificar
		System.out.println("la fracción simplificada de " + f1 + " es: ");
		f1.simplificar();

		f1.mostrar();
		System.out.println("la fracción simplificada de " + f2 + " es: ");
		f2.simplificar();

		f2.mostrar();

		// Ver si la fraccion 2 es equivalante
		if (f1.sonEquivalentes(f2)) {
			System.out.println("la 2º fracción es equivalante");
		} else {
			System.out.println("la 2º fraccion no es equivalante");
		}

	}

}
