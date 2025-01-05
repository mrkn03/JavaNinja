package Desafio04;

public class NinjaBasico implements Ninja{

    public String nome;
    public String vila;
    public String habilidade;
    public int idade;
    public TipoHabilidade tipo;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, String vila, String habilidade, int idade, TipoHabilidade tipo) {
        this.nome = nome;
        this.vila = vila;
        this.habilidade = habilidade;
        this.idade = idade;
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Vila: " + vila);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo da habilidade: " + tipo);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando Habilidade " + habilidade);
    }
}
