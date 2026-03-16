package org.example.solucao;

public class Email implements Servico{

    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Email: " + mensagem);
    }
}
