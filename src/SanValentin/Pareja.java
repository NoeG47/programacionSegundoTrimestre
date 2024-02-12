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
	}
	public void setRegaloParaPersona1(Regalo regaloParaPersona1){
		 this.regaloParaPersona1 = regaloParaPersona1;
		
	}
	public void setRegaloParaPersona2(Regalo regaloParaPersona2){
		 this.regaloParaPersona2 = regaloParaPersona2;
		
	}
	public double calcularCostoTotal() {
		return regaloParaPersona1.getPrecio() + regaloParaPersona2.getPrecio();
	}
	public void mostrarDetalles() {
		System.out.println(toString());
	}
	public String toString() {
		return "Pareja [persona1=" + persona1 + ", persona2=" + persona2 + ", regaloParaPersona1=" + regaloParaPersona1
				+ ", regaloParaPersona2=" + regaloParaPersona2 +  ", precioTotal de regalos= " + calcularCostoTotal()  + "]" ;
	}
	

}
