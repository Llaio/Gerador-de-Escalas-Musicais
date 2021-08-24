package com.everis.geradorescalas.escalas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInvalidFormula {

	@SuppressWarnings("unused")
	@Test
	void testaFormulaEscalaVazia() {
		assertThrows(IllegalArgumentException.class, () -> {
			InvalidFormulaVazia invalidFormula = new InvalidFormulaVazia();
		});
	}

	@SuppressWarnings("unused")
	@Test
	void testaFormulaEscalaCaracteresInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> {
			InvalidFormulaCaracteresInvalidos invalidFormula = new InvalidFormulaCaracteresInvalidos();
		});
	}

	
}
