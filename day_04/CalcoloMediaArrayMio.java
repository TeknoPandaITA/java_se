package day_04;

public class CalcoloMediaArrayMio {
    public static void main(String[] args) {
        double[] numeri = {10.9, 20.8, 16.7, 21.9, 12.9};
        
        double somma = 0;
        
        for (int i = 0; i < numeri.length; i++) {
            somma = somma + numeri[i];
        }
        
        double media = somma / numeri.length;
        
        System.out.println("I numeri nell'array sono:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }
        
        System.out.println("La somma è: " + somma);
        System.out.println("La media è: " + media);
    }
}
