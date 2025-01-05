package Desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja informar quantos ninjas? ");
        int N = sc.nextInt();

        String[] ninjas = new String[N];
        String[] missao = new String[N];
        char[] nivel = new char[N];
        int[] idade = new int[N];
        boolean[] status = new boolean[N];

        for(int i = 0; i < N; i++){
            sc.nextLine();
            System.out.printf("Dados do %dº ninja:\n", i+1);
            System.out.print("Nome: ");
            ninjas[i] = sc.nextLine();

            System.out.print("Missão: ");
            missao[i] = sc.nextLine();

            System.out.print("Nivel da missao: ");
            nivel[i] = sc.nextLine().toUpperCase().charAt(0);

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Status de conclusão: (true/false): ");
            status[i] = sc.nextBoolean();

            System.out.println();
        }

        System.out.println("---------------------------------");
        for(int i = 0; i < N; i++){
            System.out.printf("Dados do %dº ninja", i+1);
            System.out.println("Nome: " + ninjas[i]);
            System.out.println("Missão: " + missao[i]);
            if(nivel[i] == 'C'|| nivel[i] == 'D' ){
                if(idade[i] > 15){
                System.out.println("O ninja %s não pode concluir essa missão");
                status[i] = false;
                }
            }else {
                System.out.println("Nivel da missão: " + nivel[i]);
            }
            System.out.println("Idade: " + idade[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("---------------------------------");
        }
    }
}
