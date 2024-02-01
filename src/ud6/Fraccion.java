package ud6;

public class Fraccion {
	// definimos atributos
	private int den;
	private int num;

	// metodo constructor
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}

	// metodos getters
	public int getNum() {
		return num;
	}

	public int getDeno() {
		return den;
	}

	// metodo setter
	public void mostrar() {
		System.out.println(num + "/" + den);
	}

	public String toString() {
		return num + "/" + den;
	}

	// métodos publicos
	public Fraccion sumar(Fraccion f1) {
		int den1 = f1.getDeno();
		int resultDen = den1 * this.den;
		int num1 = f1.getNum();
		int resultNum = num1 * this.den + den1 * this.num;
		Fraccion f3 = new Fraccion(resultNum, resultDen);
		return f3;
	}

	public Fraccion restar(Fraccion f1) {
		int den1 = f1.getDeno();
		int resultDen = den1 * this.den;
		int num1 = f1.getNum();
		int resultNum = (num1 * this.den) - (den1 * this.num);
		Fraccion f3 = new Fraccion(resultNum, resultDen);
		return f3;
	}

	public Fraccion multiplicar(Fraccion f1) {
		int den1 = f1.getDeno();
		int resultDen = den1 * this.den;
		int num1 = f1.getNum();
		int resultNum = num1 * this.num;
		Fraccion f3 = new Fraccion(resultNum, resultDen);
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

	public void simplificar() {
		int mcd = mcd(num, den);
		num = num / mcd;
		den = den / mcd;
	}

	// Método para calcular el máximo común divisor
	private int mcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return Math.abs(a);
	}
	  // Método para verificar si dos fracciones son equivalentes
    public boolean sonEquivalentes(Fraccion otra) {
        this.simplificar();
        otra.simplificar();
        return (this.num == otra.num) && (this.den == otra.den);
    }
	
}
