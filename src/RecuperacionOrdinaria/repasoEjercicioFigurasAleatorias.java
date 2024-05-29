package RecuperacionOrdinaria;

import java.util.Random;

public class repasoEjercicioFigurasAleatorias {
	static Random ale = new Random();
	public static void main(String[] args) {
		String[] figuras = new String [3];
		for (int i = 0; i < 3; i++) {
			figuras[i] = obtenerFigura();
		}
		
		// enseñar el array
		for (String figurass : figuras) {
			System.out.print(figurass +  ",");
		}
		imprimirResultadoFigurasObtenidas(figuras);
	}
	public static String obtenerFigura() {
		String figura = "";
		int numGenerado = ale.nextInt(5);
		String[] listaFiguras = {"corazon", "diamante", "herradura", "campana", "limon"}; 
		figura = listaFiguras[numGenerado];
		return figura;
	}
	public static void imprimirResultadoFigurasObtenidas(String[] figuras) {
		if (figuras[0].equals(figuras[1]) && figuras[1].equals(figuras[2])) {
			System.out.println("Has ganado 10 monedas");
		}
		else if (figuras[0].equals(figuras[1]) || figuras[1].equals(figuras[2]) || figuras[0].equals(figuras[2])) {
			System.out.println("\n");
			System.out.println("Has recuperado tu moneda");
		}
		else {
			System.out.println("Has perdido tu moneda");
		}
	}

}
