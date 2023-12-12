package ud5;

import java.util.Random;

//15. Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
public class ej15_HojaAleatorios {

	public static void main(String[] args) {
		Random ale = new Random();
		int tirada  = 0;
		int figura1 = 0, figura2 = 0, figura3 = 0;
		for (int i = 0; i < 3; i++) {
			tirada = ale.nextInt(5)+1;
			 // Almacenar las figuras obtenidas en cada tirada
            if (i == 0) {
                figura1 = tirada;
            } else if (i == 1) {
                figura2 = tirada;
            } else {
                figura3 = tirada;
            }
			
			
			// Mostrar la figura obtenida en la tirada actual
            if (tirada == 1) {
                System.out.println("corazón");
            } else if (tirada == 2) {
                System.out.println("diamante");
            } else if (tirada == 3) {
                System.out.println("herradura");
            } else if (tirada == 4) {
                System.out.println("campana");
            } else if (tirada == 5) {
                System.out.println("limón");
            }
            
            
		}
		// Comprobar las combinaciones de figuras
        if (figura1 != figura2 && figura2 != figura3 && figura1 != figura3) {
            System.out.println("Lo siento, has perdido");
        } else if (figura1 == figura2 && figura2 == figura3) {
            System.out.println("Enhorabuena, has ganado 10 monedas");
        } else {
            System.out.println("Bien, has recuperado su moneda");
        }
		
		
		
			
			
		
		
	}
	

}
