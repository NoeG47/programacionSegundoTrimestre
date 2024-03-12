package ProyectoTresRayaPOO;

import java.util.Random;
import java.util.Scanner;

public class TresEnRayaPOONoe {
    private static int[][] tablero;
    private static int jugadorActual;
    private static Scanner entrada;
    private static Random random;
    private static int[] estadisticas;

    public TresEnRayaPOONoe() {
        random = new Random();
        entrada = new Scanner(System.in);
        estadisticas = new int[3];
    }

    public void iniciarJuego() {
        tablero = new int[3][3];
        seleccionarModalidad();
    }

    private void reiniciarTablero() {
        tablero = new int[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    private void seleccionarModalidad() {
        System.out.println("Bienvenido al tres en raya de Noe");
        System.out.println("Seleccione la modalidad de juego:");
        System.out.println("1. 2 Jugadores");
        System.out.println("2. Jugador vs Máquina");
        System.out.println("5. Salir del programa");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                jugarDosJugadores();
                break;
            case 2:
                jugarConMaquina();
                break;
            case 5:
                System.out.println("Hasta luego");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                seleccionarModalidad();
                break;
        }
    }

    private void jugarDosJugadores() {
        determinarPrimerJugador();
        jugarPartida();
    }

    private void jugarConMaquina() {
        determinarPrimerJugador();
        jugarPartidaConMaquina();
    }

    public void jugarPartida() {
        reiniciarTablero();
        boolean continuarJuego = true;

        while (continuarJuego) {
            System.out.println("Turno del jugador " + jugadorActual);
            dibujarTablero();
            System.out.println("Ingrese la posición (1-9): ");
            int posicion = entrada.nextInt();
            if (movimientoValido(posicion)) {
                if (jugadorActual == 1) {
                    mueveJugador1(posicion);
                } else {
                    mueveJugador2(posicion);
                }
            } else {
                System.out.println("Posición inválida, intente nuevamente.");
                continue;
            }
            dibujarTablero();

            if (ganaJugador1()) {
                System.out.println("¡Jugador 1 ha ganado!");
                estadisticas[0]++;
                continuarJuego = false;

            } else if (ganaJugador2()) {
                System.out.println("¡Jugador 2 ha ganado!");
                estadisticas[1]++;
                continuarJuego = false;
            } else if (quedanMovimientos()) {
                if (jugadorActual == 1) {
                    jugadorActual = 2;
                } else {
                    jugadorActual = 1;
                }
            } else {
                System.out.println("¡Empate!");
                estadisticas[2]++;
                continuarJuego = false;
            }
        }
        entrada.nextLine(); // limpiamos el buffer
        seleccionarModalidadJvsJ();

    }

    public void jugarPartidaConMaquina() {
        reiniciarTablero();
        boolean continuarJuego = true;

        while (continuarJuego) {
            System.out.println("Turno del jugador " + jugadorActual);
            dibujarTablero();
            
            if (jugadorActual == 1) {
                System.out.println("Ingrese la posición (1-9): ");
                int posicion = entrada.nextInt();
                if (movimientoValido(posicion)) {
                    mueveJugador1(posicion);
                } else {
                    System.out.println("Posición inválida, intente nuevamente.");
                    continue;
                }
            } else {
                // Movimiento de la máquina
                int posicion = random.nextInt(9) + 1;
                while (!movimientoValido(posicion)) {
                    posicion = random.nextInt(9) + 1;
                }
                mueveJugador2(posicion);
                System.out.println("La máquina ha movido en la posición " + posicion);
            }

            dibujarTablero();

            if (ganaJugador1()) {
                System.out.println("¡Jugador 1 ha ganado!");
              
                continuarJuego = false;

            } else if (ganaJugador2()) {
                System.out.println("¡La máquina ha ganado!");
                
                continuarJuego = false;
            } else if (quedanMovimientos()) {
                if (jugadorActual == 1) {
                    jugadorActual = 2;
                } else {
                    jugadorActual = 1;
                }
            } else {
                System.out.println("¡Empate!");
              
                continuarJuego = false;
            }
        }
        entrada.nextLine(); // limpiamos el buffer
        seleccionarModalidad();
    }

    public void mostrarEstadisticas() {
        boolean hayEstadisticas = false;
        for (int i = 0; i < estadisticas.length; i++) {
            if (estadisticas[i] != 0) {
                hayEstadisticas = true;
                i = estadisticas.length;
            }
        }
        if (!hayEstadisticas) {
            System.out.println("Debes jugar una partida para tener estadísticas");
        } else {
            System.out.println("Las victorias del Jugador 1 son: " + estadisticas[0] + " veces");
            System.out.println("Las victorias del Jugador 2 son: " + estadisticas[1] + " veces");
            System.out.println("El número de partidas empatadas son: " + estadisticas[2] + '\n');
        }
    }

    public void reiniciarEstadisticas() {
        if (estadisticas[0] == 0 && estadisticas[1] == 0 && estadisticas[2] == 0) {
            System.out.println("Debes jugar al menos una vez para tener estadísticas antes de reiniciar.");

        } else {
            estadisticas[0] = 0;
            estadisticas[1] = 0;
            estadisticas[2] = 0;
        }
    }

    public void dibujarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + convertirNumeroACaracter(tablero[i][0]) + " | "
                    + convertirNumeroACaracter(tablero[i][1]) + " | " + convertirNumeroACaracter(tablero[i][2]) + " |");
            System.out.println("-------------");
        }
    }

    private void determinarPrimerJugador() {
        int jugadorAleatorio = random.nextInt(2) + 1;
        jugadorActual = jugadorAleatorio;
        System.out.println("El jugador " + jugadorActual + " será el primero en jugar.");
        if (jugadorActual == 1) {
            System.out.println("El jugador 1 jugará con la ficha X.");
        } else {
            System.out.println("El jugador 2 jugará con la ficha O.");
        }
    }

    private boolean movimientoValido(int posicion) {
        int fila = (posicion - 1) / 3;
        int columna = (posicion - 1) % 3;
        return (posicion >= 1 && posicion <= 9 && tablero[fila][columna] == 0);
    }

    public void mueveJugador1(int pos) {
        int fila = (pos - 1) / 3;
        int columna = (pos - 1) % 3;
        tablero[fila][columna] = 1;
    }

    public void mueveJugador2(int pos) {
        int fila = (pos - 1) / 3;
        int columna = (pos - 1) % 3;
        tablero[fila][columna] = 2;
    }

    private char convertirNumeroACaracter(int num) {
        if (num == 1) {
            return 'X';
        } else if (num == 2) {
            return 'O';
        } else {
            return ' ';
        }
    }

    private boolean ganaJugador1() {
        return hayTresEnLinea(1);
    }

    private boolean ganaJugador2() {
        return hayTresEnLinea(2);
    }

    private boolean hayTresEnLinea(int jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) || // Filas
                    (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) { // Columnas
                return true;
            }
        }
        // Diagonales
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
                || (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }
        return false;
    }

    private boolean quedanMovimientos() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void seleccionarModalidadJvsJ() {
        System.out.println("1. Mostrar estadísticas J1vsJ2");
        System.out.println("2. Reiniciar estadísticas J1vsJ2");
        System.out.println("3. Volver a jugar");
        System.out.println("4. Salir");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                mostrarEstadisticas();
                seleccionarModalidadJvsJ();
                break;
            case 2:
                reiniciarEstadisticas();
                seleccionarModalidadJvsJ();
                break;
            case 3:
                jugarPartida();
                break;
            case 4:
                seleccionarModalidad();
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                seleccionarModalidadJvsJ();
                break;
        }
    }

   
}
