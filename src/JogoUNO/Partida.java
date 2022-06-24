package JogoUNO;

import java.util.ArrayList;

public class Partida {
    
    int id;
    ArrayList<Jogador> jogadores;
    ArrayList<Rodada> rodadas;

    public Partida() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public ArrayList<Rodada> getRodadas() {
        return rodadas;
    }

    public void setRodadas(ArrayList<Rodada> rodadas) {
        this.rodadas = rodadas;
    }
    
    
    
}
