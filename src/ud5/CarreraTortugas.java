package ud5;
//Enunciado: Simulador de Carreras


import java.util.Random;
import java.util.Scanner;
//Ejercicio hecho por Noé Guamán 
public class CarreraTortugas {
	static Scanner in = new Scanner(System.in);
	static int contIteraciones = 1;
	public static void main(String[] args) {
		jugarPartida();
		mostrarMenu();
		
	}
	public static void mostrarMenu() {
		Scanner in = new Scanner(System.in);
		char opcion;
		do {
			System.out.println("¿Quieres volver a jugar? (Si/No): ");
			opcion = in.nextLine().charAt(0);
			switch (opcion) {
			case 'S':
			case 's':
				jugarPartida();
				
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

	public static void jugarPartida() {
		Random ale = new Random();
		Scanner in = new Scanner (System.in);
		
		int cont = 1;
		String [] tortugas = {"", "", "", "", ""};
		int tortAvanza;
		
		System.out.println("¡Bienvenido al simulador de carrera de tortugas!");
		
		System.out.println("Introduce el límite para la tortuga ganadora: ");
		int limite = in.nextInt();

		
		do {
			//muestra el número de iteración en el que se encuentra la carrera
			System.out.println("");
			System.out.println("Iteración " + (cont++) + ":");
			//se genera aleatoriamente un número que indica qué tortuga avanza de las 5
			tortAvanza = ale.nextInt(5);//3 -> tortuga 4
			tortugas[tortAvanza] = tortugas[tortAvanza] + "*";
			
			//muestra el estado de la carrera
			for(int i = 0; i < 5; i++) {
				System.out.println("Tortuga " + (i+1) + ":" + tortugas[i]);
			}

			
		}while(tortugas[tortAvanza].length() != limite);

		System.out.println("Ha ganada la tortuga " + (tortAvanza + 1));

	}
	
	
}
