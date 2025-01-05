package NivelIntermediario.Override;

public class Ninja implements EstrategiaDeBatalha {

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
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " Essa é minha ESTRATEGIA de combate");
    }

    /*Sobrecarga de metodo - Inteligencia de Combate*/
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " Essa é minha INTELIGENCIA de combate");
    }

    /*Sobrecarga de metodo - Inteligencia de Combate*/
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu QI é: " + qi +" e voce é um genio");
        } else if(qi >= 130){
            System.out.println("Seu QI é: " + qi +" e voce é um ninja promissor");
        } else{
            System.out.println("Seu QI é: " + qi +" e voce precisa treinar mais suas estrategias");
        }
    }

    /*Metodo sem @Override*/
    public void metodoProvisorio(){
        System.out.println("Teste na classe Ninja");
    }

}
