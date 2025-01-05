package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {

        // Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.ModoSabioAtivado();

        // Objeto 2

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.SharinganAtivado();

        // Objeto 3

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 19;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.AtivarCura();

        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.AtivarByakugan();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.idade = 9;
        boruto.aldeia = "Aldeia da Folha";
        boruto.ModoSabioAtivado();
        boruto.ativarKarma();
        boruto.ativarJougan();
    }
}
