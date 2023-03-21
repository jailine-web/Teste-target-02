package entidades;

public class Faturamento {

	private String dia;
	private double valor01;
	private double valor02;
	
	public Faturamento(String dia, double valor01, double valor02) {
		this.dia = dia;
		this.valor01 = valor01;
		this.setValor02(valor02);
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public double getValor01() {
		return valor01;
	}

	public void setValor01(double valor01) {
		this.valor01 = valor01;
	}

	public double getValor02() {
		return valor02;
	}

	public void setValor02(double valor02) {
		this.valor02 = valor02;
	}

	@Override
	public String toString() {
		return dia + ", "  + valor01 + ", " + valor02;
	}
	
}
