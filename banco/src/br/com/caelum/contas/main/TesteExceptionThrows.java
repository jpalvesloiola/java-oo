package br.com.caelum.contas.main;

public class TesteExceptionThrows {
    public static void aumentarLetras() throws NullPointerException{
        String frase = null;
        String novaFrase = null;

        novaFrase = frase.toUpperCase();

        System.out.println("Velha Frase: " + frase);
        System.out.println("Nova Frase: " + novaFrase);
    }



    public static void main(String[] args) {

        try {
            TesteExceptionThrows.aumentarLetras();
        } catch (NullPointerException e) {
            System.out.println("Ocorreu um " +
                    "NullPointerException ao executar o método aumentarLetras() " + e);
        }

    }
}
