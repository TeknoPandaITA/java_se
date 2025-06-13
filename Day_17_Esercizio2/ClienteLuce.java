package Day_17_Esercizio2;

import java.math.BigDecimal;

public class ClienteLuce extends Cliente {
	
	private double kwh;
	private BigDecimal prezzoKwh;
	public ClienteLuce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClienteLuce(String cf, String nome, String cognome, double kwh) {
		super(cf, nome, cognome);
		this.kwh =kwh;
	}
	public double getKwh() {
		return kwh;
	}
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	public BigDecimal getPrezzoKwh() {
		return prezzoKwh;
	}
	public void setPrezzoKwh(BigDecimal prezzokwh) {
		this.prezzoKwh = prezzokwh;
	}
	@Override
	public String toString() {
		return "ClientiLuce ["+ super.toString() + "kwh=" + kwh + ", prezzokwh=" + prezzoKwh.doubleValue() + "]";
	}

}