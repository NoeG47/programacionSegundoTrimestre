package ud6;

import java.util.Scanner;

public class UsoFraccion2 {

	public static void main(String[] args) {
		int tamano = pedirNumero();
		Fraccion [] fracciones = rellenaArray(tamano);
		Fraccion resultadoSuma = sumarArray(fracciones);
		resultadoSuma.mostrar();
	}
	public static int pedirNumero() {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Introduce el numero de fracciones que quieres guardar: ");
		num  = in.nextInt();
		return num;
	}
	public static Fraccion[] rellenaArray(int tamano) {
		Scanner in = new Scanner(System.in);
		Fraccion [] fracciones = new Fraccion [tamano];
		int num, den;
		for (int i = 0; i < fracciones.length; i++) {
			System.out.println("Introduce un numerador: ");
			num = in.nextInt();
			System.out.println("Introduce un denominador: ");
			den = in.nextInt();
			fracciones[i] = new Fraccion (num, den);
		}
		return fracciones;
	}
	public static Fraccion sumarArray(Fraccion[] fracciones) {
		Fraccion sum = fracciones[0];
		for (int i = 1; i < fracciones.length; i++) {
			sum = sum.sumar(fracciones[i]);
		}
		return sum;
		
	}

}
