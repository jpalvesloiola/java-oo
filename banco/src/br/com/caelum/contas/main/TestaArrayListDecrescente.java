package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaArrayListDecrescente {
    public static void main(String[] args) {

        /*
        Gere todos os números entre 1 e 1000 e ordene em ordem decrescente utilizando um ArrayList.
        Como ficou seu código? Resposta:
         */
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            lista.add(i);
        }

        Collections.sort(lista); //primeiro ordenamos
        Collections.reverse(lista);

        for (Integer num :
                lista) {
            System.out.println(num);
        }
    }
}
