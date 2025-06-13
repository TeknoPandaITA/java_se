package Day_17_Esercizio2;

import java.math.BigDecimal;

public class Cliente {     // si puo dichiarare una classe abstract
	private String cf;
	private String nome;
	private String cognome;
	private BigDecimal prezzoDaPagare;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(String cf, String nome, String cognome) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public BigDecimal getPrezzoDaPagare() {
		return prezzoDaPagare;
	}
	public void setPrezzoDaPagare(BigDecimal prezzoDaPagare) {
		this.prezzoDaPagare = prezzoDaPagare;
	}
	@Override
	public String toString() {
		return "cf=" + this.cf + ", nome=" + this.nome + ", cognome=" + this.cognome + ", prezzoDaPagare=" + this.prezzoDaPagare.doubleValue();
	}

}