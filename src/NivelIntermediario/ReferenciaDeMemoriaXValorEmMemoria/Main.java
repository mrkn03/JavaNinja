package NivelIntermediario.ReferenciaDeMemoriaXValorEmMemoria;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- Naruto Uzumaki ----------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        System.out.println(naruto.nome); /*Valor em memoria*/
        System.out.println(naruto); /*Referncia de memoria*/

        System.out.println("---------- Sasuke Uchiha ----------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);

    }

}
