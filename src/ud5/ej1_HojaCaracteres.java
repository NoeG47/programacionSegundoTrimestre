package ud5;

import java.util.Scanner;

public class ej1_HojaCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String cad = entrada.nextLine();
		for (int i=0;i < cad.length(); i++) {
			System.out.println(cad.charAt(i));
		}
	}

}
