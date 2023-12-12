package ud5;

public class ejemploASCII2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra = 'a';
		// de int a char la conversion no es automática para ello se hace
		//casting o forzado de tipos
		char sigLetra = (char)(letra-1);
		//  de char a enteros la conversion es automatica
		//casting == conversion de tipos automática
		System.out.println(sigLetra);
		
	
	}

}
