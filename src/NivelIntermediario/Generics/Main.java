package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsa = new BolsaGenerica<>();
        bolsa.adicionarEquipamento(kunai);
        bolsa.adicionarEquipamento(shuriken);
        bolsa.adicionarEquipamento(pergaminho);

        System.out.println(bolsa);

    }
}
