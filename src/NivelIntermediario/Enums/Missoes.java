package NivelIntermediario.Enums;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }

    /*Metodo para mostrar mais informacoes*/
    public void mostrarInfo() {
        System.out.println("----- Detalhes da Missao -----");
        System.out.println("Missao: " + nome + "\nRank: " + rank + "\nDescricao:" + rank.getDescricao() + "\nDificuldade: " + rank.getDificuldade());
    }
}
