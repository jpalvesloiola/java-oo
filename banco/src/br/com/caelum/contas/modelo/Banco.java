package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Banco {
    private String nome;
    private int numero;
    private List<Conta> contas;
    private Map<String, Conta> indexadoPorNome;

    public Banco(String nome, int numero){
        this.numero = numero;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adiciona(Conta conta){
       this.contas.add(conta);
       indexadoPorNome.put(conta.getTitular(), conta);
    }

    public Conta pega(int posicao){
        return contas.get(posicao);
    }

    public int pegaQuantidadeDeContas(){
        return contas.size();
    }

    public Conta buscaPorTitular(String nomeTitular){
        return indexadoPorNome.get(nomeTitular);
    }

}
