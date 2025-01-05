package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Array*/
        /*Sao estaticos, nao alteram de tamanho*/
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);
        }

        /*Listas*/
        /*Nao sao estaticas, podem aumentar e diminuir*/
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        /*Adicionar na lista*/
        ninjasList.add("Kakashi Hatake");
        System.out.println("Printando Lista = " + ninjasList);

        /*Remover da lista*/
        ninjasList.remove("Kakashi Hatake");
        System.out.println("Printando Lista = " + ninjasList);

        /*Trocar elementos*/
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("Printando Lista = " + ninjasList);

        /*Ver o tamanho da lista*/
        System.out.println("Tamanho Lista = " + ninjasList.size() + " elementos");
    }
}
