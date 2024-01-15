package ProyectoSegundaEva;

import java.util.Scanner;

public class CompruebaLetrasAdivinadas {
	static int numLetrasAdivinadas = 0;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una palabra de 5 letras");
		String palabra;
		palabra = in.nextLine();
		palabra = palabra.toLowerCase();
		String palabraOculta = "raton";

		String resultado = compruebaLetrasAcertadas(palabra, palabraOculta);
		System.out.println(resultado);
		System.out.println("Has acertado en su posición correcta: " + numLetrasAdivinadas + " letras");
	}
	public static String compruebaLetrasAcertadas(String palabraIntroducida, String palabraOculta) {
		char [] cadVacia = new char [palabraIntroducida.length()] ;
		for (int i = 0; i < palabraIntroducida.length(); i++) {
			if (palabraIntroducida.charAt(i) == palabraOculta.charAt(i)) {
				 cadVacia[i] = Character.toUpperCase(palabraIntroducida.charAt(i));
				 numLetrasAdivinadas++;
			 }
			else {
				 // Si la letra coincide pero no está en la posición correcta
	            if (palabraOculta.indexOf(palabraIntroducida.charAt(i)) != -1) {
	                cadVacia[i] = palabraIntroducida.charAt(i);
	            } else {
	                cadVacia[i] = '*';
				
	            }
	        }
			
			
		 }
		
		String resultado = new String(cadVacia);
		return resultado;
		}

}
