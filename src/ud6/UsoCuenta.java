package ud6;

public class UsoCuenta {

	public static void main(String[] args) {
		
		//definir el objeto - darle un nombre
		//clase nombre_objeto
		//Cuenta cuenta1; esto cuenta null en la RAM
		//instanciar o construir un objeto - 
		Cuenta user1 = new Cuenta("Carlos", 1000);
		user1.ingreso(0);
		
		if(user1.retirar(1500)== true) {
		System.out.println("La cantidad ha sido retirado");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(user1.dameDatos());
		
		Cuenta user2 = new Cuenta("Alma");
		user2.ingreso(1200);
		user2.retirar(200);
		System.out.println(user2.dameDatos());
	}

}
