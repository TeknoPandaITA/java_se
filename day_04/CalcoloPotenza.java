package day_04;

import java.util.Scanner;

public class CalcoloPotenza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci la base: ");
        double base = input.nextDouble();
        
        System.out.print("Inserisci l'esponente: ");
        int esponente = input.nextInt();
        
        double risultato = 1;
        
        if (esponente >= 0) {
            for (int i = 0; i < esponente; i++) {
                risultato = risultato * base;
            }
        } else {
            for (int i = 0; i < -esponente; i++) {
                risultato = risultato * base;
            }
            risultato = 1 / risultato;
        }
        
        System.out.println(base + " elevato a " + esponente + " = " + risultato);
        
        input.close();
    }
}