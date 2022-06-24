package JogoUNO;

import java.io.*;
import java.net.*;


public class Cliente {
    
    public static void main(String[] args) {
        
        try {
            
            Socket conexao = new Socket("127.0.0.1" , 2000);
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            PrintStream saida = new PrintStream(conexao.getOutputStream());
            
            String texto;
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                System.out.println("Quer jogar? [Jogar/Sair] >> ");
                texto = teclado.readLine();
                saida.println(texto);
                texto = entrada.readLine();
                if (texto == null) {
                    System.out.println("Conexao encerrada");
                    break;
                }
                 System.out.println(texto);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}