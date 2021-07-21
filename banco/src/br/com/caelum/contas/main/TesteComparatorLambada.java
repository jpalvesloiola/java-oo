package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteComparatorLambada {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Sergio");
        lista.add("Fernando");
        lista.add("Rogerio");

        //Classe Anonima

        /*
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        Collections.sort(lista, comparator);  // podemos chamar sort de lista ou de collections
        */

        //Classe Anonima Simplificada

        /*
        Collections.sort(lista, new Comparator<String>() { // podemos chamar sort de lista ou de collections
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        */

        //Classe Anonima com Lambda

        lista.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

    }
}
