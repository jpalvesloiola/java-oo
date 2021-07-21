package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static sun.misc.MessageUtils.where;

public class RepositorioDeContas {

    public void salva(List<Conta> contas){
        PrintStream arquivoDeContas = null;
        Scanner informacaoConta = null;

        try {
            arquivoDeContas = new PrintStream("ListaDeContas.txt");
            for (Conta conta : contas) {
               informacaoConta = new Scanner(conta.getTipo() + "," + conta.getNumero()+ ","
                        + conta.getAgencia()+ "," + conta.getTitular()+ "," + conta.getSaldo());
                arquivoDeContas.println(informacaoConta.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            informacaoConta.close();
        }
    }

    public List<Conta> carrega() {
        PrintStream arquivoDeContas = null;
        Scanner informacaoConta = null;
        List<Conta> contas = new ArrayList<>();
        try {
            do {
                informacaoConta = new Scanner(new File("ListaDeContas.txt"));//try-with-resources
                                                                            // n eh preciso fechar o arquivo com .close

                String linha = informacaoConta.nextLine();// leitura de cada linha do arquivo existente

                String[] valores = linha.split(",");//split separa os atributos escritos no
                                                        // arquivo "ListaDeContas.txt" com ","
                String tipo = valores[0];// conversao
                int numero = Integer.parseInt(valores[1]);// conversao
                String agencia = valores[2];// conversao
                String titular = valores[3];// conversao
                double saldo = Double.parseDouble(valores[4]);// conversao

                Conta conta;//identificar tipo de conta
                if (tipo.equals("Conta Corrente")) {
                    conta = new ContaCorrente(numero, agencia, titular, saldo);
                } else {
                    conta = new ContaPoupanca(numero, agencia, titular, saldo);
                }

                contas.add(conta);// adicionar conta no ArrayList

            } while (informacaoConta.hasNextLine());// continua ate o EOF
        } catch (FileNotFoundException e) {
            System.out.println("Ainda nao foi criado o arquivo");;
        }
        return contas;
    }
}
