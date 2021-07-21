package br.com.caelum.contas.main;

import java.io.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class DecoratorPattern {
    public static void main(String[] args) throws IOException {
        /*
            Decorator Pattern
                               VV
                               v
         */

        InputStream is = new FileInputStream("arquivo.txt");// ler bytes do arquivo ou System.in (teclado)
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");// codifica bytes Unicode em chars
        BufferedReader br = new BufferedReader(isr);// utiliza o buffer para criar strings a partir do chars
        String s = br.readLine();// le primeira linha e muda o cursor para a proxima linha

        do{
            // ler uma linha
            System.out.println(s);
            s = br.readLine();
        }while(br.readLine() != null);
        br.close();

       //do{
       //   int b = is.read();//metodo q ler o proximo byte do arquivo ateh -1(final do arquivo)
       //    System.out.print(b);
       //}while(is.read() != -1);//return -1 quando chega ao final do arquivo



        /*
            Para recuperar um caractere, precisamos traduzir os bytes com o encoding
            dado para o respectivo código unicode, isso pode usar um ou mais bytes.
            Escrever esse decodificador é muito complicado, quem faz isso por você é a
            classe InputStreamReader
         */




        //InputStreamReader isr = new InputStreamReader(is);
        //do{
        //    int c = is.read();//metodo q ler o proximo byte do arquivo ateh -1(final do arquivo)
         //   System.out.print(c);
        //}while(is.read() != -1);//return -1 quando chega ao final do arquivo




    }
}
