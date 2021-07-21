package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String message){
        super(message);
    }
    public SaldoInsuficienteException(String message, Double valorDeSaque){
        super(message + "\nTentativa de saque: R$" + String.valueOf(valorDeSaque));
    }
    /* Eh recomendado, sempre que possivel, que se utilize as excessoes fornecidas pelo java ao inves
    de criarmos nossas proprias excessoes. Isso se deve, pois eh mais facil identificarmos os erros com
    base no padrao adotado pela documentacao java.
     */
}
