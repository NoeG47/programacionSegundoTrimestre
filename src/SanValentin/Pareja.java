package SanValentin;

public class Pareja {
	// atributos
	private Persona persona1;
	private Persona persona2;
	private Regalo regaloParaPersona1;
	private Regalo regaloParaPersona2;

	//metodo constructor
	public Pareja (Persona persona1, Persona persona2) {
		this.persona1 = persona1;
		this.persona2 = persona2;
		regaloParaPersona1 = null;
		regaloParaPersona2 = null;
	}
	public void setRegaloParaPersona1(Regalo regaloParaPersona1){
		 this.regaloParaPersona1 = regaloParaPersona1;
		
	}
	public void setRegaloParaPersona2(Regalo regaloParaPersona2){
		 this.regaloParaPersona2 = regaloParaPersona2;
		
	}
	//getter
	public double calcularCostoTotal() {
		return regaloParaPersona1.getPrecio() + regaloParaPersona2.getPrecio();
	}
	public void mostrarDetalles() {
		System.out.println(regaloParaPersona1.toString()+ " "+
				regaloParaPersona2.toString()+ "\n Precio total:"+
				this.calcularCostoTotal());
	}
	public String toString() {
		return "Persona1 " + persona1 
				+ "\n su regalo: " + regaloParaPersona1
				+ "\n Persona2 " + persona2 + 
				"\n su regalo: " + regaloParaPersona2;
	}
	

}
