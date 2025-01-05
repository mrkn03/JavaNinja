package Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uchiha uchiha = new Uchiha();

        int opcao;

        do{
            System.out.println("-------------------------------");
            System.out.println("\tGerenciamento de Uchihas");
            System.out.println("-------------------------------");
            System.out.println("Escolha uma operação: \n" +
                    "1 - Cadastro de Ninjas\n" +
                    "2 - Exibir informações\n" +
                    "3 - Exibir habilidade especial\n" +
                    "4 - Atualizar habilidades\n" +
                    "5 - Encerrar programa");
            System.out.println("-------------------------------");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("\tCadastro de Ninja");
                    System.out.println("-------------------------------");
                    sc.nextLine();
                    System.out.print("Nome do ninja: ");
                    uchiha.nome = sc.nextLine();
                    System.out.print("Idade do ninja: ");
                    uchiha.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Habilidade especial: ");
                    uchiha.habilidadeEspecial = sc.nextLine();
                    System.out.print("Missão: ");
                    uchiha.missao = sc.nextLine();
                    System.out.print("Dificuldade da missão: ");
                    uchiha.nivelDificultade = sc.nextLine();
                    System.out.print("Status da missão: ");
                    uchiha.statusMissao = sc.nextLine();
                    break;
                    case 2:
                        System.out.println("-------------------------------");
                        System.out.println("\tMostrar informações");
                        System.out.println("-------------------------------");
                        uchiha.mostrarInformacoes();
                        break;
                        case 3:
                            System.out.println("-------------------------------");
                            System.out.println("\tMostrar habilidade especial");
                            System.out.println("-------------------------------");
                            uchiha.mostrarHabilidadeEspecial();
                            break;
                            case 4:
                                System.out.println("-------------------------------");
                                System.out.println("\tAtualização de Cadastro");
                                System.out.println("-------------------------------");
                                sc.nextLine();
                                System.out.print("Nome do ninja: ");
                                uchiha.nome = sc.nextLine();
                                System.out.print("Idade do ninja: ");
                                uchiha.idade = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Habilidade especial: ");
                                uchiha.habilidadeEspecial = sc.nextLine();
                                System.out.print("Missão: ");
                                uchiha.missao = sc.nextLine();
                                System.out.print("Dificuldade da missão: ");
                                uchiha.nivelDificultade = sc.nextLine();
                                System.out.print("Status da missão: ");
                                uchiha.statusMissao = sc.nextLine();
                                break;
                                case 5:
                                    System.out.println("Programa encerrado.");
                                    break;
                default:
                    System.out.println("Opção incorreta. Tenta novamente");
            }
        } while(opcao != 5);
    }
}
