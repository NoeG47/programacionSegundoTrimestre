package CorrecionExamen;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner in = new Scanner (System.in);
	static int numMes;
	public static void main(String[] args) {
		String fecha;
		String fechaFormateada;
		boolean esFechaValida = false;
		do {
		System.out.println("Introduce una fecha en el formado dd/mm/aaaa");
		fecha = in.nextLine();
		if(!fechaValida(fecha)) {
			System.out.println("Fecha no válida, introduce otra");
		}
		else {
			System.out.println("Fecha válida");
			esFechaValida = true;
		}
		} while (!esFechaValida);
	}
	public static boolean fechaValida(String fecha) {
		if (contieneBarras(fecha) && contiene10Caracteres(fecha)&& mesComprendido(fecha)) {
			return true;
		}
		
		return false;
		
	}
	private static boolean contieneBarras(String fecha) {
		char barraDiagonal = '/';
		String cadBarraDiagonal = ""+barraDiagonal;
		if(fecha.contains(cadBarraDiagonal)) {
			//caso a: contiene dos / en la posicion correcta
			if (fecha.charAt(2) != barraDiagonal) {
				return false;
			}
			if (fecha.charAt(5) != barraDiagonal) {
				return false;
			}
			return true;
		}
		else {
			return false;
		}
	}
	private static boolean contiene10Caracteres(String fecha) {
		if (fecha.length() == 10) {
			return true;
		}
		return false;
	}
	private static boolean mesComprendido(String fecha) {
		int pos = fecha.indexOf("/");
		String cadMes = "";
		for (int i = pos + 1; i <= (pos+2); i++) {
			cadMes = cadMes +fecha.charAt(i);
		}
		int mes = Integer.parseInt(cadMes);
		if (mes >= 1 && mes <= 12) {
			numMes = mes;
			return true;
		}
		return false;
		
	}
	/*private String cambiaFormato(String fecha) {
		String [] meses = { "enero", "febrero", "marzo", "abril",
				"mayo", "junio", "julio", 
				"agosto", "septiembre", "octubre", "noviembre", "diciembre" };
		String dia = "";
		String mes = "";
		String año = "";
		for (int i = 0; i <= 2; i++) {
			dia = dia +fecha.charAt(i);
		}
		for (int i = 0; i < meses.length; i++) {
			
		}
	}
	
*/
}
