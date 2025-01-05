package NivelIntermediario.ClassesAbstratas;

public abstract class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokage() {
    }

    public Hokage(String nome) {
        this.nome = nome;
    }

    public Hokage(int idade) {
        this.idade = idade;
    }

    public Hokage(String aldeia, double altura, int idade, int missoes, String nome, double saldoBancario, boolean vivoOuNao) {
        this.aldeia = aldeia;
        this.altura = altura;
        this.idade = idade;
        this.missoes = missoes;
        this.nome = nome;
        this.saldoBancario = saldoBancario;
        this.vivoOuNao = vivoOuNao;
    }

    public abstract void sabedoriaHokage();
}
