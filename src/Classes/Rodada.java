package Classes;

import java.util.Queue;

public class Rodada {
    
    int id;
    Queue<Jogada> filaJogadas;

    public Rodada() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Queue<Jogada> getFilaJogadas() {
        return filaJogadas;
    }

    public void setFilaJogadas(Queue<Jogada> filaJogadas) {
        this.filaJogadas = filaJogadas;
    }
    
}
