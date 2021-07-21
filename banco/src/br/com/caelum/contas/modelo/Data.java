package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar os Datas das Contas do Banco.
 *
 * @author Joao Pedro Alves Loiola
 */
public class Data {
    private int dia = 01;
    private int mes = 03;
    private int ano = 1996;

    //contrutor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    @Override
    public String toString() {
        String data;
        return data = this.dia + "/" + this.mes + "/" + this.ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
