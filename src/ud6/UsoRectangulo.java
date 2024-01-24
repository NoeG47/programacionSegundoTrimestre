package ud6;

public class UsoRectangulo {

	public static void main(String[] args) {
		// creamos un rectangulo
		Rectangulo r1 = new Rectangulo(2,4);

		// usamos los métodos definidos en la clase

		System.out.println("el area de tu rectangulo es: " + r1.calcularAreaR());
		System.out.println("el perimetro de tu rectangulo es: " + r1.calcularPerimetroR());
		
		// creamos un rectangulo
		Rectangulo r2 = new Rectangulo(3, 4.1);

		
		System.out.println("area de tu rectangulo es: " + r2.calcularAreaR());
		System.out.println("perimetro de tu rectangulo es : " + r2.calcularPerimetroR());

	}

}
