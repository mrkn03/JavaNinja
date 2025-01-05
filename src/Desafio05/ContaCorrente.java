package Desafio05;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    @Override
    public double depositar(double valor) {
        return saldo += valor;
    }

    public double sacar(double valor) {
        return saldo-= valor;
    }

}
