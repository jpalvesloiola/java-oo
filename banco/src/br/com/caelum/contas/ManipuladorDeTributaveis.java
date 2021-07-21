package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {
    private double total;

    public void calculaImpostos(Evento evento){
        this.total = 0;
        Tributavel t;
        for (int i = 0; i < evento.getTamanhoDaLista("listaTributaveis"); i++) {
            t = evento.getTributavel("listaTributaveis", i);
            this.total += t.getValorImposto();
        }
    }
}
