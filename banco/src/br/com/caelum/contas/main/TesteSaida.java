package br.com.caelum.contas.main;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class TesteSaida {
    public static void main(String[] args) throws IOException {
        /*
           Decorator Pattern

           Aqui estamos criando e escrevendo no arquivo saida.txt
           mesmo fluxo para realizar a leitura de arquivos
         */
        Boolean append = true;

        OutputStream saida = new FileOutputStream("arquivo.txt",append);
        //Segundo parâmetro para indicar se você quer
        // reescrever o arquivo ou manter o que já estava escrito (append)

        OutputStreamWriter traduzCharEmByte = new OutputStreamWriter(saida, StandardCharsets.UTF_8);

        BufferedWriter traduzStringEmChar = new BufferedWriter(traduzCharEmByte);

        try {
            traduzStringEmChar.write("Mary Jane Maior Subs do Canal!!!!!!!!");
            traduzStringEmChar.newLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            traduzCharEmByte.close();
            traduzStringEmChar.close();

        }



    }
}
