package Desafio04;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("\t Ninja Basico");

        NinjaBasico naruto = new NinjaBasico();
        naruto.vila = "Vila da folha";
        naruto.habilidade = "Razengan";
        naruto.idade = 18;
        naruto.nome = "Naruto Uzumaki";
        naruto.tipo = TipoHabilidade.NINJUTSU;
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        System.out.println("------------------------------");
        System.out.println("\t Ninja Avançado");

        NinjaAvancado kaguya = new NinjaAvancado();
        kaguya.nome = "Kaguya Ootsutsuki";
        kaguya.habilidade = "Chakra e Proezas Físicas";
        kaguya.idade = 21;
        kaguya.especialidade = "Kekkei Moura";
        kaguya.vila = "Sem vila";
        kaguya.tipo = TipoHabilidade.RINNEGAN;
        kaguya.mostrarInformacoes();
        kaguya.executarHabilidade();
        kaguya.executarEspecialidade();
    }
}
