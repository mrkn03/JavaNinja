package NivelIniciante;

public class IfEElse {
    public static void main(String[] args) {

        /*
        *  IF e ELSE - NivelFacil.Condicoes
        *  Else IF
        * Objetivos: Passar o ninja de nivel de acordo com o numero de missoes
        * */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade  = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        /*
        * if (condicao {resultado}
        * else if (condicao) {resultado}
        * else {resultado}
        * */

        // se (condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if(numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}
