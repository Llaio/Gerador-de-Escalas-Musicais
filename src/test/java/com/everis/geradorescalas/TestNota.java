package com.everis.geradorescalas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class TestNota {

	@Test
	void testaCriacaoNota() {
		Nota umaNota = new Nota("F#", 200.0);
		assertEquals(umaNota.getName(), "F#");
		assertEquals(umaNota.getFrequency(), 200.0);
	}

	@Test
	void testaEquals() {
		Nota umaNota = new Nota("F#", 200.0);
		Nota outraNota = new Nota("F#", 200.0);
		assertEquals(umaNota, outraNota);
	}

	@Test
	void testaNotEquals() {
		Nota umaNota = new Nota("F#", 200.0);
		Nota outraNota = new Nota("C", 130.81);
		assertNotEquals(umaNota, outraNota);
	}

	@Test
	void testaNotEqualscomOutroTipo() {
		Nota umaNota = new Nota("F#", 200.0);
		String outraNota = "C#";
		assertNotEquals(umaNota, outraNota);
	}

}
