package NivelIntermediario.FinalMethods;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar. Eu ja completei: " + numeroDeMissoesConcluidas + " missões.");
    }

    final void tacarKunai(){
        System.out.println("EU SOU UM METODO DA CALSSE FILHA!");
    }
}
