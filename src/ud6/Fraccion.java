package ud6;

public class Fraccion {
	//definimos atributos
	private int den;
	private int num;
	//metodo constructor
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}
	//metodos getters
	public int getNum() {
		return num;
	}
	public int getDeno() {
		return den;
	}
	//metodo setter
	public void mostrar() {
		System.out.println(num + "/" + den);
	}
	public String toString() {
		return num + "/" + den;
	}
	
	//métodos publicos
	public Fraccion sumar(Fraccion f1) {
		int den1 = f1.getDeno();
		int resultDen = den1 * this.den;
		int num1 = f1.getNum();
		int resultNum = num1 * this.den + den1 * this.num;
		Fraccion f3 = new Fraccion( resultNum, resultDen);
		return f3;
	}
	public Fraccion restar(Fraccion f1) {
		int den1 = f1.getDeno();
		int resultDen = den1 * this.den;
		int num1 = f1.getNum();
		int resultNum = num1 * this.den - den1 * this.num;
		Fraccion f3 = new Fraccion( resultNum, resultDen);
		return f3;
	}
	public Fraccion multiplicar(Fraccion f1) {
		int den1 = f1.getDeno();
		int resultDen = den1 * this.den;
		int num1 = f1.getNum();
		int resultNum = num1 * this.num;
		Fraccion f3 = new Fraccion( resultNum, resultDen);
		return f3;
	}
	public Fraccion dividir(Fraccion f1) {
		int den1 = f1.getDeno();
		int resultDen = den1 * this.num;
		int num1 = f1.getNum();
		int resultNum = num1 * this.den;
		Fraccion f3 = new Fraccion(resultDen, resultNum);
		return f3;
	}
	public boolean esIgual(Fraccion f2) {
		int den1 = f2.getDeno();
		int num1 = f2.getNum();
		if (num1 % this.num == 0 && den1 % this.den == 0 ) {
			return true;
		}
		return false;
	}
}
