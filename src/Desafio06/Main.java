package Desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        LinkedList<Ninja> listaNinjas = new LinkedList<>();
        listaNinjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        listaNinjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        listaNinjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        listaNinjas.add(new Ninja("Kakashi Hatake", "Konoha", 31));
        listaNinjas.add(new Ninja("Gaara", "Areia", 17));
        listaNinjas.add(new Ninja("Shikamaru Nara", "Konoha", 17));
        listaNinjas.add(new Ninja("Temari", "Areia", 18));

        do {
            System.out.println("--------------- Cadastro de Ninjas ---------------");
            System.out.println("1 - Adicionar Ninja");
            System.out.println("2 - Remover Ninja");
            System.out.println("3 - Listar Ninjas");
            System.out.println("4 - Sair");
            System.out.println("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine();

                    System.out.println("Nome do Ninja: ");
                    String nome = sc.nextLine();
                    System.out.println("Vila do Ninja: ");
                    String vila = sc.nextLine();
                    System.out.println("Idade do Ninja: ");
                    int idade = sc.nextInt();
                    listaNinjas.add(new Ninja(nome, vila, idade));

                    if (listaNinjas.contains(nome)) {
                        System.out.println("Ninja cadastrado com sucesso!");
                        listaNinjas.removeLast();
                    }

                    break;
                case 2:
                    sc.nextLine();

                    System.out.println("Nome do Ninjas que deseja remover: ");
                    nome = sc.nextLine();

                    if (listaNinjas.contains(nome)) {
                        listaNinjas.remove(listaNinjas.get(listaNinjas.indexOf(nome)));
                        System.out.println("Ninja removido com sucesso!");
                    } else {
                        System.out.println("Ninja não existe!");
                    }
                    break;
                case 3:
                    System.out.println("--------------- Listagem de Ninjas ---------------");
                    for (Ninja ninja : listaNinjas) {
                        System.out.println(ninja.toString() + "\n");

                    }
                    break;
                case 4:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opcao invalida!");

            }
        } while (opcao != 4);

    }
}
