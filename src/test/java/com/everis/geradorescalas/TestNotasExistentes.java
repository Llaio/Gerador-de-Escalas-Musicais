package com.everis.geradorescalas;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestNotasExistentes {

	@Test
	void testObtemC() {
		NotasExistentes notasExistentes = new NotasExistentes();
		assertEquals(new Nota("C", 130.81), notasExistentes.getNote("C"));
	}
	
	@Test
	void testObtemNotaInexistente() {
		NotasExistentes notasExistentes = new NotasExistentes();
        assertThrows(IllegalArgumentException.class, () -> {
        	notasExistentes.getNote("R");
        });
	}
	
	@Test
	void testObtemFSustenido() {
		NotasExistentes notasExistentes = new NotasExistentes();
		assertEquals(new Nota("F#", 185.00), notasExistentes.getNote("F#") );
	}
	
	@Test
	void testObtemQuartaNota() {
		NotasExistentes notasExistentes = new NotasExistentes();
		assertEquals(new Nota("D#", 155.56), notasExistentes.getNote(4)); 
	}


	@Test
	void testObtemPosicaoOnze() {
		NotasExistentes notasExistentes = new NotasExistentes();
		assertEquals(11, notasExistentes.getPosition("A#")); 
	}

}
