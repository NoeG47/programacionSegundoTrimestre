package ud6;

public class UsoCoche {

	public static void main(String[] args) {
		// creamos un coche
		// Random random = new Random ()
		// Clase nombre_objeto = new Constructor(parámetros)
		Coche renault = new Coche();
		
		//usamos los métodos definidos en la clase
		renault.arrancar();
		renault.acelerar();
		
		System.out.println("lA MATRICULA ES: " 
				+renault.dameMatricula());
		renault.cambiaMatricula("256b");
		
		System.out.println("LA NUEVA MATRICULA ES: "
				+ renault.dameMatricula());
		
		Coche seat = new Coche("987k", "verde", 3);
		System.out.println("matricula: " + seat.dameMatricula()+
				" ruedas: " + seat.dameRuedas());
	}
}
