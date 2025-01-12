package NivelIntermediario.HashSetXTreeSet;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*List*/
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Tsunade");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");

        System.out.println("ArrayList: " + ninjas);

        /*HashSet - Usado para ordem sequencial*/
        Set<String> ninjasHashSet = new HashSet<>();
        ninjasHashSet.addAll(ninjas);

        System.out.println("Hash Set: " + ninjasHashSet);

        /*TreeSet - Usado para ordem sequencial*/
        Set<String> ninjasTreeSet = new TreeSet<>();
        ninjasTreeSet.addAll(ninjas);

        System.out.println("TreeSet: " + ninjasTreeSet);

        /*LinkedHashSet - Usado para ordem sequencial*/
        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(ninjas);

        System.out.println("LinkedHashSet: " + ninjasLinkedHashSet);
    }
}
