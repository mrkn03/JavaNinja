package NivelIntermediario.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*List*/
        List<String> ninjas = new ArrayList<String>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");

        System.out.println("Ninjas: " + ninjas);

        /*Set*/
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        ninjasSet.remove("Sakura Haruno");

        System.out.println("Ninjas: " + ninjasSet);
    }
}
