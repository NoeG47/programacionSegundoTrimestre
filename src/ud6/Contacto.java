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
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
}
