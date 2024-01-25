package ud6;

public class UsoCuenta {

	public static void main(String[] args) {
		Cuenta user1 = new Cuenta("Carlos", 152);
		user1.ingreso(410);
		user1.retirar(300);
		System.out.println(user1.dameDatos());
		
		Cuenta user2 = new Cuenta("Alma");
		user2.ingreso(1200);
		user2.retirar(200);
		System.out.println(user2.dameDatos());
	}

}
