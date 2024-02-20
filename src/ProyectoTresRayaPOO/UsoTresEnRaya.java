package ProyectoTresRayaPOO;

import java.util.Scanner;

public class UsoTresEnRaya {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TresEnRaya tablero = new TresEnRaya();
		int opcionMenu = 0;
		int[] estadisticas = { 0, 0, 0 }; // estos son los contadores de victoriasJ1, victoriasJ2, empates
		do {
			tablero.mostrarMenu();
			opcionMenu = in.nextInt();
			switch (opcionMenu) {
			case 1:
				tablero.dibujaTablero();
				//jugarPartida('X', 'O', estadisticas);
				//tablero.jugarPartida();
				break;
			case 2:
				//mostrarEstadisticas(estadisticas);
				break;
			case 3:
				//reiniciarEstadisticas(estadisticas);
				break;
			case 4:
				System.out.println("Byee");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcionMenu != 4);
	}

}
