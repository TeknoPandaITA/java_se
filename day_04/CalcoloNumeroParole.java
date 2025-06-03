package day_04;

import java.util.Scanner;

/* Calcolo del numero di parole in una stringa
4Academy Java – Ing. Dario Serafini - Ing. Antonio Pagano.Scrivi un programma Java che calcola il numero di parole presenti in una
stringa data. Si considera una parola come una sequenza di caratteriseparati da spazi.
*/


public class CalcoloNumeroParole {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase");
		String frase = input.nextLine();
		
		char carattere = ' ';
		boolean interruttore = true;
		int count = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			carattere = frase.charAt(i);
			// System.out.println("Carattere in posizione 0 " + carattere);
			if (Character.isAlphabetic(carattere) && interruttore) {
				count = count + 1;// Oppure posso scirvere count++
				interruttore = false;
			} else {
				if (!Character.isAlphabetic(carattere)) {
					interruttore = true;
				}
			}

		}
		System.out.println("Numero di parole che compongono la frase " + count);
		input.close();
	}
}