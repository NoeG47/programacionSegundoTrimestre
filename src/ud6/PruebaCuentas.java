package ud6;

public class PruebaCuentas {

	public static void main(String[] args) {
		Cuentas2 user1;
		user1 = new Cuentas2("1234546345");

		
		if(user1.recibirAbono(1500)== true) {
			System.out.println("La cantidad ha sido abonada");
			}else {
				System.out.println("No se pude ingresar saldo negativo");
			}
		System.out.println(user1.consultarSaldo());
		if(user1.pagarRecibos(1300)== true) {
			System.out.println("El recibo se ha pagado correctamente");
			}else {
				System.out.println("El recibo no se ha pagado "
						+ "correctamente, saldo insuficienbte");
			}
		System.out.println((Cuentas2)user1);
	
	}

}
