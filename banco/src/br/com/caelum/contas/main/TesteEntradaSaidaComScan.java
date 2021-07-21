package br.com.caelum.contas.main;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteEntradaSaidaComScan {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Escreva algo:");

        Scanner s = new Scanner(System.in);

        PrintStream ps = new PrintStream("arquivo.txt");

        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }
    }
}
