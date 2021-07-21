package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.io.PrintStream;

public class VetorExemples {
    static PrintStream saida = System.out;
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        String frase = "Socorram-me, subi no ônibus em Marrocos";
        String[] palavras = frase.split("");
        VetorExemples.inverterFrase(palavras);

    }
    public static void inverterFrase(String[] palavras ){
        for (int i = palavras.length - 1; i >= 0; i--) {
            saida.print(palavras[i] + " ");
        }
    }

    public static void criarArrays(Conta[] contas){
        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100);
            contas[i] = conta;
            saida.println(contas[i].getSaldo());
        }
    }
    public static void mediaSaldo(Conta[] contas){
        double total = 0;
        for (int i = 0; i < contas.length; i++) {
            total += contas[i].getSaldo();
            saida.println(total/10);
        }
    }
}
