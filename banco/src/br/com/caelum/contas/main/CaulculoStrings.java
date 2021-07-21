package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.io.PrintStream;

public class CaulculoStrings {
    static PrintStream saida = System.out;
    public static void main(String[] args) {
        String frase = "1 + 3 + 1";
        String[] palavras = frase.split(" ");
        CaulculoStrings.converter(palavras);

    }
    public static void converter(String[] palavras ){
        int result = 0;
        for (int i = 0; i < palavras.length; i++) {
            if (i == 1 || palavras[i].equals("*") || palavras[i].equals("/")) {
                switch (palavras[i]) {
                    case "+":
                        result = Integer.parseInt(palavras[i - 1]) + Integer.parseInt(palavras[i + 1]);
                        break;
                    case "-":
                        result = Integer.parseInt(palavras[i - 1]) - Integer.parseInt(palavras[i + 1]);
                        break;
                    case "/":
                        result = Integer.parseInt(palavras[i - 1]) / Integer.parseInt(palavras[i + 1]);
                        break;
                    case "*":
                        result = Integer.parseInt(palavras[i - 1]) * Integer.parseInt(palavras[i + 1]);
                        break;
                }
            }else{
                    switch (palavras[i]) {
                        case "+":
                            result = result + Integer.parseInt(palavras[i + 1]);
                            break;
                        case "-":
                            result = result - Integer.parseInt(palavras[i + 1]);
                            break;
                        case "/":
                            result = result / Integer.parseInt(palavras[i + 1]);
                            break;
                        case "*":
                            result = result * Integer.parseInt(palavras[i + 1]);
                            break;
                    }
            }

        }saida.print(result);
    }
}
