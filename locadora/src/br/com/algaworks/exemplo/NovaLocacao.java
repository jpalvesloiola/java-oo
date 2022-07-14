package br.com.algaworks.exemplo;

import java.util.Arrays;
import java.util.List;

import br.com.algaworks.model.Cliente;
import br.com.algaworks.model.Filme;
import br.com.algaworks.model.Locacao;
import br.com.algaworks.repository.Filmes;

public class NovaLocacao {
	public static void main(String[] args) {
		Filmes filmes = new Filmes();
		List<Filme> filmesAlugados = Arrays.asList(filmes.porCodigo(0), filmes.porCodigo(2));
		Locacao locacao = new Locacao(filmesAlugados, new Cliente("Joao Pedro Alves Loiola"));
		
		locacao.imprimirRecibo();
	}
}
