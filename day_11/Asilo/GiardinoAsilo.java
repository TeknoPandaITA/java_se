package day_11.Asilo;

public class GiardinoAsilo {
    private Bambino[] bambini;  // Array di tutti i bambini
    private String primaFila;   
    private String secondaFila;
    
    // Costruttore: crea tutti i 12 bambini in ordine alfabetico
    public GiardinoAsilo() {
        bambini = new Bambino[12];  // Creo l'array per 12 bambini
        
        // Creo tutti i bambini uno per uno (più semplice da capire)
        bambini[0] = new Bambino("Asia");
        bambini[1] = new Bambino("Roberto");
        bambini[2] = new Bambino("Davide");
        bambini[3] = new Bambino("Giada");
        bambini[4] = new Bambino("Elisabetta");
        bambini[5] = new Bambino("Francesca");
        bambini[6] = new Bambino("Giovanna");
        bambini[7] = new Bambino("Enrico");
        bambini[8] = new Bambino("Ilenia");
        bambini[9] = new Bambino("Antonio");
        bambini[10] = new Bambino("Stefania");
        bambini[11] = new Bambino("Antonello");
    }
    
    // legge il diagramma ed assegna le piante
    public void leggiDiagramma(String diagramma) {
        // Divido il diagramma in due righe
        String[] righe = diagramma.split("\n");
        primaFila = righe[0];
        secondaFila = righe[1];
        
        // Assegno piante ad ogni bambino
        for (int i = 0; i < bambini.length; i++) {
            // Ogni bambino ha 2 posizioni consecutive in ogni fila
            // Alice (i=0) ha posizioni 0,1 - Bob (i=1) ha posizioni 2,3 - ecc.
            int posizioneBambino = i * 2;
            
            // Creo le 4 piante leggendo dal diagramma
            // Prima fila: prima e seconda pianta
            Pianta pianta1 = new Pianta(primaFila.charAt(posizioneBambino));
            Pianta pianta2 = new Pianta(primaFila.charAt(posizioneBambino + 1));
            
            // Seconda fila: terza e quarta pianta  
            Pianta pianta3 = new Pianta(secondaFila.charAt(posizioneBambino));
            Pianta pianta4 = new Pianta(secondaFila.charAt(posizioneBambino + 1));
            
            // Assegno le piante al bambino
            bambini[i].setPianta(0, pianta1);  // Prima pianta
            bambini[i].setPianta(1, pianta2);  // Seconda pianta
            bambini[i].setPianta(2, pianta3);  // Terza pianta
            bambini[i].setPianta(3, pianta4);  // Quarta pianta
        }
    }
    
    // Metodo per trovare un bambino per nome
    public Bambino trovaBambino(String nome) {
        // Ciclo attraverso tutti i bambini
        for (int i = 0; i < bambini.length; i++) {
            // Uso equals() per confrontare stringhe (non ==)
            if (bambini[i].getNome().equals(nome)) {
                return bambini[i];  // Trovato!
            }
        }
        return null; // non trovato
    }
    
    // Metodo per stampare le piante di un bambino specifico
    public void stampaPianteBambino(String nome) {
        Bambino bambino = trovaBambino(nome);  // Cerco il bambino
        
        if (bambino != null) {
            bambino.stampaPiante();  // Se trovato, stampo le sue piante
        } else {
            System.out.println("Bambino " + nome + " non trovato!");
        }
    }
    
    // Metodo per stampare le piante di tutti i bambini
    public void stampaTutteLePiante() {
        System.out.println("=== GIARDINO DELL'ASILO ===");
        
        // Ciclo attraverso tutti i bambini
        for (int i = 0; i < bambini.length; i++) {
            bambini[i].stampaPiante();  // Stampo le piante di ogni bambino
        }
        
        System.out.println("===========================");
    }
}