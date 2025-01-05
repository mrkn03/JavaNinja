package NivelIniciante;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
         * Dados nao primitivos: Strin, Array, Class, enums
         * Objetivo: Criar um ninja e atribuir métodos a ele
         */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUpperCase coloca tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // Coloca tudo em caixa baixa
        System.out.println(aldeiaLowerCase);
    }
}
