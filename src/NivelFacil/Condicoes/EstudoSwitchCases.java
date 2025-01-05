package NivelIniciante;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: Servem para gerar casos especificos
        * Objetivo: Pedir pro usuário escolher entre os Ninjas
        * SwitchCase*/

        // Pedir para o usuário
        Scanner sc = new Scanner(System.in);

        // Mostrar opçoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma opçao
        int escolha = sc.nextInt();

        System.out.println("Voce digitou o numero: " + escolha);

        // Rea~]ao ao escolher um personagem
        switch (escolha) {
            case 1:
                System.out.println("O usuário escolher o Naruto Uzumaki");
                break;
                case 2:
                    System.out.println("O usuário escolheu o Sasuke Uchiha");
                    break;
                    case 3:
                        System.out.println("O usuário escolheu a Sakura Haruno");
                        break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        // Fechar a caixa
        sc.close();
    }
}
