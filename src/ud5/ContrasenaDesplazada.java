package ud5;

import java.util.Scanner;

public class ContrasenaDesplazada {

	public static void main(String[] args) {
		mostrarMenu();
	}

	public static void mostrarMenu() {
		Scanner in = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Bienvenido al menu");
			System.out.println("-----------------------");
			System.out.println("1. Cifrar mensaje");
			System.out.println("2. Descifrar mensaje");
			System.out.println("3. Salir");
			opcion = in.nextInt();
			switch (opcion) {
			case 1:
				String mensajeCifrado = cifrarMensaje();
				System.out.println(mensajeCifrado);
				break;
			case 2:
				//String mensajeDescifrado = descifrarMensaje(cifrarMensaje());
				//System.out.println(mensajeDescifrado);
				break;
			case 3:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 3);
	}

	public static String cifrarMensaje() {
		Scanner in = new Scanner(System.in);
		int desplazamientosCaracter = 0;
		// en el abecedario hay 26 posiciones
		boolean correcto = false;
		do {
			System.out.println("Ingrese el numero de desplazamiento");

			boolean esInt = in.hasNextInt();
			if (esInt == true) {
				desplazamientosCaracter = in.nextInt();
				correcto = true;
			} else {
				System.out.println("ERROR, Solo se admiten numeros");
				in.nextLine();
			}

		} while (correcto == false);

		// convertir una letra a otra sumandole su desplazamiento
		// caso pequeño
		// char letra = 'h';
		// char letraConv = 'h' + 3;
		// System.out.println(letraConv);

		// pedir frase al usuario
		String frase = in.nextLine();
		System.out.println("Introduce una frase");
		frase = in.nextLine();

		// frase cifrada como una cadena vacía
		String fraseCifrado = "";

		// recorrer la frase entera
		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			char caracterCod = caracter;
			// minuscula
			if (caracter >= 'a' && caracter <= 'z') {
				caracterCod = (char) (caracter + desplazamientosCaracter);
				if (caracterCod > 'z')
					caracterCod = (char) (caracterCod - ('z' - 'a' + 1));
			}
			fraseCifrado += caracterCod;
			// cualquier otro caracter
			
				

		}
		return fraseCifrado;
	}

	/*public static String descifrarMensaje(String mensaje) {
	
	}*/
}
