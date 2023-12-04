package ud5;

import java.util.Scanner;

public class ej3_HojaCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String cad = entrada.nextLine();
		System.out.println("Introduce una letra para buscar");
		char letraBuscada = entrada.nextLine().charAt(0);
		int cont = 0;
		for (int i=0; i < cad.length(); i++) {
			if (letraBuscada == cad.charAt(i)) {
				cont++;
			}
		}
		System.out.println("la letra " + letraBuscada + " se encuentra " + cont + " veces");
	}

}
