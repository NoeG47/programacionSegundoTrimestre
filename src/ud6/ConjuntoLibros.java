package ud6;

public class ConjuntoLibros {
	private final int TAM = 10;
	private int cont;
	private Libro[] conjunto;

	public ConjuntoLibros() {
		this.conjunto = new Libro[TAM];
		this.cont = 0;
	}

	
	public Libro[] getConjunto() {
		return conjunto;
	}

	public void setConjunto(Libro[] conjunto) {
		this.conjunto = conjunto;
	}

	public boolean anadirlibros(Libro libro) {
		if (cont < TAM) {
			for (int i = 0; i < TAM; i++) {
				if (conjunto[i] == null) {
					conjunto[i] = libro;
					cont++;
					return true;
				}

			}
		}
		return false;
	}

	public boolean eliminarlibroTitulo(String repuesta) {
		for (int i = 0; i < TAM; i++) {
			if (conjunto[i] != null && conjunto[i].getAutor().equals(repuesta)) {
				conjunto[i] = null;
				cont--;
				return true;
			}
		}
		return false;
	}

	public boolean eliminarlibroAutor(String repuesta) {
		boolean eliminado = false;
		for (int i = 0; i < cont; i++) {
			if (conjunto[i] != null && conjunto[i].getAutor().equals(repuesta)) {
				conjunto[i] = null;
				eliminado = true;
				cont--;
				return true;
			}
		}
		return eliminado;
	}
	private int damePrimeraPosicion() {
		for(int i=0;i<TAM;i++) {
			if (conjunto[i]!=null) {
				return i;
			}
		}
		return -1;
	}
	public void mostrarMayorCalificacion() {
		int primeraPosicion=damePrimeraPosicion();
		int posMaxCalificacion=primeraPosicion;
		int maxCalif = 0;
		if (primeraPosicion!=-1)  // no está vacio
		{
			maxCalif=conjunto[primeraPosicion].getCalificacion();
			
			for (int i = primeraPosicion+1; i < TAM; i++) {
				if (conjunto[i]!=null) {
					if (conjunto[i].getCalificacion()>maxCalif) {
						maxCalif=conjunto[i].getCalificacion();
						posMaxCalificacion=i;
					}
				}
			}
			System.out.println(conjunto[posMaxCalificacion].toString());
		}	
	}

	public void mostrarMenorCalificacion() {
		int primeraPosicion=damePrimeraPosicion();
		int posMinCalificacion=primeraPosicion;
		int minCalif = 0;
		if (primeraPosicion!=-1)  // no está vacio
		{
			minCalif=conjunto[primeraPosicion].getCalificacion();
			
			for (int i = primeraPosicion+1; i < TAM; i++) {
				if (conjunto[i]!=null) {
					if (conjunto[i].getCalificacion()<minCalif) {
						minCalif=conjunto[i].getCalificacion();
						posMinCalificacion=i;
					}
				}
			}
			System.out.println(conjunto[posMinCalificacion].toString());
		}	
	}

	public String toString() {
		String cadLibros = "";
		for (int i = 0; i < TAM; i++) {
			if (conjunto[i] != null) {
				cadLibros += conjunto[i].toString()+"\n";
			}

		}
		return cadLibros;
	}
}