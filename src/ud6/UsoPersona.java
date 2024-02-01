package ud6;

import java.util.Scanner;

public class UsoPersona {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 // datos para el primer objeto
		 //Enunciado: el primer objeto obtendrá las
		// anteriores variables pedidas por teclado		 
		  System.out.println("Introduce los datos para la primera persona:");
	        System.out.print("Nombre: ");
	        String nombre1 = in.nextLine();
	        System.out.print("Edad: ");
	        int edad1 = in.nextInt();
	        System.out.print("Sexo (H/M): ");
	        char sexo1 = in.next().charAt(0); 
	        in.nextLine();
	        System.out.print("Peso: ");
	        double peso1 = in.nextDouble();
	        System.out.print("Altura: ");
	        double altura1 = in.nextDouble();
	        
	     // primer objeto
	        Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);
	       
	        // datos para el segundo objeto
	        in.nextLine(); // Limpiamos el buffer
	        System.out.println("\nIntroduce los datos para la segunda persona (sin peso ni altura):");
	        System.out.print("Nombre: ");
	        String nombre2 = in.nextLine();
	        System.out.print("Edad: ");
	        int edad2 = in.nextInt();
	        System.out.print("Sexo (H/M): ");
	        char sexo2 = in.next().charAt(0);
	        
	     // segundo objeto
	        Persona persona2 = new Persona(nombre2, edad2, sexo2);
	        
	        // tercer objeto usando el constructor por defecto y métodos set
	        Persona persona3 = new Persona();
	        persona3.setNombre("Carlos");
	        persona3.setEdad(25);
	        persona3.setSexo('M');
	        persona3.setPeso(60.5);
	        persona3.setAltura(1.65); 
		
	        // Mostrar resultados
	        System.out.println("\nResultados para la primera persona:");
	        mostrarResultado(persona1);

	        System.out.println("\nResultados para la segunda persona:");
	        mostrarResultado(persona2);

	        System.out.println("\nResultados para la tercera persona:");
	        mostrarResultado(persona3);
	    }
	
	private static void mostrarResultado(Persona persona) {
		int resultadoIMC = persona.calcularIMC();
		String mensajeIMC;

		switch (resultadoIMC) {
		case Persona.DEBAJO_PESO:
			mensajeIMC = "Por debajo del peso ideal";
			break;
		case Persona.PESO_IDEAL:
			mensajeIMC = "En peso ideal";
			break;
		case Persona.SOBREPESO:
			mensajeIMC = "Con sobrepeso";
			break;
		default:
			mensajeIMC = "Error en el cálculo del IMC";
		}

		String mensajeEdad;

		if (persona.esMayorDeEdad()) {
		    mensajeEdad = "Es mayor de edad";
		} else {
		    mensajeEdad = "Es menor de edad";
		}

		System.out.println("Estado del IMC: " + mensajeIMC);
		System.out.println(mensajeEdad);
		System.out.println("Información de la persona:\n" + persona.toString());
	}

}
