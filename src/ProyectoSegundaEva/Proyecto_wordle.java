package ProyectoSegundaEva;

import java.util.Random;
import java.util.Scanner;

public class Proyecto_wordle {
	static Scanner in = new Scanner(System.in);
	static String palabraSecreta = " ";
	static int numIntentosConsumidos = 6;
	static int numLetrasAdivinadas = 0;
	static char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {
		// Aquí va el bucle para preguntar si quiere jugar o no
		char opcion = ' ';
		do {
			System.out.println("¿Deseas jugar otra partida? S/N");
			opcion = in.nextLine().charAt(0);
			switch (opcion) {
			case 'S':
			case 's':
				System.out.println("aqui va el juego");
				break;
			case 'N':
			case 'n':
				System.out.println("Fin del juego");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 'N' && opcion != 'n');
		//Aquí empieza el juego
		generaPalabra();
		boolean esCorrecta = false;
		do {
			System.out.println("Introduce una palabra de 5 letras: ");
			String palabraIntroducida = in.nextLine().toLowerCase(); // convertimos a minusculas

			if (palabraEsCorrecta(palabraIntroducida)) {
				System.out.println("La palabra cumple con los requisitos");
				//Aquí se desarrolla el resto del juego
				compruebaLetrasAcertadas(palabraIntroducida, palabraSecreta);
				
				//Si el jugador ha adivinado la palabra
				haGanadoJugador1(palabraIntroducida);
				//System.out.println(palabraIntroducida);
				esCorrecta = true;
			} else {
				System.out.println("La palabra no cumple con los requisitos");
			}

		} while (!esCorrecta);

	}

	public static boolean haGanadoJugador1(String palabra) {
		if (palabra.equals(palabraSecreta)) {
			System.out.println("Enhorabuena! Has acertado la palabra");
			return true;
		}
		;
		return false;
	}

	/*
	 * public static boolean haTerminadoJuego(String cad, intentos) {
	 * 
	 * } */
	public static void compruebaLetrasAcertadas(String palabraIntroducida, String palabraOculta) {
	 for (int i = 0; i < palabraIntroducida.length(); i++) {
		 if (palabraIntroducida.charAt(i) == palabraOculta.charAt(i)) {
			 System.out.print(palabraIntroducida.charAt(i));
		 }
		 
	 
	 }
	}
	 
	public static void generaPalabra() {
		String[] palabras = { "robar", "comer", "lapiz", "camion", "juego", "letra", "sofia", "gafas", "manta", "queso",
				"ranas", "canoa", "avion", "lento", "novio", "cable", "raton", "color", "reina", "cocos" };
		Random ale = new Random();
		int numAle = ale.nextInt(palabras.length);
		palabraSecreta = palabras[numAle];

		System.out.println(palabraSecreta);
	}

	// COMPROBACIONES
	public static boolean palabraEsCorrecta(String cad) {
		if (!contiene5letras(cad))
			return false;
		if (contieneAlgunEspacio(cad))
			return false;
		if (!contieneSoloLetras(cad))
			return false;
		if (!contieneVocales(cad))
			return false;
		// si no esta en el rango de 2 y 3 devuelve falso
		if (!(contarVocales(cad) >= 2 && contarVocales(cad) <= 3))
			return false;
		if (contieneVocalesIgualesSeguidas(cad))
			return false;
		if (terminaEnQWX(cad))
			return false;
		if (contieneConsonantesSeguidas(cad))
			return false;
		// en caso contrario
		return true;
	}

	// Debe tener exactamente 5 letras.
	public static boolean contiene5letras(String cad) {
		if (cad.length() != 5) {
			return false;
		}
		return true;
	}

	/*
	 * No debe contener números, u otros caracteres especiales Solo admite que el
	 * usuario introduzca letras.
	 */
	public static boolean contieneSoloLetras(String cad) {
		for (int i = 0; i < cad.length(); i++) {
			char caracter = cad.charAt(i);
			// Verifica si el carácter no es una letra
			if (!Character.isLetter(caracter)) {
				System.out.println("Solo se admiten letras");
				return false;
			}
		}
		return true;
	}

	// Para comprobar si tiene alguna vocal
	public static boolean contieneVocales(String cad) {
		for (int i = 0; i < cad.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (cad.charAt(i) == vocales[j]) {
					return true;
				}
			}
		}
		System.out.println("No contiene ninguna vocal");
		return false;
	}

	// Despues de comprobar, que tenga entre dos y tres vocales.
	public static int contarVocales(String cad) {
		int cont = 0;
		for (int i = 0; i < cad.length(); i++) {
			char letraActual = cad.charAt(i);
			for (int j = 0; j < vocales.length; j++) {
				if (letraActual == vocales[j]) {
					cont++;
				}
			}
		}
		return cont;
	}

	// No debe contener espacios
	public static boolean contieneAlgunEspacio(String cad) {
		if (cad.contains(" ")) {
			System.out.println("No se admiten espacios");
			return true;
		}

		// si no lo contiene
		return false;
	}

	// no debe contener dos vocales iguales seguidas
	public static boolean contieneVocalesIgualesSeguidas(String cad) {
		for (int i = 0; i < cad.length() - 1; i++) {
			char letraActual = cad.charAt(i);
			char siguienteLetra = cad.charAt(i + 1);

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

	public static boolean terminaEnQWX(String cad) {

		char letraFinal = cad.charAt(cad.length() - 1);
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

	public static boolean contieneConsonantesSeguidas(String cad) {
		for (int i = 0; i < cad.length() - 2; i++) {
			char letraActual = cad.charAt(i);
			char letraSiguiente = cad.charAt(i + 1);
			char letraFinal = cad.charAt(i + 2);

			if (!esVocal(letraActual) && !esVocal(letraSiguiente) && !esVocal(letraFinal)) {
				System.out.println("No puedes tener 3 consonantes seguidas.");
				return true;
			}
		}
		return false;
	}
}