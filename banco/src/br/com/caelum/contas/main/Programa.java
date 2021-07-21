package br.com.caelum.contas.main;

import java.io.*;
import java.lang.AutoCloseable;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("arquivo.txt");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }
    }
}
