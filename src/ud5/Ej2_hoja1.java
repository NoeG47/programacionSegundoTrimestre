package ud5;

import java.util.Random;

//tirada de 3 dados, suma de ellos
public class Ej2_hoja1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				int[] arrayDado = new int [3];
				int suma = 0;
				for (int i = 0; i < 3; i++) {
				int tirada = ale.nextInt(6)+1;
				arrayDado[i] = tirada;
				suma = suma + tirada;
				}
				
				int dado = 0;
				for (int j = 0; j < 3; j++) {
					
					dado ++;
					System.out.println("el numero del dado" + dado + " es: " + arrayDado[j]);
				
				}
				System.out.println("La suma de los 3 numeros es: " + suma);		
	}

}
