package ud5;

import java.util.Random;

/*
 * 12. Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando
los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor
 * 
 * */
public class Ej12_HojaAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random ale = new Random();
		 int tirada1 = 0;
		 int tirada2 = 0;
		 int i = 1;
		 do {
			// numero aleatorio
			tirada1 = ale.nextInt(6)+1;
			tirada2 = ale.nextInt(6)+1;
			System.out.println("Num de intentos tirados: " + i++);
			System.out.println("num de dado1: " + tirada1 + " " + "num de dado2: " + tirada2);
			if (tirada1 == tirada2) {
				System.out.println("el numero de los dados coinciden, fin del programa");
			}
		} while (tirada1 != tirada2);
		 
	}

}
