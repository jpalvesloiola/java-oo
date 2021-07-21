package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestePerformancePrimeiraPsicao {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        // trocar depois por ArrayList
        //List<Integer> teste = new ArrayList<>();//ArrayList : 0.112 s para add e 0.001 s para pegar
        List<Integer> teste = new LinkedList<>(); //LinkedList : 0.004 s para add e 0.35 s para pegar

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {//qual é a mais rápida para se percorrer usando o get(indice)
                                        // (sabemos que o correto seria utilizar o enhanced for ou o Iterator)
            teste.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto Adicionando: " + tempo);

        long inicio1 = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            teste.get(i);
        }

        long fim1 = System.currentTimeMillis();
        double tempo1 = (fim1 - inicio1) / 1000.0;
        System.out.println("Tempo gasto get(i) : " + tempo1);
    }
}
