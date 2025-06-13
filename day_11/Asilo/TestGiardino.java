package day_11.Asilo;

public class TestGiardino {
    public static void main(String[] args) {
        // Creo il giardino
        GiardinoAsilo giardino = new GiardinoAsilo();
        
        // Diagramma dell'esempio dell'esercizio
        String diagramma = "VRCGVVRVCGGCCGVRGCVCGCGV\n" +
                          "VRCCCGCRRGVCGCRVVCVGCGCV";
        
        // Leggo il diagramma e assegno le piante ai bambini
        giardino.leggiDiagramma(diagramma);
        
        // Test specifici dall'esempio
        System.out.println("=== TEST SPECIFICI ===");
        giardino.stampaPianteBambino("Asia");  // Dovrebbe essere: Viola, Ravanello, Viola, Ravanello
        giardino.stampaPianteBambino("Roberto");    // Dovrebbe essere: Trifoglio, Erba, Trifoglio, Trifoglio
        
        System.out.println();
        
        // Stampo tutte le assegnazioni per vedere il risultato completo
        giardino.stampaTutteLePiante();
        
        // Test con altri bambini
        System.out.println("\n=== ALTRI TEST ===");
        giardino.stampaPianteBambino("Davide");  // Terzo bambino
        giardino.stampaPianteBambino("Giada");    // Quarto bambino
        giardino.stampaPianteBambino("Antonello");    // Ultimo bambino
        
        // Test con nome sbagliato per verificare la gestione errori
        giardino.stampaPianteBambino("Mario");    // Questo bambino non esiste
    }
}