package NivelIntermediario.ClasseAbstrataXInterface;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Metodos abstratos
    public abstract void nomedoNinja();

    public void tacarKunai(){
        System.out.println("Eu taquei uma kunai");
    }
}
