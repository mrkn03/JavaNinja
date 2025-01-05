package Desafio05;

public interface Conta {

    void consultarSaldo();

    abstract double depositar(double valor);

    abstract double sacar(double valor);
}
