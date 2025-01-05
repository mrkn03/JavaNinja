package Desafio03;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: "+habilidadeEspecial);
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome +
                "\nIdade: " + idade +
                "\nHabilidade especial: " + habilidadeEspecial +
                "\nMissao: " + missao +
                "\nDificuldade da missao: " + nivelDificultade +
                "\nStatus: " + statusMissao);
    }
}
