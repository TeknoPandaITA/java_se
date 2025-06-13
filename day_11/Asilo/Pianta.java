package day_11.Asilo;

public class Pianta {
    private String nome;    
    private char codice;   
    
    // Costruttore: Dal codice creo la pianta corrispondente
    public Pianta(char codice) {
        this.codice = codice;
        
        // Converto il codice nel nome della pianta
        if (codice == 'G') {
            this.nome = "Erba";
        } else if (codice == 'C') {
            this.nome = "Trifoglio";
        } else if (codice == 'R') {
            this.nome = "Ravanello";
        } else if (codice == 'V') {
            this.nome = "Viola";
        } else {
            this.nome = "Sconosciuta";  // Se il codice non è riconosciuto
        }
    }
    
    // ottengo il nome della pianta
    public String getNome() {
        return nome;
    }
    
    // ottengo il codice della pianta
    public char getCodice() {
        return codice;
    }
}