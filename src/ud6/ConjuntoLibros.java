package ud6;

public class ConjuntoLibros {
	private final int TAM = 10;

	private Libro[] conjunto;

	public ConjuntoLibros() {
		this.conjunto = new Libro[TAM];

	}

	public Libro[] getConjunto() {
		return conjunto;
	}

	public void setConjunto(Libro[] conjunto) {
		this.conjunto = conjunto;
	}

	public boolean anadirlibros(Libro libro) {
		for (int i = 0; i < TAM; i++) {
			if (conjunto[i] == null) {
				conjunto[i] = libro;
				return true;
			}
		}

		return false;
	}

	public boolean eliminarlibroTitulo(String respuesta) {
		 for (int i = 0; i < TAM; i++) {
		        if (conjunto[i] != null && conjunto[i].getTitulo().equals(respuesta)) {
		            conjunto[i] = null;
		            return true;
		        }
		    }
		    return false;
	}

	public boolean eliminarlibroAutor(String respuesta) {
		for (int i = 0; i < TAM; i++) {
			if (conjunto[i] != null && conjunto[i].getAutor().equals(respuesta)) {
				conjunto[i] = null;
				return true;
			}
		}
		return false;
	}

	private int damePrimeraPosicion() {
		for (int i = 0; i < TAM; i++) {
			if (conjunto[i] != null) {
				return i;
			}
		}
		return -1;
	}

	public void mostrarMayorCalificacion() {
		int primeraPosicion = damePrimeraPosicion();
		int posMaxCalificacion = primeraPosicion;
		int maxCalif = 0;
		if (primeraPosicion != -1) // no está vacio
		{
			maxCalif = conjunto[primeraPosicion].getCalificacion();

			for (int i = primeraPosicion + 1; i < TAM; i++) {
				if (conjunto[i] != null) {
					if (conjunto[i].getCalificacion() > maxCalif) {
						maxCalif = conjunto[i].getCalificacion();
						posMaxCalificacion = i;
					}
				}
			}
			System.out.println(conjunto[posMaxCalificacion].toString());
		}
	}

	public void mostrarMenorCalificacion() {
		int primeraPosicion = damePrimeraPosicion();
		int posMinCalificacion = primeraPosicion;
		int minCalif = 0;
		if (primeraPosicion != -1) // no está vacio
		{
			minCalif = conjunto[primeraPosicion].getCalificacion();

			for (int i = primeraPosicion + 1; i < TAM; i++) {
				if (conjunto[i] != null) {
					if (conjunto[i].getCalificacion() < minCalif) {
						minCalif = conjunto[i].getCalificacion();
						posMinCalificacion = i;
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
				cadLibros += conjunto[i].toString() + "\n";
			}

		}
		return cadLibros;
	}
}