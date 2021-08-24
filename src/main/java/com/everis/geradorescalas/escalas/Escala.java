package com.everis.geradorescalas.escalas;

import java.util.ArrayList;

import com.everis.geradorescalas.Nota;

public class Escala {
	private ArrayList<Nota> notas;
	
	public Escala() {
		notas = new ArrayList<Nota>(); 
	}

	public int getQuantidadeNotas() {
		return notas.size();
	}

	public void adicionaNota(Nota note) {
		notas.add(note);
	}

	public Nota getNote(int grau) {
		if (grau<1 || grau> notas.size()) {
			throw new IllegalArgumentException("Índice inválido");
		}
		return notas.get(grau-1);
	}

}
