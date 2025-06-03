package day_05;

import java.util.Scanner;

public class InvertiStringaMio {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci una stringa da invertire: ");
		String stringaOriginale = scanner.nextLine();

		String stringaInvertita = "";

		for (int i = stringaOriginale.length() - 1; i >= 0; i--) {
			stringaInvertita = stringaInvertita + stringaOriginale.charAt(i);
		}

		System.out.println("Stringa originale: " + stringaOriginale);
		System.out.println("Stringa invertita: " + stringaInvertita);

		scanner.close();
	}
}