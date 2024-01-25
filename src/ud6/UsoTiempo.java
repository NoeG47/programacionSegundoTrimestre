package ud6;

import java.util.Scanner;

public class UsoTiempo {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Tiempo tiempo1 = new Tiempo(12,51);
		Tiempo tiempo2 = new Tiempo(12,59,59);
		tiempo2.aumenta1sg();
		System.out.println(tiempo2.dameHora());
		
	}

}
