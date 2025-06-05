package day_09.Ereditarietà;

import java.time.LocalDate;

public class PersonaTest {
	public static void main(String[] args) {
		Uomo adamo = new Uomo("CF1", "Adamo", "Rossi", LocalDate.of(1970, 12, 8), "Roma", true);
		Donna eva = new Donna("CF2", "Eva", "Verdi", LocalDate.of(1982, 7, 12), "Firenze", "rosa");
		System.out.println(adamo.toString());
		System.out.println(eva.toString());
		
		Persona[] persone = {adamo, eva};
		for(Persona p : persone) {
			if(p instanceof Uomo) {
				Uomo u = (Uomo) p;
				System.out.println("Abbonamento: " + u.isAbbonamentoStadio());
			}
			else if(p instanceof Donna) {
				Donna d = (Donna) p;
				System.out.println("Colore rossetto: " + d.getColoreRossetto());
			}
		}
	}

}