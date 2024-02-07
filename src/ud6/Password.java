package ud6;

import java.util.Random;

public class Password {
	private int longitud;
	private String contrasena;

	public Password() {
		this.longitud = 8;
		this.contrasena = generarPassword(this.longitud);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword(this.longitud);
	}

	public String getContrasena() {
		return contrasena;
	}

	public String toString() {
		return "Tu contrasena: +" + contrasena;
	}

	// metodo setter
	public void mostrar() {
		System.out.println("Tu contrasena: " + contrasena);
	}

	public String generarPassword(int longitud) {
		String numeros = "";
		String minusculas = "";
		String mayusculas = "";
		String passwd = "";
		this.longitud = longitud;
		Random random = new Random();

		// Creamos una cadena con los números del 0 al 9
		for (int i = 0; i < 10; i++) {
			numeros = numeros + i;
		}

		// Generamos los dos primeros caracteres como números
		for (int i = 0; i < 3; i++) {
			int numAle = random.nextInt(numeros.length());
			passwd = passwd + numeros.charAt(numAle);
		}

		// Creamos una cadena con las letras minúsculas
		for (int letra = 'a'; letra <= 'z'; letra++) {
			minusculas = minusculas + (char) letra;
		}

		// Generamos los siguientes dos caracteres como letras minúsculas
		for (int i = 0; i < 3; i++) {
			int numAle = random.nextInt(minusculas.length());
			passwd = passwd + minusculas.charAt(numAle);
		}

		// Creamos una cadena con las letras mayúsculas
		for (int i = 'a'; i <= 'z'; i++) {
			mayusculas = mayusculas.toUpperCase();
			mayusculas = mayusculas + (char) i;
		}

		// Generamos los últimos dos caracteres como letras mayúsculas
		for (int i = 0; i < 2; i++) {
			int numAle = random.nextInt(mayusculas.length());
			passwd = passwd + mayusculas.charAt(numAle);
		}

		return passwd;
	}
}
