package br.com.caelum.contas.modelo;

public abstract class Funcionario {
    private String nome, cpf;
    private double salario;

    public abstract double getBonificacao();

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
