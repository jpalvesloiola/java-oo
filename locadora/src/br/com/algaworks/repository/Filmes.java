package br.com.algaworks.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import br.com.algaworks.model.Filme;

public class Filmes {

	private static Filme[] filmes = {
			new Filme("Jogos Vorazes", LocalDate.of(2010, Month.AUGUST, 8), new BigDecimal(80)),
			new Filme("Matrix", LocalDate.of(2020, Month.FEBRUARY, 8), new BigDecimal(180)),
			new Filme("Vingadores", LocalDate.of(2022, Month.MARCH, 8), new BigDecimal(150)),
			new Filme("Top Gun: Maverick", LocalDate.of(2010, Month.DECEMBER, 8), new BigDecimal(110)),
			new Filme("Mariguella", LocalDate.of(2018, Month.SEPTEMBER, 8), new BigDecimal(50)), };

	public List<Filme> todos() {
		return Arrays.asList(filmes);
	}

	public Filme porCodigo(int codigo) {
		return filmes[codigo];
	}

}
