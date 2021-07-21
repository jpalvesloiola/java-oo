package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

import java.io.PrintStream;
import java.util.*;

public class TestaTreeSetDecrescente {
    public static void main(String[] args) {
        /*
        Gere todos os números entre 1 e 1000 e ordene
        em ordem decrescente utilizando um TreeSet. Como ficou seu código?
         */
        TreeSet<Integer> conjunto = new TreeSet<>();

        for (int i = 1; i < 1000; i++) {
            conjunto.add(i);
        }

        for (Iterator<Integer> it = conjunto.descendingIterator(); it.hasNext(); ) {
            int num = it.next();
            System.out.println(num);
        }
    }
}
