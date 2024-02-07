package ud6;

public class Cuentas2 {
	// definimos los atributos
	private double saldo;
	private String isbn;

	// creamos el constructor
	public Cuentas2(String isbn) {
		this.isbn = isbn;
		this.saldo = 0.0;
	}

	// getter
	public String consultarCuenta() {
		return isbn;
	}

	// getter
	public double consultarSaldo() {
		return saldo;
	}
	// metodo getter
		public String toString() {
			return "numero cuenta:" + isbn + " saldo:" + saldo;
		}

	// setter
	public boolean recibirAbono(double saldoIngreso) {
		if (saldoIngreso > 0) {
			saldo = saldo + saldoIngreso;
			return true;
		}
		else {
			return false; // no permitimos abonos negativos
		}
	}

	public boolean pagarRecibos(double saldoAPagar) {
		// nos aseguramos que el recibo es positivo
		if (saldoAPagar > 0) {
			saldo = saldo - saldoAPagar;
			return true; 
		} else {
			return false; 
		}
	}

	

}
