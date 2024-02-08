package ud6;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		ArrayList<String> listaFrutas = new ArrayList<String>();
		listaFrutas.add("Pera");
		listaFrutas.add("Manzana");
		listaFrutas.add("Melón");
		System.out.println(listaFrutas.toString());
		
		/*ArrayList<MiClase> lista = new ArrayList<MiClase>();
		lista.add(new MiClase(15,"hola"));
		System.out.println(lista);*/
		
		
		//bucle for each
		//a la derecha va el array o lista sobre el que va a iterar
		// a la izquierda el objeto que define el tipo de datos que hay dentro del array
		for (String fruta: listaFrutas) {
			System.out.println(fruta);
		}
		//bucle normal
		for (int i= 0; i < listaFrutas.size(); i++) {
			System.out.println(listaFrutas.get(i));
		}
	}

}
