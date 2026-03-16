package org.example.solucao;

public class Recuperar {

    private Servico servico;

    public Recuperar(Servico servico){
        this.servico = servico;
    }

    public void recuperar(String contato){

        String link = "http://techstore.com/reset?token=123";

        servico.enviarMensagem("Recupere sua senha pelo link: " + link);
    }
}
