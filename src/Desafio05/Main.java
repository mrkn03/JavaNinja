package Desafio05;

public class Main {
    public static void main(String[] args) {


        System.out.println("---------- Conta Poupança ----------");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(1000);
        contaPoupanca.consultarSaldo();
        contaPoupanca.sacar(95);
        contaPoupanca.consultarSaldo();


        System.out.println("\n---------- Conta Corrente ----------");
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(1000);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(95);
        contaCorrente.consultarSaldo();

    }
}
