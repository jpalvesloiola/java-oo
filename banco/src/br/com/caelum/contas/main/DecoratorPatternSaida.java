package br.com.caelum.contas.main;

import java.io.*;

public class DecoratorPatternSaida {
    public static void main(String[] args) throws IOException {
        /*
           Decorator Pattern

           Aqui estamos criando e escrevendo no arquivo saida.txt
           mesmo fluxo para realizar a leitura de arquivos
         */

        OutputStream os = new FileOutputStream("saida.txt");// procura o arquivo para escrita ou cria se n houver
        OutputStreamWriter osw = new OutputStreamWriter(os);// fluxo decorator pattern
        BufferedWriter bw = new BufferedWriter(osw);// fluxo decorator pattern

        bw.write("caelum");// escreve no arquivo a string passada como param

        bw.close();
    }
}
