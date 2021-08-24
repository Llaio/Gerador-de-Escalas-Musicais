package com.everis.geradorescalas;

import java.util.ArrayList;

public class NotasExistentes {
	private ArrayList<Nota> notas;
	
	public NotasExistentes() {
		// https://pages.mtu.edu/~suits/notefreqs.html
		
		notas = new ArrayList<Nota>();
		notas.add(new Nota("C",130.81));
		notas.add(new Nota("C#",138.59));
		notas.add(new Nota("D",146.83));
		notas.add(new Nota("D#",155.56));
		notas.add(new Nota("E",164.81));
		notas.add(new Nota("F",174.61));
		notas.add(new Nota("F#",185.00));
		notas.add(new Nota("G",196.00));
		notas.add(new Nota("G#",207.65));
		notas.add(new Nota("A",220.00));
		notas.add(new Nota("A#",233.08));
		notas.add(new Nota("B",246.94));
	}
	
	public int getPosition(String nomeNota) throws IllegalArgumentException {
		for (int i=0; i< notas.size(); i++) {
			Nota aNota = notas.get(i);
			if (aNota.getName().equals(nomeNota)) {
				return i+1;
			}
		}
		throw new IllegalArgumentException("Invalid note name");
	}
	
	public Nota getNote(String nomeNota) throws IllegalArgumentException {
		for (int i=0; i< notas.size(); i++) {
			Nota aNota = notas.get(i);
			if (aNota.getName().equals(nomeNota)) {
				return aNota;
			}
		}
		throw new IllegalArgumentException(nomeNota);
	}
	
	public Nota getNote(int posNota) throws IndexOutOfBoundsException {
		boolean toDouble = false;
		if (posNota > 12) {
			posNota = posNota - 12;
			toDouble = true;
		}
		Nota temp = notas.get(posNota-1);
		Nota toReturn = new Nota(temp.getName(), temp.getFrequency());
		toReturn.setDoubleFrequency(toDouble);
		return toReturn;
	}

	
}
