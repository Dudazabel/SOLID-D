package org.example;

import org.example.solucao.Email;
import org.example.solucao.Recuperar;
import org.example.solucao.SMS;
import org.example.solucao.Servico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Selecione o tipo de contato:");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        int escolha = leia.nextInt();
        leia.nextLine();

        Servico servico;

        if(escolha == 1){
            System.out.println("Digite o seu email: ");
            String email = leia.nextLine();

            servico = new Email();

            Recuperar recuperar = new Recuperar(servico);
            recuperar.recuperar(email);

        }else if(escolha == 2){
            System.out.println("Digite o seu número: ");
            String numero = leia.nextLine();

            servico = new SMS();

            Recuperar recuperar = new Recuperar(servico);
            recuperar.recuperar(numero);

        }else{
            System.out.println("Opção inválida!");
        }
    }
}