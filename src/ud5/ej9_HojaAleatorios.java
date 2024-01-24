package ud5;

import java.util.Random;

/*
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos
números se han generado.
 * 
 * 
 * */
public class ej9_HojaAleatorios {

	public static void main(String[] args) {
		Random ale = new Random();
		int num;
		int cont = 0;
		do {
			// Para generar numeros pares
			int numAle = ale.nextInt(51);
			num = numAle * 2;
			System.out.println(num);
			cont++;
		} while (num != 24);
		
		System.out.println("cont: " + cont);
	}

}
