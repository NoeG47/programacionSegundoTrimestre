package ud6;

public class Persona {
//creamos sus atributos encapsulados
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	// Constantes para devolver los valores
	static final int DEBAJO_PESO = -1;
	static final int PESO_IDEAL = 0;
	static final int SOBREPESO = 1;

//constructores
	public Persona() {
		nombre = " ";
		edad = 0;
		sexo = 'H';
		peso = 0.0;
		altura = 0.0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		peso = 0.0;
		altura = 0.0;
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		this.dni = generaDNI();

	}

	// Métodos públicos
	public int calcularIMC() {
		double imc = peso / (altura * altura);
		if (imc < 20) {
			return DEBAJO_PESO;
		} else if (imc >= 20 && imc <= 25) {
			return PESO_IDEAL;
		} else {
			return SOBREPESO;
		}
	}

	public boolean esMayorDeEdad() {
		return edad > 18;
	}

	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + dni + "\nSexo: " + sexo + "\nPeso: " + peso
				+ "\nAltura: " + altura;
	}

	// Métodos privados
	private char comprobarSexo(char sexo) {
		if (sexo == 'H' || sexo == 'M') {
			return sexo;
		} else {
			return 'H';
		}
	}

	private String generaDNI() {
		// Genera un número aleatorio de 8 cifras
		long numero = (long) (Math.random() * 90000000) + 10000000;

		// Calcula la letra correspondiente al DNI
		char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt((int)(numero % 23));

		// Devuelve el DNI completo
		return Long.toString(numero) + letra;
	}

	// definir los métodos setter para todos los atributos
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
