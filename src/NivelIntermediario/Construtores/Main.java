package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        // Usando o construtor sem parâmetros
        Ninja ninja1 = new Ninja();
        ninja1.exibirInfo();

        // Usando o construtor com parâmetros
        Ninja naruto = new Ninja("Naruto Uzumaki", "Uzumaki");
        Ninja sasuke = new Ninja("Sasuke Uchiha", "Uchiha");

        // Exibindo as informações dos ninjas
        naruto.exibirInfo();
        sasuke.exibirInfo();

    }
}
