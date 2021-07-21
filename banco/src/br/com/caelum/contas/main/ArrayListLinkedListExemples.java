package br.com.caelum.contas.main;

import br.com.caelum.contas.ManipulardorDeContas;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.*;

public class ArrayListLinkedListExemples {
    public static void main(String[] args) {
        /*
        Uma lista é uma excelente alternativa a um array comum,
        já que temos todos os benefícios de arrays,
        sem a necessidade de tomar cuidado com remoções, falta de espaço etc.

        A outra implementação muito usada, a LinkedList,
        fornece métodos adicionais para obter e remover
        o primeiro e último elemento da lista.
        Ela também tem o funcionamento interno diferente,
        o que pode impactar performance
         */
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(100);

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(200);

        ContaCorrente c3 = new ContaCorrente();
        c3.deposita(300);

        ContaCorrente c4 = new ContaCorrente();
        c4.deposita(1040);

        ContaCorrente c5 = new ContaCorrente();
        c5.deposita(2005);

        ContaCorrente c6 = new ContaCorrente();
        c6.deposita(3020);

        List<Conta> contas; // Generics<> usado para substtuir o casting
        contas = new LinkedList<>();//LinkedList ou ArrayList podem ser usados sem alterar a classe conta
        contas.add(c1);
        contas.add(c3);
        contas.add(c2);
        contas.add(c4);
        contas.add(c5);
        contas.add(c6);

       // Random gerador = new Random();
        /*
        Os elementos da nossa coleção implementam a interface java.lang.Comparable,
        que define o método int compareTo(Object).
         */
        //Collections.sort(contas);

       // for (int i = 0; i < contas.size()  ; i++) { //Devemos usar sempre um Iterator ou enhanced for
            //ContaCorrente cc = contas.get(i);

            //imprime sequência de 10 números inteiros aleatórios entre 0 e 25



            //System.out.println(cc.getSaldo());
       // }


    }
}
