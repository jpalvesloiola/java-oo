package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class PerformanceListAndSet {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        Collection<Integer> teste = new HashSet<>(); // teste com HashSet(11 ms) vs ArrayList(345 ms)

        long inicio = System.currentTimeMillis();

        int total = 30000;

        /*
        O que é lento? A inserção de 30 mil elementos ou as 30 mil buscas?
        Descubra computando o tempo gasto em cada for separadamente com List.
         */
        for (int i = 0; i < total; i++) { //teste com HashSet(8 ms) vs ArrayList(3 ms)
            teste.add(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Tempo gasto: " + tempo);

        long inicio2 = System.currentTimeMillis();

        for (int i = 0; i < total; i++) { //teste com HashSet(3 ms) vs ArrayList(281 ms)
            teste.contains(i);
        }

        long fim2 = System.currentTimeMillis();
        long tempo2 = fim2 - inicio2;

        System.out.println("Tempo gasto: " + tempo2);

    }
}
