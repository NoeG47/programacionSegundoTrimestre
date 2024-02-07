package ud6;

public class UsoRaices {

	public static void main(String[] args) {
		Raices raiz = new Raices(1, -5, 6);
		if (raiz.tieneRaiz()){

			System.out.println("El discriminante es: " + raiz.getDiscriminante());
			raiz.obtenerRaiz();
		}else if (raiz.tieneRaices()) {
	
			System.out.println("El discriminante es: " + raiz.getDiscriminante());
			raiz.obtenerRaices();
		} else {
			System.out.println("No tiene");
		}
	
	}

}
