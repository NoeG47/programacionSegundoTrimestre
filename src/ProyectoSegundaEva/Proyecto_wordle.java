package ProyectoSegundaEva;

import java.util.Random;
import java.util.Scanner;

public class Proyecto_wordle {
	static Scanner in = new Scanner(System.in);
	static String palabraSecreta = " ";
	static int numIntentosConsumidos = 6;
	static int numLetrasAdivinadas = 0;
	static int i = 0;

	public static void main(String[] args) {
		String[] palabras = { "robar", "comer", "lapiz", "camion", "juego", "letra", "jorge", "gafas", "manta", "queso",
				"ranas", "canoa", "avion", "lento", "novio", "cable", "raton", "color", "reina", "cocos" };
		Random ale = new Random();
		int numAle = ale.nextInt(21);
		palabraSecreta = palabras[numAle];
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		System.out.println(palabraSecreta);
		// do {
		System.out.println("Introduce una palabra de 5 letras");
		String palabraIntroducida = in.nextLine().toLowerCase(); // convertimos a minusculas
		if (!contiene5letras(palabraIntroducida)) {
			System.out.println("Debe ser una palabra de 5 letras");
		}
		if (!contieneSoloLetras(palabraIntroducida)) {
			System.out.println("Solo se admiten letras");

		}
		if (contieneVocales(palabraIntroducida, vocales) == true && contarVocales(palabraIntroducida, vocales) <= 1) {
			System.out.println("contiene una vocal pero se necesitan mas de 2 y maximo de 3");
		} 
		if (contieneVocales(palabraIntroducida, vocales) == true && contarVocales(palabraIntroducida, vocales) >= 2) {
			System.out.println("contiene vocales");
		} 
		else {
			System.out.println("esta mal");
		}

		// } while ();

	}
	/*
	 * public static boolean haGanadoJugador1(String cad) {
	 * 
	 * } public static boolean haTerminadoJuego(String cad, intentos) {
	 * 
	 * } public static String compruebaLetrasAcertadas(String cad) {
	 * 
	 * } public static String generaPalabra() {
	 * 
	 * }
	 */

	// COMPROBACIONES
	public static boolean contiene5letras(String cad) {
		if (cad.length() > 0 && cad.length() < 5) {
			return false;
		}
		return true;
	}

	public static boolean contieneSoloLetras(String cad) {
		for (i = 0; i < cad.length(); i++) {
			char caracter = cad.charAt(i);
			// Verifica si el carácter no es una letra
			if (!Character.isLetter(caracter)) {
				return false;
			}
		}
		return true;
	}

	public static boolean contieneVocales(String cad, char[] vocales) {
		for (int i = 0; i < cad.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (cad.charAt(i) == vocales[j]) {
					return true;
				}
			}
			
		}
		return false;
	}

	public static int contarVocales(String cad, char[] vocales) {
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

}