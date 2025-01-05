package Desafio03;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificultade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome +
                "\nIdade: " + idade +
                "\nMissao: " + missao +
                "\nDificuldade da missao: " + nivelDificultade +
                "\nStatus: " + statusMissao);
    }
}
