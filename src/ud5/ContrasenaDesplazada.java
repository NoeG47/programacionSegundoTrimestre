package ud5;

import java.util.Scanner;

public class ContrasenaDesplazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int desplazamientosCaracter = 0;
		//en el abecedario hay 26 posiciones
		boolean correcto = false;
		do {
			System.out.println("Ingrese el numero de desplazamiento");
		
			boolean esInt = in.hasNextInt();
			if (esInt == true) {
				desplazamientosCaracter = in.nextInt();
				correcto = true;
			}
			else {
				System.out.println("ERROR, Solo se admiten numeros");
				in.nextLine();
			}
			
		} while (correcto == false);
		
		//convertir una letra a otra sumandole su desplazamiento
		//caso pequeño
		//char letra = 'h';
		//char letraConv = 'h' + 3;
		//System.out.println(letraConv);
		
		
		//pedir frase al usuario
		String frase = in.nextLine();
		System.out.println("Introduce una frase");
		frase = in.nextLine();
		
		//frase cifrada como una cadena vacía
		String fraseCifrado = "";
		
		//recorrer la frase entera 
		for (int i = 0; i < frase.length(); i++) {
			  fraseCifrado += (char)(frase.charAt(i) + desplazamientosCaracter);
		}
		System.out.println(fraseCifrado);
		
	}

}
