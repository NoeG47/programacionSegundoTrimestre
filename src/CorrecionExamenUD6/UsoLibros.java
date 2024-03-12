package CorrecionExamenUD6;

import java.util.Scanner;

public class UsoLibros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el nombre del libro");
		String nombreL1 = in.nextLine();
		System.out.println("Introduce el nombre del segundo libro");
		String nombreL2 = in.nextLine();
		System.out.println("Introduce el nombre del autor del primer libro");
		String nombreA1 = in.nextLine();
		System.out.println("Introduce el nombre del autor del segundo libro");
		String nombreA2 = in.nextLine();
		Libro libro1 = new Libro(nombreL1, nombreA1, 255);
		Libro libro2 = new Libro(nombreL2, nombreA2, 321, 5);
		
		//otro error no inicializar el array
		ConjuntoLibros conjuntoLibros = new ConjuntoLibros();
		conjuntoLibros.aniadirLibro(libro1);
		conjuntoLibros.aniadirLibro(libro2);
		
		//otro error meter en libro otro libro
		Libro libroBuscado = conjuntoLibros.buscarUltimoLibroAutor("luis");
		if (libroBuscado != null) {
			System.out.println(libroBuscado.toString());
		} 
		else {
			System.out.println("Libro no encontrado");
		}
		
		
		conjuntoLibros.mostrarLibros();
	}

}
