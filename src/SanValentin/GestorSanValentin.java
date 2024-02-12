package SanValentin;

public class GestorSanValentin {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Carlos", "123434");
		Persona persona2 = new Persona("Lola", "321343");
		Pareja pareja1 = new Pareja(persona1, persona2);
		Regalo regalo1 = new Regalo("bombon", 12.4, "un chocolate");
		Regalo regalo2 = new Regalo("estuche", 6.4, "un objeto");
		pareja1.setRegaloParaPersona1(regalo1);
		pareja1.setRegaloParaPersona2(regalo2);
		pareja1.mostrarDetalles();
	}

}
