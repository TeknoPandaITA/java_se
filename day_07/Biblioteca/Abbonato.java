package day_07.Biblioteca;

public class Abbonato {
	private String cf;
	private String nome;
	private String cognome;
	
	public Abbonato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Abbonato(String cf, String nome, String cognome) {
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
	@Override
	public String toString() {
		return "Abbonati [cf=" + this.cf + ", nome=" + this.nome + ", cognome=" + this.cognome + "]";
	}


}