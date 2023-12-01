package ud5;

import java.util.Random;

//muestre 20 numeros enteros aleatorios 0 y 10
public class Ej1_hoja1 {

	public static void main(String[] args) {
		// Paso 1: definir y construir un objeto
				// de tipo Random (Clase Random)
				// 	Defino un objeto:
				// clase nombre_objeto
				Random ale = null ;
				// construimos el objeto: reservamos RAM
				// nombre_objeto = new Constructor(parametros)
				ale = new Random();
		 
				//paso 2: usarlo a través de sus métodos
				// nombre_objeto.metodo(parametros)
				for (int i = 0; i<20; i++) {
					int tirada = ale.nextInt(10)+1;
					System.out.println(tirada);
				}
				
			

	}
}
