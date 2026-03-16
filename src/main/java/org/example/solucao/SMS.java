package org.example.solucao;

public class SMS implements Servico{

    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("SMS: " + mensagem);
    }
}
