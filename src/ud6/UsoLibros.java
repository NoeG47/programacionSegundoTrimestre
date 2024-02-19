package ud6;

public class UsoLibros {

	public static void main(String[] args) {
		ConjuntoLibros libros=new ConjuntoLibros();
		
		for (int i=0;i<12;i++) {
			Libro libro=new Libro("Quijote"+i,"Cervantes"+i);
			if (libros.anadirlibros(libro))
				System.out.println("Libro añadido");
			else
				System.out.println("Biblioteca llena");
		}

		
		
		System.out.println(libros.toString());
		libros.mostrarMayorCalificacion();
		
	}

}
