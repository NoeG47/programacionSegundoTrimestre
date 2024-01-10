package ud5;

import java.util.Random;
import java.util.Scanner;

/*Desarrolla un programa en Java que permita generar contraseñas tanto débiles como fuertes. El programa debe pedir al usuario que elija entre generar una contraseña débil o una fuerte.

Para las contraseñas débiles, el programa deberá generar una contraseña de longitud fija (por ejemplo, 6 caracteres) compuesta únicamente por letras minúsculas.

Para las contraseñas fuertes, el programa debe generar una contraseña de longitud específica ingresada por el usuario (por ejemplo, entre 8 y 12 caracteres). Estas contraseñas deben incluir una combinación de letras mayúsculas, minúsculas, números y al menos un carácter especial, como '@', '#', '$', '_'.

El programa deberá mostrar la contraseña generada según la elección del usuario. 
 * */
public class GenerarContrasenasNoe {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Bienvenido al generador de contraseñas");
		int opcion = 0;
		do {
			System.out.println("1: Generar contraseña débil");
			System.out.println("2: Generar contraseña fuerte");
			System.out.println("3: Salir");
			System.out.println("Elige una opción indicando el número: ");
			String contrasena;
			boolean esInt = entrada.hasNextInt();
			if (esInt == true) {
				opcion = entrada.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Has elegido generar contraseña débil");
					contrasena = generarPasswdDebil();
					System.out.println("Tu contraseña es:" + contrasena);
					break;
				case 2:
					System.out.println("Has elegido generar contraseña fuerte");
					contrasena = generarPasswdFuerte();
					System.out.println("Tu contraseña es:" + contrasena);
					break;
				case 3:
					System.out.println("Hasta luego");
					break;
				default:
					System.out.println("Opción no válida");
				}
			}
			if (esInt == false) {
				System.out.println("ERROR, solo se admiten números");
				entrada.nextLine();
			}

		} while (opcion != 3);
	}

	public static String generarPasswdDebil() {
		Random numAle = new Random();
		int longitud = 0;
		String contrasena = " ";
		do {
			System.out.println("Introduce la longitud de la contraseña a generar. Min 6");
			longitud = entrada.nextInt();
			if (longitud < 6)
				System.out.println("Necesitas al menos 6 caracteres");
		} while (longitud < 6);
		for (int i = 0; i < longitud; i++) {

			int numAscii = numAle.nextInt(26) + 97;
			contrasena = contrasena + (char) numAscii;
		}
		return contrasena;
	}
	public static String generarPasswdFuerte() {
		//ramdom es un objeto
		Random numAle = new Random();
		int longitud = 0;
		String contrasena = " ";
		do {
			System.out.println("Introduce la longitud de la contraseña a generar. Min 8");
			longitud = entrada.nextInt();
			if (longitud < 8)
				System.out.println("Necesitas al menos 8 caracteres");
		} while (longitud < 8);
		for (int i = 0; i < longitud; i++) {

			int numAscii = numAle.nextInt(90) + 33;

			contrasena = contrasena + (char) numAscii;
		}
		return contrasena;
	}
	//Hecho por Noé Guamán
}
