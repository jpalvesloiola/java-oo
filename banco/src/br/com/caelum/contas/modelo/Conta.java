package br.com.caelum.contas.modelo;

import java.util.Objects;

/**
 * Classe responsável por moldar as Contas do Banco.
 *
 * @author Joao Pedro Alves Loiola
 */
public abstract class Conta implements Comparable <Conta> {
    private int numero;
    private static int totalDeContas;
    private String agencia;
    protected double saldo;
    private double limite;
    private String titular;
    private Data dataDeAbertura;

    public Conta(){

    }
    public Conta(String titular, Data dataDeAbertura, int num, String agencia, double saldo,
                 double limite) {
        this.titular = titular;
        this.dataDeAbertura = dataDeAbertura;
        this.numero = num;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        Conta.totalDeContas = Conta.getTotalDeContas() + 1;
    }
    /**
     * Metodo que decrementa o saldo.
     * @param valor
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        }else{
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
    }
    /**
     * Metodo que incrementa o saldo.
     * @param valor
     */
    public void deposita(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor Invalido!");
        }else{
            this.saldo =+ valor;
        }
    }
    /**
     * Metodo que tranfere o saldo para conta passada como parametro.
     * @param valor
     * @param contaReceber
     */
    public void transfere(double valor, Conta contaReceber) throws SaldoInsuficienteException,
            IllegalArgumentException {
        contaReceber.deposita(valor);
        this.saca(valor);
    }


    //Compara numero e agencia de duas contas
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (this.getAgencia() == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        if (numero != other.numero)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        result = prime * result + numero;
        return result;
    }


    @Override
    public int compareTo(Conta outra){
        return this.titular.compareTo(outra.titular);
    }
    /*
    Este método deve retornar zero,
    se o objeto comparado for igual a este objeto, um número negativo,
    se este objeto for menor que o objeto dado, e um número positivo,
    se este objeto for maior que o objeto dado.
    */
    /*
    @Override
    public int compareTo(Conta o) {
        if (this.getSaldo() < o.getSaldo()){
            return 1; //Ordem Decrescente retone -1 ou vice versa
        }else if(this.getSaldo() > o.getSaldo()){
            return -1; //Ordem Decrescente retorne 1 ou vece versa
        }else
            return 0;
    }
     */


    /**
     * Metodo que exibe dados da conta e cliente
     * @return Atributos
     */
    @Override
    public String toString() {
        return "Número Conta: " + this.numero +
                "\nAgencia: " + this.agencia +
                "\nData de Abertura: " + this.dataDeAbertura +
                "\nSaldo: R$" + this.getSaldo() +
                "\nRendimento: R$" + this.getRendimento() +
                this.titular.toUpperCase();

    }

    public Data getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public double getRendimento() {
        return this.saldo * 0.1;
    } //Calcula rendimento

    public abstract String getTipo();

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular) {
    }

}
