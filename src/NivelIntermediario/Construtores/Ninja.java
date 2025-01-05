package NivelIntermediario.Construtores;

public class Ninja {

    private String nome;
    private String clã;

    // Construtor sem parâmetros (No-Args Constructor)
    public Ninja() {
        this.nome = "Ninja desconhecido";
        this.clã = "Clã desconhecido";
    }

    // Construtor com parâmetros (All-Args Constructor)
    public Ninja(String nome, String clã) {
        this.nome = nome;
        this.clã = clã;
    }

    // Metodo para exibir as informações do ninja
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Clã: " + clã);
    }

}
