package CorrecionExamenUD6;

public class Libro {
	//atributos
	private String autor;
	private String nombre;
	private int numPaginas;
	private int calificacion;
	
	//metodos constructor 1
	public Libro(String autor, String nombre, int numPaginas) {
		this.autor = autor;
		this.nombre = nombre;
		this.numPaginas = numPaginas;
		calificacion = 0;
	}
	//metodos constructor 2
	public Libro(String autor, String nombre, int numPaginas, int calificacion) {
		this.autor = autor;
		this.nombre = nombre;
		this.numPaginas = numPaginas;
		if (calificacion >= 0 && calificacion <= 10) {
			this.calificacion = calificacion;
		}
		else {
			this.calificacion = 0;
		}
	}
	//metodos setter y getter
	public String getAutor() {
		return autor;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public void setCalificacion(int calificacion) {
		if (calificacion >= 0 && calificacion <= 10) {
			this.calificacion = calificacion;
		}
		else {
			this.calificacion = 0;
		}
	}
	//metodo to String - 1 error no examen
	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", nombre=" + nombre + ", numPaginas=" + numPaginas + ", calificacion="
				+ calificacion + "]";
	}
	
}
