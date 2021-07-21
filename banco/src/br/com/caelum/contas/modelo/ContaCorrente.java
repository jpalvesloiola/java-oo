package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(){

    }

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setTitular(titular);
        this.saldo = saldo;
    }

    @Override
    public String getTipo() {

        return "Conta Corrente";
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= (valor + 0.10);
        }else{
            throw new SaldoInsuficienteException("Saldo insuficiente!", valor);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public double getValorImposto() {

        return this.getSaldo() * 0.01;
    }

}
