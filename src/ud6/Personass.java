package ud6;

public class Personass {
	//definimos los atributos y los encapsulamos
	private String dni;
	private Cuentas [] cuentas;
	private int numCuentasAsociadas;

	//constructor
	public Personass(String dni) {
		this.dni = dni;
		numCuentasAsociadas = 0;
		cuentas = new Cuentas [3];
	}
	//setter
	public boolean addCuenta(String isbn) {
		// si ya tenemos 3 cuentas asociadas a la persona
		if(numCuentasAsociadas >= 3) {
			return false;
		}
		//añadimos una nuve acuneta asociada a la persona
		Cuentas c = new Cuentas(isbn);
		cuentas[numCuentasAsociadas] = c;
		numCuentasAsociadas++;
		return true;
	}
	public Cuentas dameCuenta(String isbn) {
		for (int i = 0; i < numCuentasAsociadas; i++) {
			Cuentas c = cuentas[i];
			if (isbn.equals(c.consultarCuenta())) {
				return c;
			}
		}
		// no ha encontrado la cuenta
				return null;		
	}
	
	//getter
	public String toString() {
		String cadena = "dni : " + dni;
		for (int i = 0; i < numCuentasAsociadas; i++) {
			cadena += cuentas[i].toString();
		}
		return cadena;
	}
}
