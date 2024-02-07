package ud6;

public class Persona2 {
	//definimos los atributos y los encapsulamos
	private String dni;
	private Cuentas2 [] cuentas;
	private int numCuentasAsociadas;

	//constructor
	public Persona2(String dni) {
		this.dni = dni;
		numCuentasAsociadas = 0;
		cuentas = new Cuentas2 [3];
	}
	//setter
	public boolean addCuenta(String isbn) {
		// si ya tenemos 3 cuentas asociadas a la persona
		if(numCuentasAsociadas >= 3) {
			return false;
		}
		//añadimos una nueva cuenta asociada a la persona
		Cuentas2 c = new Cuentas2(isbn);
		cuentas[numCuentasAsociadas] = c;
		numCuentasAsociadas++;
		return true;
	}
	public Cuentas2 dameCuenta(String isbn) {
		for (int i = 0; i < numCuentasAsociadas; i++) {
			Cuentas2 c = cuentas[i];
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
	public boolean esMoroso() {
		/*for (int i = 0; i < numCuentasAsociadas; i++) {
			if (cuentas[i].consultarSaldo() < 0) {
				return true;
			}
		}
		return false;*/
		for (Cuentas2 c:cuentas) {
			if (c.consultarSaldo() < 0) {
				return true;
			}
		}
		return false;
	}
}
