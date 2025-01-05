package NivelIntermediario.HerançaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }

    @Override
    public void hokageAtivado() {
        System.out.println(nome + ": Eu sou um Hokage");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um Anbu");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Sharingan ativado");
    }
}
