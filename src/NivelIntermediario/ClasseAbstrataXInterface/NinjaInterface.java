package NivelIntermediario.ClasseAbstrataXInterface;

public interface NinjaInterface {

    // Tudo é automaticamente FINAL
    String nome = "Naruto Uzumaki";
    String aldeia = "Aldeia da Folha";
    int idade = 17;

    // Ele é obrigatoriamente abstrato
    public void tacarUmaShuriken();
}
