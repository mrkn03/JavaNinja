package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 99999999);
        System.out.println("Cadastro:" + cadastro);
        System.out.println("Nome do cadastro:" + cadastro.getNome());


        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 22222222);
        System.out.println("Cadastro Record:" + cadastroRecord);
        System.out.println("Nome do cadastro Record:" + cadastroRecord.nome());

        System.out.println("Email em caixa alta: " + cadastroRecord.emailCaixaAlta());

    }
}
