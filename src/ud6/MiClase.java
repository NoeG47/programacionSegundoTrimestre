package ud6;

public class MiClase {
	private int num;
	private String cad;

	public MiClase(int num, String cad) {
		this.num = num;
		this.cad = cad;
	}
	@Override
	public String toString() {
		return "MiClase [num=" + num + ", cad=" + cad + "]";
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCad() {
		return cad;
	}

	public void setCad(String cad) {
		this.cad = cad;
	}
}
