package br.com.caelum.contas.main;

public class TesteInteger {
    public static void main(String[] args) {
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);

        if (x1.equals(x2)) { // ao tentar com == o resutlado eh diferente
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

    }
}
