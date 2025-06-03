package day_06;

import java.util.Scanner;

public class DiamanteKata {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci una lettera: ");
        char lettera = scanner.next().charAt(0);
        
        // Converte in maiuscolo
        if (lettera >= 'a' && lettera <= 'z') {
            lettera = (char)(lettera - 'a' + 'A');
        }
        
        creaDiamante(lettera);
        
        scanner.close();
    }
    
    public static void creaDiamante(char lettera) {
        // Se è solo A, stampa solo A
        if (lettera == 'A') {
            System.out.println("A");
            return;
        }
        
        // Calcola quante righe servono
        int righe = lettera - 'A' + 1;
        
        // Prima parte del diamante (dall'alto al centro)
        for (int i = 0; i < righe; i++) {
            char letteraCorrente = (char)('A' + i);
            stampaRiga(letteraCorrente, righe);
        }
        
        // Seconda parte del diamante (dal centro al basso)
        for (int i = righe - 2; i >= 0; i--) {
            char letteraCorrente = (char)('A' + i);
            stampaRiga(letteraCorrente, righe);
        }
    }
    
    public static void stampaRiga(char lettera, int dimensione) {
        // Calcola posizione della lettera (A=0, B=1, C=2...)
        int posizione = lettera - 'A';
        int larghezzaTotale = dimensione * 2 - 1; // larghezza del diamante
        
        // SOLO la prima e ultima riga hanno una singola A
        // Tutte le altre righe hanno DUE lettere identiche
        if (lettera == 'A') {
            // Spazi prima di A
            int spaziLato = larghezzaTotale / 2;
            for (int i = 0; i < spaziLato; i++) {
                System.out.print(" ");
            }
            System.out.print("A");
            // Spazi dopo A (stesso numero)
            for (int i = 0; i < spaziLato; i++) {
                System.out.print(" ");
            }
            System.out.println();
            return;
        }
        
        // Per tutte le altre lettere (sempre DUE lettere identiche)
        // Spazi all'inizio
        int spaziInizio = dimensione - 1 - posizione;
        for (int i = 0; i < spaziInizio; i++) {
            System.out.print(" ");
        }
        
        // Prima lettera
        System.out.print(lettera);
        
        // Spazi in mezzo
        int spaziMezzo = posizione * 2 - 1;
        for (int i = 0; i < spaziMezzo; i++) {
            System.out.print(" ");
        }
        
        // Seconda lettera
        System.out.print(lettera);
        
        // Spazi alla fine (stesso numero degli spazi all'inizio)
        for (int i = 0; i < spaziInizio; i++) {
            System.out.print(" ");
        }
        
        System.out.println();
    }
}