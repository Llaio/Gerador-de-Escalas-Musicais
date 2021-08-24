package com.everis.geradorescalas;

import com.everis.geradorescalas.escalas.Escala;
import com.everis.geradorescalas.escalas.FormulaEscala;
import com.everis.geradorescalas.escalas.FormulaEscalaDiatonicaMaior;
import com.everis.geradorescalas.escalas.FormulaEscalaDiatonicaMenorNatural;
import com.everis.geradorescalas.escalas.GeradorEscala;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestPlayer {

	@Disabled
	@Test
	void testEscalaCMaior() {
		Player player = new Player();
		FormulaEscala formulaEscala = new FormulaEscalaDiatonicaMaior();
		Escala escala = new GeradorEscala().geraEscala("C", formulaEscala);
		player.tocaEscala(escala);
	}

	@Disabled
	@Test
	void testEscalaCMenorNatural() {
		Player player = new Player();
		FormulaEscala formulaEscala = new FormulaEscalaDiatonicaMenorNatural();
		Escala escala = new GeradorEscala().geraEscala("C", formulaEscala);
		player.tocaEscala(escala);
	}


	@Disabled
	@Test
	void testEscalaB() {
		Player player = new Player();
		FormulaEscala formulaEscala = new FormulaEscalaDiatonicaMaior();
		Escala escala = new GeradorEscala().geraEscala("B", formulaEscala);
		player.tocaEscala(escala);
	}
	
	@Disabled
	@Test
	void testEscalaFMenor() {
		Player player = new Player();
		FormulaEscala formulaEscala = new FormulaEscalaDiatonicaMenorNatural();
		Escala escala = new GeradorEscala().geraEscala("F", formulaEscala);
		player.tocaEscala(escala);
	}


}
