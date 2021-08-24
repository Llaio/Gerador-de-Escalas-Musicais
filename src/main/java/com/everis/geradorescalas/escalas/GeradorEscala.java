package com.everis.geradorescalas.escalas;

import com.everis.geradorescalas.NotasExistentes;

public class GeradorEscala {

	public Escala geraEscala(String tonalidade, FormulaEscala formulaEscala) {
		NotasExistentes notasExistentes = new NotasExistentes();
		int posicaoInicial = notasExistentes.getPosition(tonalidade);
		if (formulaEscala == null) {
			throw new IllegalArgumentException("Forneça uma fórmula de escala válida");
		}
		Escala escala = new Escala();
		for (int i=1; i<= formulaEscala.getQuantidadeNotas(); i++) {
			escala.adicionaNota(notasExistentes.getNote(posicaoInicial));
			posicaoInicial += formulaEscala.getIntervaloPorGrau(i);
		}
		return escala;
	}

}
