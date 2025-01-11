package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        /*Array*/
        /*Sao estaticos e tem referencia de memória previa*/
        String[] ninjasArray = new String[10];
        ninjasArray[0] = "Naruto Uzumaki";

        /*Listas*/
        /*Sao dinamicas e o tamanho aumenta e diminui conforme a necessidade*/
        List<String> ninjasList = new ArrayList<String>();
        ninjasList.add("Naruto Uzumaki");


        /*Stack*/
        /*O ultimo elemento que entrou é obrigatoriamente o primeiro a sair*/
        Stack<String> ninjasStack = new Stack<String>();
        ninjasStack.add("Naruto Uzumaki");
        System.out.println("Minha Stack atual: " + ninjasStack);
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Hinata Hyuga");
        ninjasStack.push("Kakashi Hatake");
        System.out.println("Minha Stack atual: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha Stack atualizada com pop: " + ninjasStack);
        System.out.println("Minha Stack atualizada com o proximo elemento do topo: " + ninjasStack.peek());
        System.out.println("Tamanho da Stack: " + ninjasStack.size());

        System.out.println("Minha Stack atual: " + ninjasStack);
    }
}
