package NivelIntermediario.ArrayXListXStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*Array*/
        String[] nomeNinjaArray = new String[5];

        System.out.println("--------------- ARRAY ---------------");
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";

        System.out.println("nomeNinjaArray: " + Arrays.toString(nomeNinjaArray));
        System.out.println("nomeNinjaArray[0]: " + nomeNinjaArray[0]);


        /*List*/
        /*A lista é um pouco mais lenta em comparacao com o Array*/
        System.out.println("\n--------------- LIST ---------------");
        List<String> nomeNinjaList = new ArrayList<String>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Itachi Uchiha");
        nomeNinjaList.add("Madara Uchiha");
        System.out.println("Mostrar Lista: " + nomeNinjaList);


        System.out.println("\n--------------- STACK ---------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        System.out.println("Tirar da pilha/Stack: " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        nomeNinjaStack.pop();
        nomeNinjaStack.push("Itachi Uchiha");
        System.out.println("Mostrar Stack: " + nomeNinjaStack);
        System.out.println("Ninja no topo (sem remover): " + nomeNinjaStack.peek());
    }
}
