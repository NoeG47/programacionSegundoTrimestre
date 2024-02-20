package ud6;

public class AgendaContactos {
	private final int TAM = 10;
	private int cont;
	private Contacto[] agenda;
	
	//constructor
	public AgendaContactos() {
		this.agenda = new Contacto[TAM];

	}
	//para devolver la agenda
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
					agenda[i] = contacto;
					System.out.println(contacto.toString());
					System.out.println("Se ha añadido correctamente");
					i = TAM;
					cont++;
				}

			}
		}
		else {
			System.out.println("no se ha añadido");
		}
	}
	public boolean existeContacto(Contacto contacto) {
		return false;
		
	}
	public boolean eliminarContacto(Contacto contacto) {
		for (int i = 0; i < TAM; i++) {
			String nombre = contacto.getNombre();
			if (agenda[i] != null && agenda[i].getNombre().equals(nombre)) {
				agenda[i] = null;
				cont = cont -1;
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
				cadContactos += agenda[i].toString()+"\n";
			}

		}
		return cadContactos;
	}
}
