package ud6;

public class AgendaContactos {
	private final int TAM = 10;
	private int cont;
	private Contacto[] agenda;
	
	//constructor
	public AgendaContactos() {
		this.agenda = new Contacto[TAM];
		this.cont = 0;
	}
	//para devolver la agenda
	public Contacto[] getAgenda() {
		return agenda;
	}
	public void setAgenda(Contacto[] agenda) {
		this.agenda = agenda;
	}
	public void aniadirContacto(Contacto contacto) {
		//boolean seHaAniadido = false;
		if (cont < TAM) {
			for (int i = 0; i < TAM; i++) {
				if(agenda[i] != null) {
					agenda[i] = contacto;
					cont++;
					System.out.println("Contacto añadido");
				}
			}
		}
	}
	public int huecosLibre() {
		int numHuecosLibres = 0;
		for (int i = 0; i < TAM; i++) {
			if(agenda[i] != null) {
				numHuecosLibres++;
			}
		}
		return numHuecosLibres;
	}
}
