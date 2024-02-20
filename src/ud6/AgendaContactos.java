package ud6;

public class AgendaContactos {
	private final int TAM = 10;
	private int cont;
	private Contacto[] agenda;

	// constructor
	public AgendaContactos() {
		this.cont = 0;
		this.agenda = new Contacto[TAM];

	}

	// para devolver la agenda
	public Contacto[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Contacto[] agenda) {
		this.agenda = agenda;
	}

	public void aniadirContacto(Contacto contacto) {
		if (cont < TAM) {
			for (int i = 0; i < TAM; i++) {
				if (agenda[i] == null) {
					if (!existeContacto(contacto)) {
						agenda[i] = contacto;
						System.out.println(contacto.toString());
						System.out.println("Se ha añadido correctamente");
						i = TAM;
						cont++;
					}
				}

			}
		} else {
			System.out.println("Agenda llena, no se ha añadido");
		}
	}
	// esto funciona si en lugar de un string buscamos por el objeto contacto
	/*
	 * private int encontrarPosicionContacto(Contacto contacto) { for (int i = 0; i
	 * < TAM; i++) { String nombre = contacto.getNombre(); if (agenda[i] != null &&
	 * agenda[i].getNombre().equals(nombre)) { return i; // R } } return -1; //
	 * Retorna -1 si el contacto no se encuentra }
	 */

	/*
	 * public void buscarContacto(Contacto contacto) {
	 * 
	 * if (existeContacto(contacto)) { int pos =
	 * encontrarPosicionContacto(contacto);
	 * System.out.println(agenda[pos].toString()); } else {
	 * System.out.println("El contacto no existe"); }
	 * 
	 * }
	 */
	public void buscarContacto(String contacto) {
		boolean contactoEncontrado = false;
		for (int i = 0; i < TAM; i++) {
			if (agenda[i] != null && agenda[i].getNombre().equals(contacto)) {
				System.out.println(agenda[i].getTelefono());
				contactoEncontrado = true;
				i = TAM;
			}
		}
		if (!contactoEncontrado)
			System.out.println("Contacto no encontrado, no se puede mostrar su número de teléfono");
	}

	public boolean existeContacto(Contacto contacto) {
		for (int i = 0; i < TAM; i++) {
			String nombre = contacto.getNombre();
			if (agenda[i] != null && agenda[i].getNombre().equals(nombre)) {
				return true;
			}
		}
		return false;

	}

	public boolean eliminarContacto(Contacto contacto) {
		for (int i = 0; i < TAM; i++) {
			String nombre = contacto.getNombre();
			if (agenda[i] != null && agenda[i].getNombre().equals(nombre)) {
				agenda[i] = null;
				cont = cont - 1;
				return true;
			}
		}
		return false;
	}

	public int huecosLibre() {
		int huecos = TAM - cont;
		return huecos;

	}

	public boolean agendaLlena() {
		if (cont == TAM) {
			return true;
		}
		return false;
	}

	public void listarContactos() {
		System.out.println(toString());
	}

	public String toString() {
		String cadContactos = "";
		for (int i = 0; i < TAM; i++) {
			if (agenda[i] != null) {
				cadContactos += agenda[i].toString() + "\n";
			}

		}
		return cadContactos;
	}
}
