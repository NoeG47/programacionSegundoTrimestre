package ud6;

public class CuentaSimple {
	//atributos
	private String titular;
	private double cantidad;
	//constructor
	public CuentaSimple(String titular,double cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
	}
	//getter
	public String toString() {
		return "titular:"+titular+" cantidad:"+cantidad;
	}
	//setter
	public void ingresar(double ingreso) {
		if (ingreso>0)
			cantidad=cantidad+ingreso;
	}
	public boolean retirar(double retiro) {
		if (retiro<=cantidad) {
			cantidad=cantidad-retiro;
			return true; //el dinero se ha retirado
		}
		else {
			return false; //no se retira ningún valor
		}
	}
	
}
