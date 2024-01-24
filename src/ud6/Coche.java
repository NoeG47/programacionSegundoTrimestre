package ud6;

public class Coche {

	// definimos los atributos Y los encapsulamos (lo ocultamos)
	private String matricula;
	private int ruedas;
	private String color;
	private int puertas;

	// definimos el método constructor
	// Sirve para:
	// 1. Reservar memoria RAM
	// 2. Cuando se crea un objeto llevarlo a un estado
	// inicial conocido.(INICIALIZAR TODOS LOS ATRIBUTOS)

	public Coche() {
		matricula = "1234a";
		ruedas = 4;
		color = "rojo";
		puertas = 5;
	}
	
	//sobrecarga de constructor
	public Coche(String matriculaInicial, String nuevoColor, int numPuertas) {
		matricula = matriculaInicial;
		color = nuevoColor;
		puertas = numPuertas;
		ruedas = 4;
	}
	// definir el método getter: lectura
	public String dameMatricula() {
		return matricula;
	}

	public int dameRuedas() {
		return ruedas;
	}

	public String dameColor() {
		return color;
	}

	public int damePuertas() {
		return puertas;
	}

	// definimos el método setter: escritura
	public void cambiaMatricula(String nuevaMatricula) {
		// cambiamos el atributo al valor que pasamos por parámetro
		matricula = nuevaMatricula;
	}

	public void cambiaColor(String nuevoColor) {
		color = nuevoColor;
	}

	// Definimos los métodos
	public void arrancar() {
		System.out.println("Cochce arrancado");
	}

	public void acelerar() {
		System.out.println("Cochce está acelerando");
	}

}
