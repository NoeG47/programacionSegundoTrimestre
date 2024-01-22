package ProyectoSegundaEva;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce algo");
        String cad = in.nextLine();
   
        char[] caracteres = new char[cad.length()];

        // rellenar el array
        for (int i = 0; i < cad.length(); i++) {
            caracteres[i] = cad.charAt(i);
        }

        for (int i = 0; i < cad.length(); i++) {
            char letra = caracteres[i];
            if (letra == Character.toUpperCase(letra)) {
                caracteres[i] = Character.toLowerCase(letra);
            } else {
                caracteres[i] = Character.toUpperCase(letra);
            }
            System.out.print(caracteres[i]);
        }
    }
}
