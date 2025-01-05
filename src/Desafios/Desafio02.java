package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao, N;
        String[] ninjas = null;

        do{
            System.out.println("----------------------------------------------");
            System.out.println("\tCadastros de ninjas da Vila da Folha");
            System.out.println("\t1 - Cadastro de Ninjas");
            System.out.println("\t2 - Listas ninjas");
            System.out.println("\t3 - Finalizar programa");
            System.out.println("----------------------------------------------");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Quantos ninjas irá cadastrar? ");
                    N = sc.nextInt();
                    sc.nextLine();

                    ninjas = new String[N];

                    for(int i = 0; i < N; i++){
                        System.out.printf("Nome do %dº ninja: ", i+1);
                        ninjas[i] = sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Ninjas cadastrados: ");
                    for (String ninja : ninjas) {
                            if(ninja != null){
                                System.out.println("ninja : " + ninja);
                            } else{
                                System.out.println("Nenhum ninja cadastrado.");
                            }
                    }
                    break;
                case 3:
                    System.out.println("Programa finalizado");
                    break;
            }
        } while(opcao != 3);


    }
}
