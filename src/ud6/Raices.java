package ud6;

public class Raices {
	//atributos
	private double a, b, c;
	
	//metodo constructor
	public Raices(double a,  double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public double getDiscriminante() {
		return (b*b)-(4*a*c);
	}
	public boolean tieneRaices() {
		if (getDiscriminante() > 0){
			return true;
		}
		return false;
	}
	public boolean tieneRaiz() {
		if (getDiscriminante() == 0){
			return true;
		}
		return false;
	}
	public void obtenerRaiz() {
		if(tieneRaiz()) {
			double discriminante = Math.sqrt(b * b - 4 * a * c);
			double raiz1 = (-b + discriminante) / (2 * a);
			System.out.println("Solucion1:" + raiz1);
		}
		System.out.println("Tiene una o ninguna raiz");
		
	}
	public void obtenerRaices() {
		if (tieneRaices()) {
			double discriminante = Math.sqrt(getDiscriminante());
			double raiz1 = (-b + discriminante) / (2 * a);
			double raiz2 = (-b - discriminante) / (2 * a);
			System.out.println("Solucion1:" + raiz1);
			System.out.println("Solucion2: "+ raiz2);
		}
		System.out.println("Tiene dos raices");
	}
}
