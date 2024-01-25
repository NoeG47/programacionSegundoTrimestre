package ud6;

public class Tiempo {
	// definimos los atributos Y los encapsulamos (lo ocultamos)
	private int hora;
	private int minutos;
	private int segundos;

	// creamos los constructores
	public Tiempo(int hour, int minutes, int seconds) {
		cambiaHora(hour, minutes, seconds);

	}

	public Tiempo(int hour, int minutes) {
		cambiaHora(hour, minutes, 00);
	}

	public Tiempo(int hour) {
		cambiaHora(hour, 00, 00);

	}

	// DEFINIR MÉTODOS SETTER: ESCRIBIR
	public void cambiaHora(int hour, int min, int seg) {
		if ((hora >= 0) && (hora <= 23))
			hora = hour;
		else
			hora = 0;
		if ((minutos >= 0) && (minutos <= 59))
			minutos = min;

		else
			minutos = 0;

		if ((segundos >= 0) && (segundos <= 59))
			segundos = seg;
		else
			segundos = 0;

	}

	public void aumenta1sg() {
		//caso general
		segundos = +segundos + 1;
		//resto de casos
		if (segundos == 60) {
			segundos = 00;
			minutos++;
		}
		if (minutos == 60) {
			segundos = 00;
			hora++;
		}
		if (hora == 24) {
			hora = 00;
			;
		}
	}

	// LOS TRES GETTERS
	public String dameHora() {// SE CONCATENA
		
		return hora + ":" + minutos + ":" + segundos;
	}

}
