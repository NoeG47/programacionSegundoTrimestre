package ud6;

public class usoPersona2 {

	public static void main(String[] args) {
		Personass persona1 = new Personass("123a");
		persona1.addCuenta("c1");

		// objeto auxiliar
		Cuentas c = persona1.dameCuenta("c1");
		Cuentas c2=c;
		c.recibirAbono(100);

		c2.pagarRecibos(200);
		if (persona1.esMoroso()) {
			System.out.println("Es moroso");
		} else { 
			System.out.println("No es moroso");
		}
	}

}
