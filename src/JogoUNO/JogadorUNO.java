package classes;

import java.io.*;
import java.net.*;

public class JogadorUNO extends Thread {

    private static boolean feito = false;
    private Socket conexao;

    public JogadorUNO(Socket s) { conexao = s; }

    public void run() {
        
        try {
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String linha;
            
            while (true) {
                
                linha = entrada.readLine();
                
                if (linha == null)
                    break;
                
                System.out.println();
                System.out.println(linha);
            }
            
        } catch (IOException e) { System.out.println("IOException: " + e); }
        
        feito = true;
    }

    public static void main(String args[]) {
        
        try {
            
            Socket conexao = new Socket("127.0.0.1", 2222);
            PrintStream saida = new PrintStream(conexao.getOutputStream());
            
            BufferedReader teclado= new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Entre com o seu nickname: ");
            String meuNome = teclado.readLine();
            saida.println(meuNome);
            
             // Uma vez que tudo está pronto, antes de iniciar o loop
            // principal, executar a thread de recepção de mensagens.
            Thread t = new ClienteDeChat(conexao);
            t.start();
            // loop principal: obtendo uma linha digitada no teclado e
            // enviando-a para o servidor.
            String linha;
            while (true) {
                // ler a linha digitada no teclado
                System.out.print("> ");
                linha = teclado.readLine();
                // antes de enviar, verifica se a conexão não foi fechada
                if (done) {
                    break;
                }
                // envia para o servidor
                saida.println(linha);
            }
        } catch (IOException e) {
            // Caso ocorra alguma excessão de E/S, mostre qual foi.
            System.out.println("IOException: " + e);
        }
    }
}
