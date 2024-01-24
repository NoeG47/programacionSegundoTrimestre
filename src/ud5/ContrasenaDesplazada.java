package ud5;

import java.util.Scanner;

public class ContrasenaDesplazada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int desplazamientosCaracter = 0;
		// en el abecedario hay 26 posiciones
		/*boolean correcto = false;
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

		} while (correcto == false);*/
		boolean esInt = false;
		while (!esInt) {
			System.out.println("Ingrese el numero de desplazamiento");
			 esInt = in.hasNextInt();
			if (esInt == true) {
				desplazamientosCaracter = in.nextInt();
				esInt = true;
			} else {
				System.out.println("ERROR, Solo se admiten numeros");
			}
		}

		mostrarMenu(desplazamientosCaracter);
	}

	public static void mostrarMenu(int desplazamientosCaracter) {
		Scanner in = new Scanner(System.in);
		String msg;
		int opcion;
		do {
			System.out.println("Bienvenido al menu de cifrado o descifrado");
			System.out.println("-----------------------");
			System.out.println("1. Cifrar mensaje");
			System.out.println("2. Descifrar mensaje");
			System.out.println("3. Salir");
			opcion = in.nextInt();
			
			switch (opcion) {
			case 1:
				// pedir frase al usuario
				System.out.println("Introduce una frase");
				in.nextLine();
				msg = in.nextLine();
				String mensajeCifrado = codificar(msg,desplazamientosCaracter);
				System.out.println("Mensaje cifrado: " + mensajeCifrado);
				
				break;
			case 2:
				// pedir frase al usuario
			
				System.out.println("Introduce una frase");
				in.nextLine();
				msg = in.nextLine();
				String mensajeDescifrado = decodificar(msg,desplazamientosCaracter);
				System.out.println( "Mensaje descifrado: " + mensajeDescifrado);
				break;
			case 3:
				System.out.println("Saliendo del programa. Hasta luego");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 3);
		in.close();
	}

	public static String codificar(String mensaje, int desplazamiento) {
		// frase cifrada como una cadena vacía
		String msgCifrado = "";
		// convertir una letra a otra sumandole su desplazamiento
		// caso pequeño
		// char letra = 'h';
		// char letraConv = 'h' + 3;
		// System.out.println(letraConv);

		// recorrer la frase entera
		for (int i = 0; i < mensaje.length(); i++) {
			char caracter = mensaje.charAt(i);
			char caracterCod = caracter;
			// minuscula
			if (caracter >= 'a' && caracter <= 'z') {
				caracterCod = (char) (caracter + desplazamiento);
				if (caracterCod > 'z')
					caracterCod = (char) (caracterCod - ('z' - 'a' + 1));
			}
			msgCifrado += caracterCod;
			// cualquier otro caracter

		}
		return msgCifrado;
	}

	public static String decodificar(String mensaje, int desplazamiento) {
		 return codificar(mensaje, desplazamiento * (-1));
	}
}
