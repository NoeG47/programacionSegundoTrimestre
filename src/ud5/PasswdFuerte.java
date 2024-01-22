package ud5;

import java.util.Random;

public class PasswdFuerte {

    public static void main(String[] args) {
        String numeros = "";
        String minusculas = "";
        String mayusculas = "";
        String especiales = "@#%_$&";
        String passwd = "";
        Random random = new Random();

        // Creamos una cadena con los números del 0 al 9
        for (int i = 0; i < 10; i++) {
            numeros = numeros + i;
        }

        // Generamos los dos primeros caracteres como números
        for (int i = 0; i < 2; i++) {
            int numAle = random.nextInt(numeros.length());
            passwd = passwd + numeros.charAt(numAle);
        }

        // Creamos una cadena con las letras minúsculas
        for (int letra = 'a'; letra <= 'z'; letra++) {
            minusculas = minusculas + (char) letra;
        }

        // Generamos los siguientes dos caracteres como letras minúsculas
        for (int i = 0; i < 2; i++) {
            int numAle = random.nextInt(minusculas.length());
            passwd = passwd + minusculas.charAt(numAle);
        }

        // Creamos una cadena con las letras mayúsculas
        for (int i = 'a'; i <= 'z'; i++) {
            mayusculas = mayusculas.toUpperCase();
            mayusculas = mayusculas + (char) i;
        }

        // Generamos los últimos dos caracteres como letras mayúsculas
        for (int i = 0; i < 2; i++) {
            int numAle = random.nextInt(mayusculas.length());
            passwd = passwd + mayusculas.charAt(numAle);
        }

        // Agregamos un carácter especial al final
        int numAle = random.nextInt(especiales.length());
        passwd = passwd + especiales.charAt(numAle);

        System.out.println(passwd);
    }
}

