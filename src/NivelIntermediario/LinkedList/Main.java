package NivelIntermediario.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        /*Classes*/
            /*Listas*/
            ArrayList<String> lista = new ArrayList<>();

            /*Stack - Pilha*/
            Stack<String> stack = new Stack<>();

            /*LinkedList - Listas Linkadas*/
            LinkedList<String> linkedList = new LinkedList<>();


        /*Queue - Fila*/
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();


        linkedList.add("Naruto");
        System.out.println(linkedList);
    }
}
