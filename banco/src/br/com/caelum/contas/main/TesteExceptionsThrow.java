package br.com.caelum.contas.main;

public class TesteExceptionsThrow {
        public static void aumentarLetras() throws Exception {
            String frase = null;
            String novaFrase = null;
            try {
                novaFrase = frase.toUpperCase();
            }catch (NullPointerException e){
                    throw new Exception(e);
            }


            System.out.println("Velha Frase: " + frase);
            System.out.println("Nova Frase: " + novaFrase);
        }



        public static void main(String[] args)  {

            try {
                aumentarLetras();
            } catch (Exception e) {
                System.out.println("Ocorreu um " +
                        "NullPointerException ao executar o método aumentarLetras() " + e);
            }

        }
    }
