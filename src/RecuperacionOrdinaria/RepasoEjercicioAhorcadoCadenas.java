package RecuperacionOrdinaria;

import java.util.Random;
import java.util.Scanner;

public class RepasoEjercicioAhorcadoCadenas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] palabras = { "java", "programacion", "ahorcado", "tecnologia", "desarrollo" };
        Random random = new Random();
        int indiceAleatorio = random.nextInt(palabras.length);
        String palabraElegida = palabras[indiceAleatorio];
        // comentar la línea siguiente para ocultar la palabra
        System.out.println(palabraElegida);

        // esconder la palabraElegida a _
        char[] adivinanza = new char[palabraElegida.length()];
        for (int i = 0; i < palabraElegida.length(); i++) {
            adivinanza[i] = '_';
        }
        int intentos = 5;
        boolean adivinada = false;

        while (intentos > 0 && !adivinada) {
            // Convertir el array de guiones bajos a una cadena usando String.valueOf
            String adivinanzaStr = String.valueOf(adivinanza);
            System.out.println(adivinanzaStr);
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Introduce una letra: ");

            char letra = in.nextLine().charAt(0);
            // Comprobar si la letra está en la palabra
            boolean acierto = false;
            for (int i = 0; i < palabraElegida.length(); i++) {
                if (palabraElegida.charAt(i) == letra) {
                    adivinanza[i] = letra;
                    acierto = true;
                }
            }
            if (!acierto) {
                intentos--;
            }
            adivinada = true;
            for (int i = 0; i < adivinanza.length; i++) {
                if (adivinanza[i] == '_') {
                    adivinada = false;
                    i = adivinanza.length;
                }
            }
        }

        if (adivinada) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraElegida);
        } else {
            System.out.println("Lo siento, has perdido. La palabra era: " + palabraElegida);
        }

        in.close();
    }
}
