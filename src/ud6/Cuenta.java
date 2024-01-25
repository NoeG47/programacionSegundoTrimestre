package ud6;

public class Cuenta {

	// definimos los atributos Y los encapsulamos (lo ocultamos)
	private double cantidadInicial;
	private String titular;

	//creamos los constructores

	public Cuenta(String nombreTitular, int cantidadCuenta) {
		cambiaDatos(nombreTitular, cantidadCuenta);
	}
	public Cuenta(String nombreTitular) {
		cambiaDatos(nombreTitular, 0);
	}
/*	public Cuenta(int cantidadCuenta) {
		cambiaCantidad(cantidadCuenta);
	}
	public Cuenta(String nombreTitular) {
		cambiaTitular(nombreTitular);
	}
	*/
	//método setter
	/*public void cambiaTitular(String nombreTitular) {
		titular = nombreTitular;
		
	}
	public void cambiaCantidad(int cantidad) {
		cantidadInicial = cantidad;
	}*/
	//metodos setter
	public void cambiaDatos(String nombreTitular, int cantidad) {
		titular = nombreTitular;
		cantidadInicial = cantidad;
	}
	public void ingreso (double cantidadIngreso) {
		if (cantidadIngreso >= 0 ) {
			cantidadInicial += cantidadIngreso;
		}
	} 
	public void retirar (double cantidadRetiro) {
		if (cantidadInicial- cantidadRetiro < 0 ) {
			cantidadInicial = 0;
		}
		else
		{
			cantidadInicial -= cantidadRetiro;
		}
	} 
	//metodo getter
	public String dameDatos() {
		return "el nombre del titular es " + titular + " y su saldo disponible es: " + cantidadInicial;
	}
}
