package day_05;

import java.util.Scanner;

public class PalindromoMio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci una parola: ");
		String parola = input.nextLine();

		String parolaMinuscola = parola.toLowerCase();

		String parolaInvertita = "";
		for (int i = parolaMinuscola.length() - 1; i >= 0; i--) {
			parolaInvertita = parolaInvertita + parolaMinuscola.charAt(i);
		}

		boolean èPalindromo = false;
		if (parolaMinuscola.equals(parolaInvertita)) {
			èPalindromo = true;
		}

		System.out.println("La parola inserita è: " + parola);
		System.out.println("La parola invertita è: " + parolaInvertita);

		if (èPalindromo == true) {
			System.out.println("È un palindromo!");
		} else {
			System.out.println("Non è un palindromo.");
		}

		input.close();
	}
}