package NivelIntermediario.OverloadConstrutores;

public class Ninja {

//TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas, Rank
    /*TODO: Rank: Gennin, Chuunin, Jounin, Hokage*/

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    /*Método existente: Primeiro método*/
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    /*TODO: SObrecarga do consturtor chamando os novos atributos*/
    /*Sobrecarga de metodos voce nao precisa redeclarar o construtor, só os novos atributos*/
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
    }

    // Sobreescrevendo o metodo da interface
    public void estrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome + " Essa é minha estrategia de combate");
    }
}
