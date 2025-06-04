package day_08;

/*Il Processo di verifica ISBN-10 viene utilizzato per convalidare i numeri di identificazione
del libro. Questi normalmente contengono trattini e tipo: 3-598-21508-8 X ISBN Il formato ISBN-10 è di 9 cifre da (0 a 9) più un carattere di controllo (una cifra o un X only). Nel caso in cui il carattere di controllo sia una X, questo rappresenta il valore '10'. Questi possono essere comunicati con o senza trattini e possono essere controllati per verificarne la validità con la seguente formula: (d₁ * 10 + d₂ * 9 + d₃ * 8 + d₄ * 7 + d₅ * 6 + d₆ * 5 + d₇ * 4 + d₈ * 3 + d₉ * 2 + d₁₀ * 1) mod 11 == 0 Se il risultato è 0, allora è un ISBN-10 valido, altrimenti non è valido. Esempio Prendiamo l'ISBN-10 3-598-21508-8. Lo colleghiamo alla formula e otteniamo: (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 * 1) mod 11 == 0 Poiché il risultato è 0, ciò dimostra che il nostro codice ISBN è valido.
Compito
Data una stringa il programma dovrebbe verificare se la stringa fornita è un ISBN-10 valido.
Per metterlo in atto è necessario pensare alla preelaborazione/analisi della stringa prima di calcolare
la cifra di controllo per l'ISBN.
Il programma dovrebbe essere in grado di verificare ISBN-10 sia con che senza trattini di separazione.
Avvertenze
La conversione da stringhe a numeri può essere complicata in alcune linguaggi. Ora,
è ancora più complicato poiché la cifra di controllo di un ISBN-10 potrebbe essere "X"
(che rappresenta "10"). Ad esempio 3-598-21507-X è un ISBN-10 valido.
https://en.wikipedia.wikipedia.org/wiki/ISBN#ISBN-10_check_digit_calculation
*/

import java.util.Scanner;

public class VerificaISBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un ISBN valido");
        String str = scanner.nextLine().toUpperCase();
        
        // tolgo i trattini e gli spazi
        str = str.replace("-", "");
        str = str.replace(" ", "");
        
        // controllo se è lungo 10
        if (str.length() != 10) {
            System.out.println("ISBN non valido");
            return;
        }
        
        int somma = 0;
        
        // faccio il calcolo per ogni carattere
        for (int i = 0; i < str.length(); i++) {
            char carattere = str.charAt(i);
            int numero;
            
            // se è X vale 10, altrimenti prendo il numero
            if (carattere == 'X') {
                numero = 10;
            } else {
                numero = carattere - '0'; // converto il carattere in numero
            }
            
            // moltiplico per il peso e aggiungo alla somma
            somma = somma + numero * (10 - i);
        }
        
        // controllo se è divisibile per 11
        if (somma % 11 == 0) {
            System.out.println("ISBN valido");
        } else {
            System.out.println("ISBN non valido");
        }
    }
}