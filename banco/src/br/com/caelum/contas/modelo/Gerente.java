package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {
    private int senha, numeroFuncionariosGerenciados;

    public boolean autentica(int senha){
        if (senha == this.senha) {
            System.out.println("Acesso permitido!");
            return true;
        }else {
            System.out.println("Aceso Negado!");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return this.getBonificacao() * 1.4 + 1000;
    }
}
