package ProyectoSegundaEva;

import java.util.Random;
import java.util.Scanner;

public class Proyecto_wordleNoeGuaman {
	static Scanner in = new Scanner(System.in);
	static String palabraSecreta;
	static int numIntentosConsumidos;
	static int numLetrasAdivinadas = 0;
	static char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
	static int contWinsMaquina;
	static int contWinsJugador;

	public static void main(String[] args) {
		System.out.println("Bienvenido al juego de Wordle");
		jugarPartida();
	}

	public static void jugarPartida() {
		// Inicializar valores para una nueva palabra
		numIntentosConsumidos = 6;
		// Aquí empieza el juego
		elegirIdiomaJuego();
		boolean esPalabraValida = false;
		do {
			numLetrasAdivinadas = 0;
			System.out.println("Introduce una palabra de 5 letras: ");
			String palabraIntroducida = in.nextLine().toLowerCase(); // convertimos a minusculas
			// Caso correcto, Si la palabra cumple los requisitos pasa
			// al funcionamiento del juego
			if (palabraEsCorrecta(palabraIntroducida)) {
				System.out.println("La palabra cumple con los requisitos");
				String resultado = compruebaLetrasAcertadas(palabraIntroducida, palabraSecreta);
				System.out.println(resultado);
				System.out.println("Has acertado " + numLetrasAdivinadas + " letras correctas");
				// Si gana el jugador 1
				if (haGanadoJugador1(palabraIntroducida)) {
					System.out.println("Enhorabuena! Has acertado la palabra");
					esPalabraValida = true;
					contWinsJugador++;
					System.out.println("Tú: " + contWinsJugador + " vs " + " Máquina: " + contWinsMaquina);
				}
				// Aquí solo decrementamos los intentos si no se ha acertado la palabra
				else {
					numIntentosConsumidos--;
					//Breve control de mensajes de aviso para el jugador 
					if (numIntentosConsumidos >= 1) {
						System.out.println("La palabra no es correcta. Inténtalo de nuevo.");
						System.out.println("Intentos restantes: " + numIntentosConsumidos);
					}
					if (haTerminadoJuego()) {
						System.out.println("Te has quedado sin intentos. La palabra secreta era: " + palabraSecreta);
						contWinsMaquina++;
						System.out.println("Tú: " + contWinsJugador + " vs " + " Máquina: " + contWinsMaquina);
						esPalabraValida = true;
					}

				}
			}

			// Si la palabra
			// no cumple con los requisitos exigidos
			// ya sea palabras raras etc
			else {
				System.out.println("La palabra no cumple con los requisitos");
				System.out.println("Introduce una palabra válida: ");
			}

		} while (!esPalabraValida);
		reiniciarJuego();
		in.nextLine();
	}

