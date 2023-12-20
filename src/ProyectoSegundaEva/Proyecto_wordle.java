package ProyectoSegundaEva;

import java.util.Random;
import java.util.Scanner;

public class Proyecto_wordle {
	static Scanner in = new Scanner(System.in);
	static String palabraSecreta = " ";
	static int numIntentosConsumidos = 6;
	static int numLetrasAdivinadas = 0;
	static int i = 0;
	static char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
	public static void main(String[] args) {
		String[] palabras = { "robar", "comer", "lapiz", "camion", "juego", "letra", "jorge", "gafas", "manta", "queso",
				"ranas", "canoa", "avion", "lento", "novio", "cable", "raton", "color", "reina", "cocos" };
		Random ale = new Random();
		int numAle = ale.nextInt(21);
		palabraSecreta = palabras[numAle];
		

		System.out.println(palabraSecreta);
		boolean esCorrecta = false;
		do {
		System.out.println("Introduce una palabra de 5 letras: ");
		String palabraIntroducida = in.nextLine().toLowerCase(); // convertimos a minusculas
		
		if(palabraEsCorrecta(palabraIntroducida) == true) {
			System.out.println("La palabra cumple con los requisitos");
			System.out.println(palabraIntroducida);
			esCorrecta = true;
		}
		else {
			System.out.println("La palabra no cumple con los requisitos");
		}
		
		

		} while (!esCorrecta);

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
	public static boolean palabraEsCorrecta(String cad) {
		if(!contiene5letras(cad))
			return false;
		if(!contieneSoloLetras(cad))
			return false;
		if(!contieneVocales(cad) && (contarVocales(cad) < 2 || contarVocales(cad) > 3))
			return false;
		if(contieneAlgunEspacio(cad))
			return false;
		//en caso contrario
		return true;
	}
	
	
	public static boolean contiene5letras(String cad) {
		if (cad.length() != 5) {
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

	public static boolean contieneVocales(String cad) {
		for (int i = 0; i < cad.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (cad.charAt(i) == vocales[j]) {
					return true;
				}
			}
			
		}
		return false;
	}

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
	public static boolean contieneAlgunEspacio(String cad) {
		if (cad.contains(" "))
			return true;
		//si no lo contiene
		return false;
	}
	
}