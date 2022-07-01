package classes;

import java.net.Socket;

public class Jogador {
    
    private String id;
    private String ip;
    private Socket socket;
    private String user;
    private Jogada jogada;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Jogada getJogada() {
        return jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }    
    
}
