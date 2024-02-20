package ud6;

public class UsoAgenda {

	public static void main(String[] args) {
		AgendaContactos agenda = new AgendaContactos();
		for (int i = 0; i < 8; i++) {
			Contacto user=new Contacto("carlos"+i, "1234");
			agenda.aniadirContacto(user);
		}
		Contacto user2=new Contacto("carlos8", "1234");
		Contacto user3=new Contacto("carlos9", "1234");
		agenda.aniadirContacto(user2);
		agenda.aniadirContacto(user3);
		agenda.eliminarContacto(user2);
		agenda.eliminarContacto(user3);
		System.out.println("------------");
		agenda.listarContactos();
		System.out.println("te quedan " + agenda.huecosLibre() + " espacios");
		agenda.aniadirContacto(user2);
		agenda.aniadirContacto(user2);
		
		if(agenda.existeContacto(user2)) {
			System.out.println("No se ha añadido, contacto duplicado");
		}
		agenda.aniadirContacto(user2);
		if(agenda.agendaLlena()) {
			System.out.println("agenda llena");
		}
		else {
			System.out.println("agenda no llena");
		}

		System.out.println("te quedan " + agenda.huecosLibre() + " espacios");
		agenda.buscarContacto("carlo8");
	}

}
