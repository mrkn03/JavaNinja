package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Obj Ninja não da para ser criado

        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;

        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        //Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();
    }
}
