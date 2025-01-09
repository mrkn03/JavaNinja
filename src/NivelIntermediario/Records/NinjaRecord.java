package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {


    /*Todos os atributos sao FINAL por padrão*/
    /*Records nao possuem SETTER*/

    public String emailCaixaAlta(){
        return email.toUpperCase();
    }

}
