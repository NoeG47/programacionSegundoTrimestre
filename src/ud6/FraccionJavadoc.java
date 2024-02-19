package ud6;
/**
* Clase FraccionJavadoc
*
* Contiene informacion de las operaciones que se pueden
* hacer con las fracciones
*
* @author Noe Guaman
* @version 1.0
*/
public class FraccionJavadoc {
	//atributos
	/**
	 * valor del numerador
	 */
	private int num;
	/**
	 * valor del denominador
	 */
	private int den;
	 /**
     * Constructor de la clase Fraccion.
     *
     * @param num el numerador de la fracción.
     * @param den el denominador de la fracción.
     */
	//constructor
	public FraccionJavadoc(int num,int den) {
		this.num=num;
		this.den=den;
	}
	 /**
     * Método para mostrar la fracción en la consola.
     */
	//getters
	public void mostrar() {
		System.out.println(num+"/"+den);
	}
	
	/**
     * Método para obtener el numerador de la fracción.
     *
     * @return el numerador de la fracción.
     */
	
	public int dameNumerador() {
		return num;
	}
	
	/**
     * Método para obtener el denominador de la fracción.
     *
     * @return el denominador de la fracción.
     */
	public int dameDenominador() {
		return den;
	}
	
	/**
	 * Método para realizar la suma de dos fracciones
	 * @param f2 es la segunda fracción a sumar
	 * @return una nueva fracción resultado de la suma de la fracción actual y f2
	 * 
	 */
	public FraccionJavadoc suma(FraccionJavadoc f2) {
		int numRsdo=num*f2.dameDenominador()+
				den*f2.dameNumerador();
		int denRsdo=den*f2.dameDenominador();
		FraccionJavadoc fraccionResultado=new FraccionJavadoc(numRsdo,denRsdo);
		return fraccionResultado;
	}
	/**
	 * Método para realizar la resta de dos fracciones
	 * @param f2 es la segunda fracción a restar
	 * @return una nueva fracción resultado de la resta de la fracción actual y f2
	 * 
	 */
	// resta
	public FraccionJavadoc resta(FraccionJavadoc f2) {
		int numRsdo = (f2.dameNumerador() * den)-
				(f2.dameDenominador() * num);
		int denRsdo = f2.dameDenominador() * den;
		FraccionJavadoc fraccionResultado = new FraccionJavadoc(numRsdo, denRsdo);
		return fraccionResultado;
	}
	/**
	 * Método para realizar la multiplicacion de dos fracciones
	 * @param f2 es la segunda fracción a multiplicar
	 * @return una nueva fracción resultado de multiplicar la fracción actual y f2
	 * 
	 */
	//multiplicacion
	public FraccionJavadoc multiplicar(FraccionJavadoc f2) {
		int numRsdo = f2.dameNumerador() * num;
		int denRsdo = f2.dameDenominador() * den;
		FraccionJavadoc fraccionResultado = new FraccionJavadoc(numRsdo, denRsdo);
		return fraccionResultado;
	}
	/**
	 * Método para realizar la división de dos fracciones
	 * @param f2 es la segunda fracción a dividir
	 * @return una nueva fracción resultado de dividir la fracción actual y f2
	 * 
	 */
	//division
	public FraccionJavadoc dividir(FraccionJavadoc f2) {
		int numRsdo = f2.dameNumerador() * den;
		int denRsdo = f2.dameDenominador() * num;
		FraccionJavadoc fraccionResultado = new FraccionJavadoc(numRsdo, denRsdo);
		return fraccionResultado;
	}
	// boolean esIgualA (Fraccion)
	/**
     * Método para verificar si dos fracciones son iguales.
     *
     * @param otraFraccion la fracción a comparar con la actual.
     * @return true si las fracciones son iguales, false en caso contrario.
     */
    public boolean esIgualA(FraccionJavadoc otraFraccion) {
        return (num * otraFraccion.dameDenominador() == den * otraFraccion.dameNumerador());
    }
	//setter
	// void simplificar ()
    /**
     * Método para simplificar la fracción.
     */
    public void simplificar() {
        int mcd = calcularMCD(num, den);
        num /= mcd;
        den /= mcd;
    }
    
    /**
     * Método recursivo para calcular el máximo común divisor (MCD) de dos números.
     *
     * @param a el primer número.
     * @param b el segundo número.
     * @return el máximo común divisor de a y b.
     */
    private int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }
}
