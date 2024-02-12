package SanValentin;

public class Persona {
	//atributos
	private String dni;
	private String nombre;
	//metodo constructor
	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;		
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return "dni=" + dni + ", nombre=" + nombre;
	}
		
}
