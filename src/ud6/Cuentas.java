package ud6;

public class Cuentas {
	// definimos los atributos
	private double saldo;
	private String isbn;

	// creamos el constructor
	public Cuentas(String isbn) {
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

	// setter
	public boolean recibirAbono(double saldoIngreso) {
		if (saldoIngreso > 0) {
			saldo = saldo + saldoIngreso;
			return true;
		}
		else {
			return false;
		}
	}

	public boolean pagarRecibos(double saldoAPagar) {
		saldo = saldo - saldoAPagar;
		if (saldo >= 0) {
			//si el saldo es positivo o 0
			return true; 
		} else {
			//si el saldo es negativo
			return false; 
		}
	}

	// metodo publico
	public String toString() {
		return "numero cuenta:" + isbn + " saldo:" + saldo;
	}

}
