package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaPoupanca;

import java.util.*;

public class RandomLista {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Random aleatorio = new Random();

        Conta c1 = new ContaPoupanca();
        c1.deposita(aleatorio.nextInt(10000));

        Conta c2 = new ContaPoupanca();
        c2.deposita(aleatorio.nextInt(10000));

        Conta c3 = new ContaPoupanca();
        c3.deposita(aleatorio.nextInt(10000));

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        for (Conta conta : contas) {
            System.out.println(conta.getSaldo());
        }

        System.out.println(contas);
    }
}
