package ud5;

import java.util.Scanner;

public class Ej11_hojaCadenasSolPaul {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Introduce tu correo");
		String email = in.nextLine();
		
		if(emailEsCorrecto(email) == true) {
			System.out.println("El correo esta bien formado");
		}
		else {
			System.out.println("El correo no esta bien formado :(");
		}
	}
	public static boolean emailEsCorrecto(String email) {
		if(!contieneUnaArriba(email))
			return false;
		if(contieneAlgunEspacio(email))
			return false;
		if(contieneDosPuntosSeguidos(email))
			return false;
		//en caso contrario
		return true;
	}
	public static boolean contieneUnaArriba(String email) {
		int posPrimeraArroba = email.indexOf('@');
		int posUltimaArroba = email.lastIndexOf('@');
		if (posPrimeraArroba == -1)
			return false;
		//solo hay un @
		if (posPrimeraArroba == posUltimaArroba)
			return true;
		// hay más de 1 arroba
		return false;
	}
	public static boolean contieneAlgunEspacio(String email) {
		//forma 1
		/*
		for(int i = 0; i < email.length(); i++) {
			if (email.charAt(i)=' ')
				return false;
		}
		return true;*/
		//forma 2
		if (email.contains(" "))
			return true;
		//si no lo contiene
		return false;
		//forma 3
		//if (email.indexOf(' ')==1)
			//return false;
		//return true;
	}
	public static boolean contieneDosPuntosSeguidos(String email) {
		String[] partesEmail =email.split("@");
		boolean tieneDosPuntos= partesEmail[1].contains("..");
		return tieneDosPuntos;
	}
}
