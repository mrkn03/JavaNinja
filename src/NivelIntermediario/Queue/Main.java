package NivelIntermediario.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*Array*/
        String[] ninjasArray = new String[6];

        /*Listas*/
        List<String> ninjasList = new ArrayList<>();


        /*Stack*/
        Stack<String> ninjasStack = new Stack<>();

         /*QUEUE - FILAS*/
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        /*Mostrar a fila*/
        System.out.println("Ninjas na fila: " + ninjasQueue);

        /*Tirar um ninja da fila*/
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);

        /*Como ver quem é o primeiro*/
        System.out.println("Ninjas no HEAD: " + ninjasQueue.peek());

        /*Adicionar a fila*/
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas na fila: " + ninjasQueue);

        /*Não é possivel deletar o TAIL*/

        /*Esvaziar fila*/
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);

        /*Verificar se a fila esta vazia*/
        if(ninjasQueue.isEmpty()){
            System.out.println("A fila esta vazia");
        }
    }
}
