package ProyectoTresRayaPOO;

import java.util.Scanner;

public class TresEnRaya {
	//atributos
	private int vacio  = 0;
	private int equis = 1;
	private int circulo = 2;
	
	private int[][] tablero;
	
	//constructor
	public TresEnRaya() {
		this.tablero = new int [3][3];
		
		
	}
	// funcion que pone a 0 todo el tablero
		public void iniciar() {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					tablero[j][i] = vacio;
					
				}
			}
		}
		// funcion que dibuja el tablero
		public  void dibujaTablero() {
			System.out.println("-------------");
			System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " | ");
			System.out.println("-------------");
			System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " | ");
			System.out.println("-------------");
			System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " | ");
			System.out.println("-------------");
		}
		// funcion que muestra el menu con las diferentes opciones
		public void mostrarMenu() {
			System.out.println("---- Tres en raya de Noé Guamán -----");
			System.out.println("Opciones de menu");
			System.out.println("1. Jugar partida");
			System.out.println("2. Mostrar estadísticas");
			System.out.println("3. Reiniciar estadísticas");
			System.out.println("4. Salir");
			System.out.println("Selecciona una opción: ");
		}
		public void mostrarModalidades() {
			System.out.println("Opciones de juego");
			System.out.println("1. Jugador vs Jugador");
			System.out.println("2. Jugador vs Máquina");
			System.out.println("3. Máquina vs Máquina");
			System.out.println("Selecciona una opción: ");

		}
		public void jugarPartida() {
			Scanner in = new Scanner(System.in);
			int opcionModalidad = 0;
			do {
				mostrarModalidades();
				opcionModalidad = in.nextInt();
				switch (opcionModalidad) {
				case 1:
					//Jugar dos jugadores
					//jugarDosJugadores();
					break;
				case 2:
					//Jugador vs Máquina
					//jugarJugadorMaquia();
					break;
				case 3:
					//Máquina vs Máquina
					//jugarMaquinaMaquina();
					break;
	
				default:
					System.out.println("Opción no válida");
				}
			} while (opcionModalidad != 4);
		}
		private void jugarDosJugadores() {
		    Scanner in = new Scanner(System.in);
		    int jugadorActual = equis; // Empezamos con equis
		    boolean juegoTerminado = false;
		    
		    while (!juegoTerminado) {
		        
		        dibujaTablero();
		        
		        // Solicitar al jugador actual que haga su movimiento
		        System.out.println("Turno del jugador " + (jugadorActual == equis ? "X" : "O"));
		        System.out.print("Ingrese la fila (0-2): ");
		        int fila = in.nextInt();
		        System.out.print("Ingrese la columna (0-2): ");
		        int columna = in.nextInt();
		        
		        // Verificar si la casilla está vacía
		        if (tablero[fila][columna] == vacio) {
		            // Realizar el movimiento
		            tablero[fila][columna] = jugadorActual;
		            
		            /*
		            // Verificar si el jugador actual ha ganado
		            if (haGanado(jugadorActual)) {
		                System.out.println("¡El jugador " + (jugadorActual == equis ? "X" : "O") + " ha ganado!");
		                juegoTerminado = true;
		            } else if (hayEmpate()) { // Verificar si hay un empate
		                System.out.println("¡Empate!");
		                juegoTerminado = true;
		            } else {
		                // Cambiar al siguiente jugador
		                jugadorActual = (jugadorActual == equis) ? circulo : equis;
		            }*/     
		        } else {
		            System.out.println("¡Casilla ocupada! Por favor, elige otra.");
		        }
		    }
		}

		/* funcion que comprueba si el movimiento es valido
		public  boolean movimientoValido(int pos) {
			if (pos < 1 || pos > 9 || tablero[fila - 1][pos - 1] != 0) {
				System.out.println("Movimiento no válido");
				return false;
			}
			return true;
		}
		// funcion que define la posicion del jugador 1
		public void mueveJugador1(int pos) {
			if (movimientoValido(pos) == true) {
				tablero[pos - 1][pos - 1] = 1;
			}
		}*/
		//private void jugarJugadorVsMaquina() {
		
		//}

		//private void jugarMaquinaVsMaquina() {
		    
		//}

}
