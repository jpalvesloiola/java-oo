package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class PerformanceMap {
    public static void main(String[] args) {

        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();

        Conta c1 = new ContaCorrente();
        c1.deposita(10000);

        Conta c2 = new ContaCorrente();
        c2.deposita(3000);

        // cria o mapa
        //Map mapaDeContas= new HashMap(); // sem Generics
        Map<String, Conta> mapaDeContas= new HashMap<>();

        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor?
        //Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");//com casting de contas 2 ms
        Conta contaDoDiretor = mapaDeContas.get("diretor");
        Conta contaDoGerente = mapaDeContas.get("gerente");

        System.out.println(contaDoDiretor.getSaldo());
        System.out.println(contaDoGerente.getSaldo());

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Tempo gasto: " + tempo);
    }
}
