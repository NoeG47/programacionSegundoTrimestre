package CorrecionExamen;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String fecha;

		boolean esFechaValida = false;
		do {
			System.out.println("Introduce una fecha en el formado dd/mm/aaaa");
			fecha = in.nextLine();
			if (!fechaValida(fecha)) {
				System.out.println("Fecha no válida, introduce otra");
			} else {
				System.out.println(cambiarFormato(fecha));
				esFechaValida = true;

			}
		} while (!esFechaValida);
	}

	public static boolean fechaValida(String fecha) {
		if (!contieneBarras(fecha))
			return false;
		if (!contiene10Caracteres(fecha))
			return false;
		if (!mesComprendido(fecha))
			return false;

		return true;

	}

	private static boolean contieneBarras(String fecha) {
		char barraDiagonal = '/';
		String cadBarraDiagonal = "" + barraDiagonal;
		if (fecha.contains(cadBarraDiagonal)) {
			// caso a: contiene dos / en la posicion correcta
			if (fecha.charAt(2) != barraDiagonal) {
				return false;
			}
			if (fecha.charAt(5) != barraDiagonal) {
				return false;
			}
			return true;
		} else {
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
		int mes = obtenerMes(fecha);
		if (mes >= 1 && mes <= 12) {
			return true;
		}
		return false;

	}

	private static int obtenerMes(String fecha) {
		int pos = fecha.indexOf("/");
		String cadMes = "";
		for (int i = pos + 1; i <= (pos + 2); i++) {
			cadMes = cadMes + fecha.charAt(i);
		}
		int mes = Integer.parseInt(cadMes);
		return mes;
	}

	private static int obtenerDia(String fecha) {
		String cadDia = "";
		for (int i = 0; i <= 1; i++) {
			cadDia = cadDia + fecha.charAt(i);
		}
		int dia = Integer.parseInt(cadDia);
		return dia;
	}

	private static int obtenerAnio(String fecha) {
		int pos = fecha.lastIndexOf("/");
		String cadAnio = "";
		for (int i = pos + 1; i <= (pos + 4); i++) {
			cadAnio = cadAnio + fecha.charAt(i);
		}
		int anio = Integer.parseInt(cadAnio);
		return anio;
	}

	private static String cambiarFormato(String fecha) {
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		int dia = obtenerDia(fecha);
		int mes = obtenerMes(fecha) - 1;
		int anio = obtenerAnio(fecha);
		String mesesCad = meses[mes];
		String fechaFormateada = "Dia " + dia + " de " + mesesCad + " del " + anio;
		return fechaFormateada;

	}

}
