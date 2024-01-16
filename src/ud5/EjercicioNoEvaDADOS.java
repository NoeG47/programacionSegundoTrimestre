package ud5;
//Enunciado: Simulador de Dados
// Crea un programa en Java que simule el lanzamiento de dos dados. El programa debe generar aleatoriamente los resultados de ambos dados y mostrar la suma de los valores obtenidos. Además, el programa debe permitir al usuario lanzar los dados varias veces si así lo desea.


import java.util.Random;
import java.util.Scanner;
//Ejercicio hecho por Noé Guamán 
public class EjercicioNoEvaDADOS {
	static Scanner in = new Scanner(System.in);
	static int contVecesJugadas = 1;
	public static void main(String[] args) {
		generarDados();
		mostrarMenu();
		
	}
	public static void mostrarMenu() {
		Scanner in = new Scanner(System.in);
		char opcion;
		do {
			System.out.println("¿¿Quieres lanzar los dados nuevamente? (Si/No): ");
			opcion = in.nextLine().charAt(0);
			switch (opcion) {
			case 'S':
			case 's':
				contVecesJugadas++;
				generarDados();
				
				break;
			case 'N':
			case 'n':
				System.out.println("Fin del juego");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 'N' && opcion != 'n');
	}

	public static void generarDados() {
		Random ale = new Random();
		int tirada1 = 0;
		int tirada2 = 0;
		System.out.println("Lazamiento: " + contVecesJugadas);
		tirada1 = ale.nextInt(6) + 1;
		tirada2 = ale.nextInt(6) + 1;
		System.out.println("Dado1: " + tirada1);
		System.out.println("Dado2: " + tirada2);
		
		int sumaDados = tirada1 + tirada2;
		System.out.println("Suma total: " + sumaDados);
		
	}
}
