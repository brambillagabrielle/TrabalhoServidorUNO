package JogoUNO;

import java.util.ArrayList;

public class DeckCartas {
    
    int id;
    ArrayList<Carta> deckCartas;

    public DeckCartas() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Carta> getDeckCartas() {
        return deckCartas;
    }

    public void setDeckCartas(ArrayList<Carta> deckCartas) {
        this.deckCartas = deckCartas;
    }    
    
}
