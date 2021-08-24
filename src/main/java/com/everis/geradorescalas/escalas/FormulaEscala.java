package com.everis.geradorescalas.escalas;

import java.util.ArrayList;

public abstract class FormulaEscala {
	private ArrayList<Integer> intervalos;

	public FormulaEscala(String formula) throws IllegalArgumentException {
		if ((formula == null) || (formula.length() == 0)) {
			throw new IllegalArgumentException("Please provide a scale formula in the format \"nnnnnnn\"");
		}

		intervalos = new ArrayList<Integer>();
		int totalSomaIntervalos = 0;
		for (int i = 0; i < formula.length(); i++) {
			char theChar = formula.charAt(i);
			if (!Character.isDigit(theChar)) {
				throw new IllegalArgumentException("Please provide a scale formula in the format \"nnnnnnn\"");
			}
			intervalos.add(Integer.valueOf(String.valueOf(theChar)));
			totalSomaIntervalos += Integer.valueOf(String.valueOf(theChar)).intValue();
		}
		if (totalSomaIntervalos!=12) {
			throw new IllegalArgumentException("Please provide a scale formula in the format \"nnnnnnn\" that sums exactly 12 semitones.");
		}
	}
	
	public int getQuantidadeNotas() {
		return intervalos.size();
	}
	
	public int getIntervaloPorGrau(int grau) {
		if (grau < 1 || grau > intervalos.size()) {
			throw new IllegalArgumentException("Grau inválido nesta fórmula.");
		}
		return intervalos.get(grau-1);
	}


}
