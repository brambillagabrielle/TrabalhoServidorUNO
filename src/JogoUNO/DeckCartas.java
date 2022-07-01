package classes;

import java.util.Set;
import java.util.HashSet;

public class DeckCartas {
    
    int id;
    Set<Carta> deckCartas = new HashSet<Carta>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Carta> getDeckCartas() {
        return deckCartas;
    }

    public void setDeckCartas(Set<Carta> deckCartas) {
        this.deckCartas = deckCartas;
    }
    
}
