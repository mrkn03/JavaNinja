package NivelIniciante;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
         * Scanner = É um jeito de trazer o usuario para dentro da aplicação
         * Objetivo: O usuário vai criar um ninja e vamos validar os dados*/

        // Abrir o Scanner
        Scanner sc = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.print("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = sc.nextLine();
        System.out.println("O nome do ninja é: "+ nomeDoNinja);

        // Receber a idade do ninja
        System.out.print("Digite a idade do ninja: ");
        int idadeDoNinja = sc.nextInt();
        System.out.println("A idade do ninja é: "+ idadeDoNinja + " anos");

        // Tratamento de dados
        if(idadeDoNinja >= 18){
            System.out.println("Esse ninja tem mais de 18 anos e pode ir para missoes fora da aldeia");
        } else{
            System.out.println("Esse ninja é muito novo e precisa treinar mais para sair da vila");
        }

        // Fechar sempre o Scanner
        sc.close();
    }
}
