package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar os Clientes do Banco.
 *
 * @author Joao Pedro Alves Loiola
 */
public class Cliente {
    private String nome, sobreNome, cpf;
    private int idade;

    //construtor
    public Cliente(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //construtor
    public Cliente(String nome, String sobreNome, String cpf, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sobreNome = sobreNome;
    }
    /**
     * Metodo que exibe dados do cliente
     * @return Atributos
     */
    @Override
    public String toString() {
        String dados;
        return dados = "\nTitular: " + this.nome + " " + this.sobreNome +
                "\nIdade: " + this.idade +
                "\nCPF: " + this.cpf;
    }

    public void mudaCPF(String novoCPF) {
        if (this.idade < 60) {
            validaCPF(novoCPF);
        }
        this.cpf = novoCPF;
    }

    private boolean validaCPF(String CPF) {
        return true;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void getTipo() {}
}
