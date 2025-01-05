package NivelIniciante;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
         * Dados primitivos - byte, short, char, int, long, float, double
         * Objetivos da aula: Criar um ninja - Naruto -
         */

        int idade = 17; /* Valor maximo: 2.147.483.647 */
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L; /* Valor maximo: 9.223.372.036.854.775.807 */

        System.out.println(idade); // Comando para mostrar para o usuario
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldoBancario = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
    }
}
