package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;

public class TesteLambdas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Gilberto");
        lista.add("Karlos");
        lista.add("Joao Pedro");

        lista.forEach(s -> System.out.println(s));

        lista.removeIf(c -> c.length() <= 0);

        lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        Runnable r = () -> {
            for(int i = 0; i < 10000; i++)
                System.out.println("programa 1 valor " + i);
        };
        Thread t = new Thread(r);
        t.start();

        new Thread(() -> {
            for(int i = 0; i < 10000; i++)
                System.out.println("programa 1 valor " + i);
        }).start();
    }
}
