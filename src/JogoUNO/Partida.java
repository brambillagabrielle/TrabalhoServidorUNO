package classes;

import java.util.Queue;

public class Partida {
    
    int id;
    boolean ativa;
    Jogador ganhador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public Jogador getGanhador() {
        return ganhador;
    }

    public void setGanhador(Jogador ganhador) {
        this.ganhador = ganhador;
    }
    
}
