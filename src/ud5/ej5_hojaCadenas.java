package ud5;

import java.util.Scanner;

public class ej5_hojaCadenas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu nombre y apellidos");
        String datosUsuario = in.nextLine();
        String separador = " ";
        String[] partes = separaCadena(datosUsuario, separador);
        
        System.out.println("La iniciales en mayusculas son:");
        for (int i = 0; i < partes.length; i++) {
        	String inicial = partes[i].substring(0,1);
        	System.out.print(inicial.toUpperCase());
        }
        
    }
    
    public static String[] separaCadena(String cadena, String separador) {
    	return cadena.split(separador);
    }
}
