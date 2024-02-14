package ud6;

public class Libro {

	// atributos
	private String titulo, autor;
	private int numPaginas, calificacion;

	// constructor
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		numPaginas = 0;
		calificacion = 0;
	}

	// metodos getters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public int getCalificacion() {
		return calificacion;
	}

	// metodos setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public boolean setCalificacion(int calificacion) {
		if (calificacion >= 0 && calificacion <= 10) {
			this.calificacion = calificacion;
			return true;
		}
		return false;
	}

	// to string
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + ", calificacion="
				+ calificacion + "]";
	}

}
