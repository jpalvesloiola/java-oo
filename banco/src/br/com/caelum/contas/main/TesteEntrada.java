package br.com.caelum.contas.main;

import java.io.*;

public class TesteEntrada {
    public static void main(String[] args) throws IOException {
        // DECORATOR PATTERN utilizado para este padrao de entrada


        /*
            FileInputStream procurará o arquivo no diretório em que a JVM fora invocada
            Lê o arquivo em bytes(1 a 4 bytes) de acordo com a representação binária da tabela Unicode
        */
        InputStream entrada = new FileInputStream("arquivo.txt"); //FileInputStream classe filha de InputStream

        /*
            é muito comum métodos receberem e retornarem InputStream em vez de suas filhas específicas.
            Com isso, elas desacoplam as informações e escondem a implementação,
            facilitando a mudança e manutenção do código.
         */
        // InputStream entrada = System.in; //entrada do teclado, polimorfismo


        /*
            Para recuperar um caractere, precisamos traduzir os bytes dado ao respectivo código unicode.
            Escrever esse decodificador é muito complicado, quem faz isso é a classe InputStreamReader
         */
        InputStreamReader traduzByteEmChar = new InputStreamReader(entrada, "UTF-8"); //filha classe Reader,
                                                                                                // manipula char

        /*
            A classe BufferedReader é um Reader que recebe outro Reader pelo construtor
            e concatena os diversos chars para formar uma String por intermédio do método readLine
         */
        BufferedReader traduzCharEmString = new BufferedReader(traduzByteEmChar, 10);

        String traduzido = null;

        try {
            do {
                traduzido = traduzCharEmString.readLine();// O método readLine devolve a linha que foi lida e
                                               // muda o cursor para a próxima linha
                System.out.println(traduzido);
            } while (traduzido != null);//Caso ele chegue ao fim do Reader (no nosso caso, final do arquivo),
                                        // ele vai devolver null

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            traduzCharEmString.close();//o close será cascateado para os objetos os quais o BufferedReader/Writer
            // utiliza a fim de realizar a leitura/escrita, além de ele fazer o flush dos buffers no caso da escrita.

            traduzByteEmChar.close();// desnecessario este
        }
    }
}
