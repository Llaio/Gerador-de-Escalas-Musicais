package com.everis.geradorescalas.escalas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.everis.geradorescalas.NotasExistentes;

class TestGeradorEscala {

	@Test
	void testCriacaoEscala() {
		GeradorEscala gerador = new GeradorEscala();
		FormulaEscala formulaEscalaDiatonicaMaior = new FormulaEscalaDiatonicaMaior();
		Escala escala = gerador.geraEscala("C", formulaEscalaDiatonicaMaior);
		assertEquals(7,escala.getQuantidadeNotas());
	}

	@Test
	void testGrau() {
		GeradorEscala gerador = new GeradorEscala();
		FormulaEscala formulaEscalaDiatonicaMaior = new FormulaEscalaDiatonicaMaior();
		NotasExistentes notasExistentes = new NotasExistentes();
		Escala escala = gerador.geraEscala("C", formulaEscalaDiatonicaMaior);
		assertEquals(notasExistentes.getNote("E"), escala.getNote(3));
		assertEquals(notasExistentes.getNote("B"), escala.getNote(7));

		Escala outraEscala = gerador.geraEscala("C#", formulaEscalaDiatonicaMaior);
		assertEquals(notasExistentes.getNote("F"), outraEscala.getNote(3));
		assertEquals(notasExistentes.getNote("C"), outraEscala.getNote(7));
	}

	
}
