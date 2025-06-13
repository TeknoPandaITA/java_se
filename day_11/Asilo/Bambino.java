package day_11.Asilo;

public class Bambino {
    private String nome;        
    private Pianta[] piante;    
    
    // Costruttore: crea un bambino con il nome dato
    public Bambino(String nome) {
        this.nome = nome;
        this.piante = new Pianta[4]; // ogni bambino ha 4 piante
    }
    
    // Metodo per ottenere il nome del bambino
    public String getNome() {
        return nome;
    }
    
    // Metodo per impostare una pianta nella posizione specifica
    public void setPianta(int posizione, Pianta pianta) {
        // Controllo che la posizione sia valida (0-3)
        if (posizione >= 0 && posizione < 4) {
            piante[posizione] = pianta;
        }
    }
    
    // Ottengo una pianta da una posizione specifica
    public Pianta getPianta(int posizione) {
        // Controllo che la posizione sia valida
        if (posizione >= 0 && posizione < 4) {
            return piante[posizione];
        }
        return null; // null se posizione non valida
    }
    
    // Stampo tutte le piante del bambino
    public void stampaPiante() {
        System.out.print(nome + ": ");  
        
        // Ciclo attraverso tutte le piante
        for (int i = 0; i < piante.length; i++) {
            System.out.print(piante[i].getNome());  
            
            // Se non è l'ultima pianta, aggiungo una virgola
            if (i < piante.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();  // Vado a capo
    }
}