package day_07.Biblioteca;


public class ArchivioController {
	private static Prestito[] prestiti = new Prestito[100];
	private static Libro[] libri = new Libro[100];
	private static Abbonato[] abbonati = new Abbonato[100];
	public static String nuovoLibro(Libro libro) {
		
		for(int i = 0; i<libri.length; i++) {
			if(libri[i]==null) {
				libri[i]=libro;
				return "Libro inserito con successo";
			}
		}
		return "Database pieno, non e stato possibile inserire il nuovo libro";
	}
	
}