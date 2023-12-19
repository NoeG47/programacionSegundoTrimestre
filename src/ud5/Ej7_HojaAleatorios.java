package ud5;

import java.util.Random;

/*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
partidos y el pleno al quince (15 filas).
*/
public class Ej7_HojaAleatorios {

	public static void main(String[] args) {
		int[][] matriz = new int[14][3];
		// creamos objeto
		Random ale = new Random();
		int numAle = 0;
		String[] resultados = {"1","x","2"};
		// rellenamos el array bidimensional
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 3; j++) {
				 numAle = ale.nextInt(3);
				matriz[i][j] = numAle;
			}
		}
		// leemos el array bidimensional
		System.out.println("Tu quiniela es: ");
		for (int i = 0; i < 14; i++) {                              
			System.out.println("fila " + (i+1) + ":");
			for (int j = 0; j < 3; j++) {
				// Mapeamos el valor numérico a 1, x o 2
                String resultado = resultados[matriz[i][j]];
                System.out.print(resultado + " ");
			}
			System.out.println();
		}
		// caso fila 15
		 // Generamos un pronóstico aleatorio para el pleno al quince
        int pronosticoPleno = ale.nextInt(3);
        String resultadoPleno = resultados[pronosticoPleno];

        // Mostramos el pronóstico para el pleno al quince
        System.out.println("pleno fila 15: " + resultadoPleno);
		
	}

}
