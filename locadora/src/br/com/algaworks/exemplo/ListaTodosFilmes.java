package br.com.algaworks.exemplo;

import java.time.format.DateTimeFormatter;

import br.com.algaworks.repository.Filmes;

public class ListaTodosFilmes {
	public static void main(String[] args) {
		System.out.printf("%-30s %s\n", "Nome: ", "Data de Lancamento: ");
		Filmes filme = new Filmes();
		filme.todos().forEach(f -> {
			System.out.printf("%-30s %s\n", f.getNome(),
					f.getDataLancamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		});
	}
}
