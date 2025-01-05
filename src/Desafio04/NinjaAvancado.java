package Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, String vila, String habilidade, int idade, TipoHabilidade tipo, String especialidade) {
        this.nome = nome;
        this.vila = vila;
        this.habilidade = habilidade;
        this.idade = idade;
        this.tipo = tipo;
        this.especialidade = especialidade;
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
        System.out.println("A minha habilidade " + habilidade + " do tipo " + tipo + " foi ativada");
    }

    public void executarEspecialidade() {
        System.out.println("Especialidade " + especialidade +" ativada");
    }
}
