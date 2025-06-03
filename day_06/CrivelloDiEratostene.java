package day_06;

import java.util.Scanner;

public class CrivelloDiEratostene {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero per verificare se è primo: ");
        int numero = input.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " non è un numero primo.");
            input.close();
            return;
        }

        if (numero == 2) {
            System.out.println(numero + " è un numero primo.");
            input.close();
            return;
        }

        boolean[] numeriPrimi = crivelloEratostene(numero);

        if (numeriPrimi[numero]) {
            System.out.println(numero + " è un numero primo.");
        } else {
            System.out.println(numero + " non è un numero primo.");
        }

        input.close();
    }

    public static boolean[] crivelloEratostene(int limite) {
        boolean[] isPrimo = new boolean[limite + 1];

        for (int i = 2; i <= limite; i++) {
            isPrimo[i] = true;
        }
        
        for (int p = 2; p * p <= limite; p++) {
            if (isPrimo[p]) {
                for (int multiplo = p * p; multiplo <= limite; multiplo += p) {
                    isPrimo[multiplo] = false;
                }
            }
        }

        return isPrimo;
    }
}