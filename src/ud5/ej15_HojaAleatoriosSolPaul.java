package ud5;

import java.util.Random;

public class ej15_HojaAleatoriosSolPaul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ale = new Random();
		int tirada = 0;
		int figura[] = new int[3];
		// se puede hacer asi, así se inicializa:
		String[] figuras = { "corazon", "diamante", "herradura", "campana", "limon" };

		for (int i = 0; i < 3; i++) {
			int numAle = ale.nextInt(5);
			figura[i] = numAle;

		}
		if (figura[0] == figura[1] && figura[1] == figura[2]) {
			System.out.println("Enhorabuena, ha ganado 10 monedas");
		}

		else if (figura[0] != figura[1] && figura[1] != figura[2] && figura[0] != figura[2]) {
			System.out.println("Lo siento, has perdido");
		} else {
			System.out.println("Bien, ha recuperado su moneda");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(figuras[figura[i]]);
		}
	}

}
