package com.everis.geradorescalas.escalas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.everis.geradorescalas.NotasExistentes;

public class TestEscala {

	@Test
	public void testaCriacaoEscala() {
		Escala aEscala = new Escala();
		assertEquals(0, aEscala.getQuantidadeNotas());
	}

	@Test
	public void testaAdicaoNotas() {
		Escala aEscala = new Escala();
		NotasExistentes notasPossiveis = new NotasExistentes();
		aEscala.adicionaNota(notasPossiveis.getNote(1));
		aEscala.adicionaNota(notasPossiveis.getNote(2));
		assertEquals(2, aEscala.getQuantidadeNotas());
	}

	@Test
	public void testaObtemNotasPorGrau() {
		Escala aEscala = new Escala();
		NotasExistentes notasPossiveis = new NotasExistentes();
		aEscala.adicionaNota(notasPossiveis.getNote(1));
		aEscala.adicionaNota(notasPossiveis.getNote(3));
		aEscala.adicionaNota(notasPossiveis.getNote(5));
		assertEquals(notasPossiveis.getNote(5), aEscala.getNote(3));
	}

	@Test
	public void testaFalhaObtemNotasIndiceInvalido() {
		Escala aEscala = new Escala();
		NotasExistentes notasPossiveis = new NotasExistentes();
		aEscala.adicionaNota(notasPossiveis.getNote(1));
		aEscala.adicionaNota(notasPossiveis.getNote(3));
		aEscala.adicionaNota(notasPossiveis.getNote(5));
		assertThrows(IllegalArgumentException.class, () -> {
			assertEquals( notasPossiveis.getNote(4),aEscala.getNote(0));
		});
		assertThrows(IllegalArgumentException.class, () -> {
			assertEquals( notasPossiveis.getNote(4),aEscala.getNote(4));
		});
	}

}
