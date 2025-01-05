package NivelIntermediario.Heranca;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    @Override
    public void ativarKarma() {
        System.out.println("O Karma foi ativado com sucesso. Eu sou um Hyuga Uzumaki");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Jougan ativado com sucesso. Eu sou um Hyuga Uzumaki");
    }
}