	public static void reiniciarJuego() {
		// Aquí va el bucle para preguntar si quiere jugar o no
		char opcion = ' ';
		do {
			System.out.println("¿Deseas jugar otra partida? S/N");
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

	public static boolean haGanadoJugador1(String palabra) {
		if (palabra.equals(palabraSecreta)) {
			return true;
		}
		return false;
	}

	public static boolean haTerminadoJuego() {
		if (numIntentosConsumidos <= 0) {
			return true;
		}
		return false;
	}

	public static String compruebaLetrasAcertadas(String palabraIntroducida, String palabraSecreta) {
		char[] resultado = new char[palabraIntroducida.length()];

		for (int i = 0; i < palabraIntroducida.length(); i++) {
			char letraIntroducida = palabraIntroducida.charAt(i);
			char letraSecreta = palabraSecreta.charAt(i);

			if (letraIntroducida == letraSecreta) {
				resultado[i] = Character.toUpperCase(letraIntroducida);
				numLetrasAdivinadas++;
			} else if (palabraSecreta.contains(String.valueOf(letraIntroducida))
					&& !contieneLetraDuplicada(palabraIntroducida, letraIntroducida, i)) {
				resultado[i] = letraIntroducida;

			} else {
				resultado[i] = '*';
			}
		}
		return new String(resultado);
	}
	
	public static boolean contieneLetraDuplicada(String palabra, char letra, int posicionActual) {
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (i != posicionActual && palabra.charAt(i) == letra) {
				contador++;
			}
		}
		return contador > 0;
	}

	public static void generaPalabra() {
		String[] palabras = { "robar", "comer", "lapiz", "carta", "juego", "letra", "sofia", "gafas", "manta", "queso",
				"ranas", "canoa", "avion", "lento", "novio", "cable", "raton", "color", "reina", "cocos" };
		Random ale = new Random();
		int numAle = ale.nextInt(palabras.length);
		palabraSecreta = palabras[numAle];
		// Descomenta si quieres ver cual es la palabra secreta
		// System.out.println(palabraSecreta);
	}
	//modificacion 1 palabras en ingles
	public static void generaPalabrasIngles() {
		String[] englishWord = { "house", "plant", "water", "music", "phone", "bread", "money", "table", "happy", "watch",
				"fruit", "green", "chair", "party", "light", "apple", "beach", "earth", "smile", "river" };
		Random ale = new Random();
		int numAle = ale.nextInt(englishWord.length);
		palabraSecreta = englishWord[numAle];
		// Descomenta si quieres ver cual es la palabra secreta
		 System.out.println(palabraSecreta);
	}
	
	public static void elegirIdiomaJuego() {
		String opcion = " ";
		boolean esOpcionValida = false;
		do {
			System.out.println("¿En qué idioma deseas adivinar la palabra?");
			System.out.println("Castellano o Ingles");
			opcion = in.nextLine();
			opcion = opcion.toLowerCase();
			switch (opcion) {
			case "castellano":
				generaPalabra();
				esOpcionValida = true;
				break;
			case "ingles":
				generaPalabrasIngles();
				esOpcionValida = true;
				break;
			default:
				System.out.println("Ingresa una opción válida para empezar a jugar");
			}

		} while (esOpcionValida == false);
	}
	

	// COMPROBACIONES
	public static boolean palabraEsCorrecta(String palabra) {
		if (!contiene5letras(palabra))
			return false;
		if (contieneAlgunEspacio(palabra))
			return false;
		if (!contieneSoloLetras(palabra))
			return false;
		if (!contieneVocales(palabra))
			return false;
		// si no esta en el rango de 2 y 3 devuelve falso
		if (!(contarVocales(palabra) >= 2 && contarVocales(palabra) <= 3))
			return false;
		if (contieneVocalesIgualesSeguidas(palabra))
			return false;
		if (terminaEnQWX(palabra))
			return false;
		if (contieneConsonantesSeguidas(palabra))
			return false;
		// en caso contrario:
		return true;
	}

	// Debe tener exactamente 5 letras.
	public static boolean contiene5letras(String palabra) {
		if (palabra.length() != 5) {
			return false;
		}
		return true;
	}

	/*
	 * No debe contener números, u otros caracteres especiales Solo admite que el
	 * usuario introduzca letras.
	 */

	public static boolean contieneSoloLetras(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			char caracter = palabra.charAt(i);
			// Verifica si el carácter no es una letra
			if (!Character.isLetter(caracter)) {
				System.out.println("Solo se admiten letras");
				return false;
			}
		}
		return true;
	}

	// Para comprobar si tiene alguna vocal
	public static boolean contieneVocales(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (palabra.charAt(i) == vocales[j]) {
					return true;
				}
			}
		}
		System.out.println("No contiene ninguna vocal");
		return false;
	}

	// Despues de comprobar, que tenga entre dos y tres vocales.
	public static int contarVocales(String palabra) {
		int cont = 0;
		for (int i = 0; i < palabra.length(); i++) {
			char letraActual = palabra.charAt(i);
			for (int j = 0; j < vocales.length; j++) {
				if (letraActual == vocales[j]) {
					cont++;
				}
			}
		}
		return cont;
	}

	// No debe contener espacios
	public static boolean contieneAlgunEspacio(String palabra) {
		if (palabra.contains(" ")) {
			System.out.println("No se admiten espacios");
			return true;
		}

		// si no lo contiene
		return false;
	}

	// no debe contener dos vocales iguales seguidas
	public static boolean contieneVocalesIgualesSeguidas(String palabra) {
		for (int i = 0; i < palabra.length() - 1; i++) {
			char letraActual = palabra.charAt(i);
			char siguienteLetra = palabra.charAt(i + 1);

			if (esVocal(letraActual) && esVocal(siguienteLetra) && letraActual == siguienteLetra) {
				System.out.println("No puedes tener más de dos vocales seguidas");
				return true;
			}
		}
		// si no lo contiene
		return false;
	}

	public static boolean esVocal(char letra) {
		for (int j = 0; j < vocales.length; j++) {
			if (letra == vocales[j]) {
				return true;
			}
		}
		// si no lo contiene
		return false;
	}

	public static boolean terminaEnQWX(String palabra) {
		char letraFinal = palabra.charAt(palabra.length() - 1);
		char[] letrasRaras = { 'q', 'w', 'x' };
		for (int i = 0; i < 3; i++) {
			if (letraFinal == letrasRaras[i]) {
				System.out.println("La palabra no puede acabar q, w, x");
				return true;
			}
		}
		// si no lo contiene
		return false;
	}

	public static boolean contieneConsonantesSeguidas(String palabra) {
		for (int i = 0; i < palabra.length() - 2; i++) {
			char letraActual = palabra.charAt(i);
			char letraSiguiente = palabra.charAt(i + 1);
			char letraFinal = palabra.charAt(i + 2);

			if (!esVocal(letraActual) && !esVocal(letraSiguiente) && !esVocal(letraFinal)) {
				System.out.println("No puedes tener 3 consonantes seguidas.");
				return true;
			}
		}
		return false;
	}
}