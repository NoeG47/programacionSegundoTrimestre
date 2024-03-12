package CorrecionExamenUD6;

public class ConjuntoLibros {

	// atributos
	private final int TAM = 10;
	private Libro[] conjuntoLibros;
	private int numLibrosAgregados;
	private int pos;

	// constructor
	public ConjuntoLibros() {
		this.conjuntoLibros = new Libro[TAM];
		this.pos = 0;
		this.numLibrosAgregados = 0;
	}

	// primer metodo pedido en el examen
	public void aniadirLibro(Libro libro) {
		if ((pos < TAM) && (!existeLibro(libro))) {
			conjuntoLibros[pos] = libro;
			numLibrosAgregados++;
			pos++;
			System.out.println("Libro añadido correctamente");
		} else {
			System.out.println("Libro no añadido");
		}
	}

	// metodo extra bien hecho en el examen
	private boolean existeLibro(Libro libro) {
		String nombreAutor = libro.getAutor();
		String nombreLibro = libro.getNombre();
		for (int i = 0; i < pos; i++) {
			if ((conjuntoLibros[i].getNombre().equals(nombreLibro))
					&& (conjuntoLibros[i].getAutor().equals(nombreAutor))) {
				return true;
			}
		}
		return false;
	}

	// segundo metodo otro error 
	public Libro buscarUltimoLibroAutor(String nombre) {

		for (int i = (numLibrosAgregados - 1); i >= 0; i--) {
			String nombreAutor = conjuntoLibros[i].getNombre();
			if (nombreAutor.equals(nombre)) {
				return conjuntoLibros[i];
			}
		}
		return null;
		
	}

	// tercer metodo, otro error, si ponemos TAM 
	//recorre todo mostrando nulos, eso puede generar
	//errores inesperados
	//para ello se usa numLibrosAgregados, depurar para entender mejor
	//solo recorre las posiciones que hay libros
	public String toString() {
		String cad = "";
		for (int i = 0; i < numLibrosAgregados; i++) {
			cad += conjuntoLibros[i] + "\n";
		}
		return cad;
	}
	//otro error, no hacer el toString
	public void mostrarLibros() {
		for (int i = 0; i < numLibrosAgregados; i++) {
			System.out.println(conjuntoLibros[i].toString());
		}
	}
}
