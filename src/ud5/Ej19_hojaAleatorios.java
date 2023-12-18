package ud5;

import java.util.Random;
import java.util.Scanner;

public class Ej19_hojaAleatorios {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Random ale = new Random();
        int numAle = 0;
        
        System.out.print("Introduce el número de cadenas a generar: ");
        int numCadena = in.nextInt();

        for (int j = 0; j < numCadena; j++) {
            System.out.print("Cadena " + (j + 1) + ": ");
            for (int i = 0; i < 5; i++) {
                numAle = ale.nextInt(26) + 97;
                char sigLetra = (char) (numAle);
                System.out.print(sigLetra);
            }
            System.out.println(); 
        }
    }
}