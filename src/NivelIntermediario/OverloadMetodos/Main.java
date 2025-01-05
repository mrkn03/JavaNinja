package NivelIntermediario.OverloadMetodos;


public class Main {
    public static void main(String[] args) {

        /*Obj ninja nao da para ser criado por que e abstrato*/

        /*Obj Uzumaki*/

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 60, NivelNinja.GENIN);
        naruto.habilidadeEspecial();

        /*Obj Uchiha*/
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();


        /*Obj Uchiha 2*/
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.habilidadeEspecial();

        /*Obj Uchiha 3*/
        Uchiha madara = new Uchiha("Marada Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        /*Metodo comum*/
        madara.inteligenciaDeCombate();
        /*Metodo sobrecarregado*/
        madara.inteligenciaDeCombate(180);

    }
}
