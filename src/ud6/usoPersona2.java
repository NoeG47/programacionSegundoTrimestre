package ud6;

public class usoPersona2 {

	public static void main(String[] args) {
		Persona2 persona1=new Persona2("123a");
		persona1.addCuenta("c1");

		Cuentas2 c=persona1.dameCuenta("c1");
		Cuentas2 c2=c;
		c.recibirAbono(100);
		
		c2.pagarRecibos(200);
		
		if (persona1.esMoroso()) {
			System.out.println("Es morosa");
		}else {
			System.out.println("No es morosa");
		}
	}

}
