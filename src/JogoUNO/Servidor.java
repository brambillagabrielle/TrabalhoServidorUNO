package JogoUNO;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Servidor {
    
    public static void main(String[] args) {
        
        int quantJogadores = 0;
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        
        try {
            ServerSocket s = new ServerSocket(2000);
            
            while(quantJogadores < 4) {
                System.out.println("Servidor aguardando jogadores....");
                Socket conexao = s.accept();
                
                BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream())); // pega qualquer entrada pelo teclado do usuario
                PrintStream saida = new PrintStream(conexao.getOutputStream());
                
                String comando = entrada.readLine();
                while(comando != null && !(comando.trim().equals(""))) {
                    if (comando.toLowerCase == "jogar") {
                        quantJogadores++;
                        Jogador jogador = new Jogador();
                        jogadores.add(jogador);
                        
                        if (quantJogadores == 4) {
                            Partida partida = new Partida();
                            partida.setId(1);
                            
                            partida.setJogadores(jogadores);
                        }
                    } else if(comando.toLowerCase == "sair") {
                        quantJogadores--;
                        System.out.println("Esperando outro jogador....");
                    }
                }
                
                conexao.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
