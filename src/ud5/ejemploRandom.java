package ud5;
//simular la tirada de un dado entre 1 y 6
import java.util.Random;

public class ejemploRandom {

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
		int tirada = ale.nextInt(6)+1;
		System.out.println(tirada);
	}

}
