package ud6;

public class ConjuntoLibros {
	// declarar tamano array
	private final int capacidad = 10;
	private Libro[] libros;
	private int contador;

	public ConjuntoLibros() {
		this.libros = new Libro[capacidad];
		this.contador = 0;
	}

	public boolean agregarLibro(Libro libro) {
		if (contador >= capacidad) {
			System.out.println("No hay suficiente espacio para añadir más libros.");
			return false;
		}
		libros[contador++] = libro;
		System.out.println("Libro '" + libro.toString() + "' añadido al conjunto.");
		return true;
	}
}
