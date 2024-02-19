package ud6;

import java.util.Scanner;

public class UsoLibros {
/*Crear una clase PruebaLibros, que realice varias pruebas con las clases
creadas. En concreto, prueb e a: crear dos libros, a n˜adirlos al conjunto,
eliminarlos p or los dos criterios hasta que el conjunto est´e va c´ıo, volver a
a n˜adir un libro y mostrar el contenido final*/
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		ConjuntoLibros libros = new ConjuntoLibros();

		int op = 0;
		do {
			menu();
			op = in.nextInt();
			in.nextLine();
			switch(op) {
			case 1:
				System.out.println("Introduce el título del libro: ");
                String titulo = in.nextLine();
                System.out.println("Introduce el nombre del autor del libro: ");
                String autor = in.nextLine();
                Libro nuevoLibro = new Libro(titulo, autor);
                System.out.println("Introduce el número de páginas");
                int numPaginas = in.nextInt();
                nuevoLibro.setNumPaginas(numPaginas);
                boolean calificacionEsValida = true;
                do {
                System.out.println("Introduce del 1 al 10 la calificación del libro");
                int calificacion = in.nextInt();
                if(nuevoLibro.setCalificacion(calificacion)) {
                	if(libros.anadirlibros(nuevoLibro)) {
    					System.out.println("Se ha agregado correctamente.");
    					calificacionEsValida = true;
    				}else {
    					System.out.println("ERROR: el conjunto ya está lleno.");
    					calificacionEsValida = true;
    				}
                }
                else {
                	
                	System.out.println("Calificacion no válida");
                	calificacionEsValida = false;
                }
                } while (!calificacionEsValida);
				break;
				
			case 2:
				System.out.println("Introduce el nombre o título del libro: ");
				String nombre = in.nextLine();
				if(libros.eliminarlibroTitulo(nombre)) {
					System.out.println("Se ha podido eliminar correctamente por el nombre del autor.");
				}else if(libros.eliminarlibroAutor(nombre)){
					System.out.println("Se ha podido eliminar correctamente por el nombre del titulo.");
				}else {
					System.out.println("ERROR: no se ha podido eliminar.");
				}
				break;
				
			case 3:
				libros.mostrarMayorCalificacion();
				libros.mostrarMenorCalificacion();
				break;
				
			case 4: 
				System.out.println(libros.toString());
				break;
			case 5:
				System.out.println("hasta luego");
				break;
			}

		}while(op != 5);
		
		
	}public static void menu() {
		System.out.println("1. Introducir un libro en el conjunto de libros: ");
		System.out.println("2. Eliminar un libro por titulo o autor: ");
		System.out.println("3. Mostrar el mejor y el peor libro según su calificación");
		System.out.println("4. Mostrar libreria: ");
		System.out.println("5. Salir del programa.");
		System.out.println("Introduce la opción");
	}
}
