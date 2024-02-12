package SanValentin;

import java.util.Scanner;

public class GestorSanValentin2 {
	//atributos globales
	static Scanner in = new Scanner(System.in);
	static Pareja [] parejas = new Pareja [10];

	public static void main(String[] args) {
		menu();

	}
	public static void menu() {
		int opcion;

		do {
			System.out.println("Bienvenido al gestor de san valentin");
			System.out.println("1. Agregar pareja y sus regalos. \n"
					+ "2. Mostrar detalles de las parejas y sus regalos \n" + "3. Salir del programa");
			System.out.println("Elige una opcion segun su numero: ");
			opcion = in.nextInt();
			switch (opcion) {
			case 1:
				agregarPareja();
				break;
			case 2:
				// va algo
				break;
			case 3:
				System.out.println("Has salido, hasta luego");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		} while (opcion != 3);
	}
	public static void agregarPareja() {
		//datos para la primera persona
		Persona persona1;
		System.out.println("Introduce el primer nombre: ");
		String nombre = in.nextLine();
		System.out.println("Introduce su dni: ");
		String dni = in.nextLine();
		persona1 = new Persona(nombre, dni);
		
		//datos para la segunda persona
		Persona persona2;
		System.out.println("Introduce el segundo nombre: ");
		String nombre2 = in.nextLine();
		System.out.println("Introduce su dni: ");
		String dni2 = in.nextLine();
		persona2 = new Persona(nombre2, dni2);
		
		//añadimos la pareja
		Pareja pareja1 = new Pareja(persona1, persona2);
		
		//pedimos los regalos
		Regalo regalo1 = new Regalo("bombon", 12.4, "un chocolate");
		Regalo regalo2 = new Regalo("estuche", 6.4, "un objeto");
		pareja1.setRegaloParaPersona1(regalo1);
		pareja1.setRegaloParaPersona2(regalo2);
	}
}
