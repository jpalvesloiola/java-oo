package br.com.caelum.contas.main;

import java.util.Locale;

public class TesteExceptionsTryCatchFinally {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        }catch (NullPointerException nullPointerException){
            System.out.println("A frase inicial esta nula, para solucionar tal problema, foi lhe atribuido um valor default");
            frase = "Frase Vazia";
        }finally {
            novaFrase =  frase.toUpperCase();
        }

        System.out.println("Velha frase:  " + frase);
        System.out.println("Nova frase: " + novaFrase);
    }
}
