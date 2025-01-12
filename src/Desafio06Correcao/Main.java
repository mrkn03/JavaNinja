package Desafio06Correcao;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /*Iniciar LinkedList com 7 ninjas*/
        LinkedList<Ninja> listaNinjas = new LinkedList<>();

        /*Adicionar os ninjas na LinkedList*/
        listaNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaNinjas.add(new Ninja("Temari", 18, "Areia"));

        /*Listar os ninjas*/
        System.out.println("--------------- Lista de Ninjas ---------------");

        /* Complexidade o(n)*/
        for(Ninja ninja : listaNinjas) {
            System.out.println(ninja);
        }


        /*Adicionar o ninja no inicio da lista*/
        listaNinjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));


        /*Remover o ninja no inicio da lista*/
        Ninja removido = listaNinjas.removeFirst();
        System.out.println("Ninja removido: " + removido);

        /*Listar os ninjas após mudancas*/
        System.out.println("--------------- Lista de Ninjas após mudancas ---------------");

        /* Complexidade o(n)*/
        for(Ninja ninja : listaNinjas) {
            System.out.println(ninja);
        }

        /*Procurar um ninja por indice*/
        System.out.println("--------------- Terceiro Ninja ---------------");
        Ninja terceiroNinja = listaNinjas.get(3);
        System.out.println("Terceiro ninja: " + terceiroNinja);

    }
}
