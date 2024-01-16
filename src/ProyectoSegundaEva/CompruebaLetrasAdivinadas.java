package ProyectoSegundaEva;

import java.util.Scanner;

public class CompruebaLetrasAdivinadas {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce una palabra de 5 letras");
        String palabraIntroducida = in.nextLine().toLowerCase();
        String palabraSecreta = "cejas";

        String resultado = compruebaLetrasAcertadas(palabraIntroducida, palabraSecreta);
        System.out.println(resultado);
    }

    public static String compruebaLetrasAcertadas(String palabraIntroducida, String palabraSecreta) {
        char[] resultado = new char[palabraIntroducida.length()];

        for (int i = 0; i < palabraIntroducida.length(); i++) {
            char letraIntroducida = palabraIntroducida.charAt(i);
            char letraSecreta = palabraSecreta.charAt(i);

            if (letraIntroducida == letraSecreta) {
                resultado[i] = Character.toUpperCase(letraIntroducida);
            } else if (palabraSecreta.contains(String.valueOf(letraIntroducida)) &&
                       !contieneLetraDuplicada(palabraIntroducida, letraIntroducida, i)) {
                resultado[i] = letraIntroducida;
            } else {
                resultado[i] = '*';
            }
        }

        return new String(resultado);
    }

    public static boolean contieneLetraDuplicada(String palabra, char letra, int posicionActual) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (i != posicionActual && palabra.charAt(i) == letra) {
                contador++;
            }
        }
        return contador > 0;
    }
}
