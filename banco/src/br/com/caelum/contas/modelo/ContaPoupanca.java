package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(){

    }

    public ContaPoupanca(int numero, String agencia, String titular, double saldo){
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setTitular(titular);
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getTipo() {
        return "Conta Poupanca";
    }
}
