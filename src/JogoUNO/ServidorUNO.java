package classes;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ServidorUNO {
    
    private Jogador jogador;
    private static Queue<Jogador> ordemJogadores;
    private Socket conexao;
    private String nomeCliente;
    
    public ServidorUNO(Jogador j) { jogador = j; }
    
    public static void main(String args[]) {
        
        ordemJogadores = new LinkedList<Jogador>();
        int quantJogadores = 0;
        
        try {
            
            ServerSocket s = new ServerSocket(2222);
            
            while (quantJogadores < 4) {
                
                System.out.print("Esperando alguém se conectar...");
                Socket conexao = s.accept();
                
                quantJogadores++;
                
                Jogador jogador = new Jogador();
                jogador.setId(conexao.getRemoteSocketAddress().toString());
                jogador.setIp(conexao.getRemoteSocketAddress().toString());
                jogador.setSocket(conexao);

                ordemJogadores.add(jogador);

                System.out.println(" Conectou: " + conexao.getRemoteSocketAddress());
                
            }
            
        } catch (Exception e) { System.out.println("Exception: " + e); }
        
        Partida partida = new Partida();
        partida.setId(1);
        partida.setAtiva(true);
        
        int idVencedor = 0;
        
        while (idVencedor == 0) {
            
            Iterator i = ordemJogadores.iterator();
            while(i.hasNext()){
		
                Jogador jogador = new Jogador();
                Jogada jogada = new Jogada();
                
                jogador = (Jogador)i;
                
                Object[] tipos = { 
                    "Normais (Cor/número)",
                    "Especiais"
                };
                
                Object tipoSelecao = JOptionPane.showInputDialog(null,
                    "Escolha um tipo de carta", "Opção",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    tipos, tipos[0]);
                
                if (tipoSelecao == tipos[0]) {
                    
                    Object[] cores = { 
                        "Vermelho",
                        "Verde",
                        "Amarelo",
                        "Azul"
                    };

                    Object corSelecao = JOptionPane.showInputDialog(null,
                        "Escolha uma cor", "Opção",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        cores, cores[0]);

                    String stringNumero = JOptionPane.showInputDialog("Insira o número da carta:");

                } else {
                    
                    Object[] acoes = { 
                        "+2",
                        "Bloqueio",
                        "Inverter",
                        "+4"
                    };

                    Object acoesSelecao = JOptionPane.showInputDialog(null,
                        "Escolha uma cor", "Opção",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        acoes, acoes[0]);
                    
                    if (acoesSelecao != acoes[3]) {
                        
                        Object[] cores = { 
                            "Vermelho",
                            "Verde",
                            "Amarelo",
                            "Azul"
                        };

                        Object corSelecao = JOptionPane.showInputDialog(null,
                            "Escolha uma cor", "Opção",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            cores, cores[0]);
                        
                    }
                    
                }
                
            }
            
        }
        
    }
    
}
