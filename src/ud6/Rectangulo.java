package ud6;

public class Rectangulo {
	// definimos los atributos Y los encapsulamos (lo ocultamos)
	private double base;
	private double altura;


	// definimos el método constructor
		public Rectangulo(double bas, double altur) {
			base = bas;
			altura = altur;
		}
	// Definimos los métodos getter
	public double calcularAreaR() {
		return base * altura;
 	

	}

	public double calcularPerimetroR() {
		return 2 * base + 2 * altura;
	}

}
