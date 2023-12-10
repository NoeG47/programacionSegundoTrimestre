package ud5;

import java.util.Arrays;
import java.util.Random;

/*
 * 5. Muestra 50 números enteros aleatorios 
 * entre 100 y 199 (ambos incluidos) separados por
 * espacios. Muestra también el máximo,
 *  el mínimo y la media de esos números.
 */
public class ej5_HojaAleatorios {

	public static void main(String[] args) {
		Random ale = new Random();

		// guardamos los numeros en un array para
		// facilitar su manejo
		int[] nums = new int[50];
		// aqui generamos 50 numeros aleatorios
		// comprendidos entre 100 y 199 incluidos
		for (int i = 0; i < 50; i++) {
			nums[i] = ale.nextInt(100) + 100;
		}
		// calculamos el mínimo y máximo
		int minimo = nums[0];
		int maximo = nums [0];
		
		// suma
		int suma = 0;
		
		for (int i = 0; i < 50; i++) {
			if (nums[i] < minimo) {
				minimo = nums[i];
			}
		}
		for (int i = 0; i < 50; i++) {
			if (nums[i] > maximo) {
				maximo = nums[i];
			}
		}
		for (int i = 0; i < 50; i++) {
			suma = suma + nums[i];
		}
		// imprimir resultado
		System.out.println("Numeros generados:");
		for (int i = 0; i < 50; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println(' ');
	        System.out.println("Mínimo: " + minimo);
	        System.out.println("Máximo: " + maximo);
	        System.out.println("Suma: " + suma);
	}

}
