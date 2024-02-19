package ud6;

public class UsoFraccionJavaDoc {

	public static void main(String[] args) {
		FraccionJavadoc fraccion = new FraccionJavadoc(2, 3);
		FraccionJavadoc fraccion2 = new FraccionJavadoc(9, 12);
		//fraccion.mostrar(); // Imprime: 6/8
		//fraccion.simplificar();
		//fraccion.mostrar(); // Imprime: 3/4
		if (fraccion.esIgualA(fraccion2)) {
			System.out.println("es equivalente");
		}
		else {
			System.out.println("no son equivalentes");
		}
		
	}

}
