package ProyectoTresRayaPOO;

import java.util.Scanner;

public class UsoTresEnRaya {
	static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		TresEnRayaPOONoe juego = new TresEnRayaPOONoe();
		// juego.iniciarJuego();
		int op;
		do {
			mostrarMenu();
			System.out.println("Introduce una opción: ");
			op = Integer.parseInt(in.nextLine());
			switch (op) {
			case 1:

				juego.jugarPartida();
				menuEstadisticas();
				extracted(juego);
				break;
			case 2:
				juego.jugarPartidaConMaquina();
				menuEstadisticas();
				extracted(juego);
				break;
			case 3:
				juego.jugarMaquinaConMaquina();
				break;
			case 4:
				System.out.println("saliendo del programa ...");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (op != 4);
	}

	private static void extracted(TresEnRayaPOONoe juego) {
		int op2;
		System.out.println("Introduce una opcion");
		op2 = Integer.parseInt(in.nextLine());
		switch (op2) {
		case 1:
			juego.mostrarEstadisticas();
			break;
		case 2:
			juego.reiniciarEstadisticas();
			break;
		case 3:
			juego.jugarPartida();
			juego.mostrarEstadisticas();
			break;
		case 4:
			System.out.println("Saliendo al menu principal");
			break;
		default:
			System.out.println("Opcion no válida");
			menuEstadisticas();
			System.out.println("Introduce una opcion");
			op2 = Integer.parseInt(in.nextLine());
			break;
		}
	}

	public static void mostrarMenu() {
		System.out.println("Bienvenido al tres en raya de Noe");
		System.out.println("Seleccione la modalidad de juego:");
		System.out.println("1. 2 Jugadores");
		System.out.println("2. Jugador vs Máquina");
		System.out.println("3. Máquina vs Máquina");
		System.out.println("4. Salir del programa");
	}

	public static void menuEstadisticas() {
		System.out.println("1. Mostrar estadísticas");
		System.out.println("2. Reiniciar estadísticas");
		System.out.println("3. Volver a jugar");
		System.out.println("4. Salir");
	}

}
