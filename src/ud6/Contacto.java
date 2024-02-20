package ud6;

public class Contacto {

	//atributos
	private String nombre;
	private String telefono;
	
	//constructor
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	//getter
	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "El contacto " + nombre + " con telefono: " + telefono;
	}
	
}
