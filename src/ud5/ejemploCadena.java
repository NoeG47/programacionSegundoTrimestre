package ud5;

public class ejemploCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad="Hola";
		//concatenar
		cad = cad + " a todos";
		System.out.println(cad);
		
		System.out.println("El tamaño de la cadena es:" + 
		cad.length());
		String cadMayus=cad.toUpperCase();
		System.out.println(cadMayus);
	}

}
