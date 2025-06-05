package day_09.Ereditarietà;

import java.time.LocalDate;

public class Persona {

	private String codiceFiscale;
	private String nome;
	private String cognome;
	private LocalDate nascita;
	private String luogo;

	public Persona() {
		super();
	}

	public Persona(String codiceFiscale, String nome, String cognome, LocalDate nascita, String luogo) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.luogo = luogo;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
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

	public LocalDate getNascita() {
		return nascita;
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	@Override
	public String toString() {
		return "Persona [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", nascita="
				+ nascita + ", luogo=" + luogo + "]";
	}
	
	
	
	
}
