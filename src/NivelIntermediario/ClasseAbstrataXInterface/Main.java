package NivelIntermediario.ClasseAbstrataXInterface;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        //naruto.nome = "Naruto Uzumaki";
        naruto.tacarUmaShuriken();


        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.nomedoNinja();
        sasuke.tacarKunai();
    }
}
