package ud5;

import java.util.Random;

public class PasswdFuerte {

	public static void main(String[] args) {

		String minusculas = "";
		String mayusculas = "";
		String passwd = "";
		Random random = new Random();
		// creamos una cadena con las letras minúsculas
		for (int letra = 'a'; letra <= 'z'; letra++) {
			minusculas = minusculas + (char) letra;
		}
		for (int i = 0; i < 6; i++) {

			int numAle = random.nextInt(minusculas.length());
			passwd =  passwd+minusculas.charAt(numAle);
		}
		System.out.println(passwd);
		
		// creamos una cadena con las letras mayusculas
		for (int letra = 'a'; letra <= 'z'; letra++) {
			mayusculas = mayusculas.toUpperCase();
			mayusculas = mayusculas + (char)letra;
			
		}
		System.out.println(mayusculas);
		// 
		String especiales = "@#%_$&";
		System.out.println(especiales);
		//
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}

}
