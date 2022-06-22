package Classes;

import java.util.ArrayList;

public class Partida {
    
    int id;
    ArrayList<Rodada> rodadas;

    public Partida() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Rodada> getRodadas() {
        return rodadas;
    }

    public void setRodadas(ArrayList<Rodada> rodadas) {
        this.rodadas = rodadas;
    }
    
    
    
}
