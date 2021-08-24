package com.everis.geradorescalas;

import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator;
import com.everis.geradorescalas.escalas.Escala;
import com.jsyn.JSyn;
import com.jsyn.Synthesizer;

public class Player {
	
	private Synthesizer synth;
	private SineOscillator osc;
	private LineOut lineOut;
	
	public Player() {
		synth = JSyn.createSynthesizer();
		//synth.start();
		osc  = new SineOscillator();
		synth.add(osc);
		lineOut  = new LineOut(); 
		synth.add(lineOut);
		osc.output.connect(0, lineOut.input, 0);
		osc.output.connect(0, lineOut.input, 1);
	}
	
	public void tocaEscala(Escala aEscala) {
		
		if (aEscala == null) {
			throw new IllegalArgumentException("Forneça uma escala válida.");
		}
		synth.start();
		for (int i=1; i<= aEscala.getQuantidadeNotas(); i++) {
			play(aEscala.getNote(i).getFrequency(), 250);
		}
		synth.stop();
	}

	private void play(double freq, int millis) {
		osc.frequency.set(freq);
		try {
			double time = synth.getCurrentTime();
			// Sleep for a few seconds.
			lineOut.start();
			synth.sleepUntil(time + (millis / 1000.0));
			lineOut.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/*
	public static void main(String[] args) {
		Player fala = new Player();
		
		NotasExistentes notas = new NotasExistentes();
		tocaImprime(fala, notas, "G", 1000);
		tocaImprime(fala, notas, "A", 250);
		tocaImprime(fala, notas, "G", 500);
		tocaImprime(fala, notas, "E", 1000);
	}


	private static void tocaImprime(Player f,NotasExistentes asNotas, String nomeNota, int tempo) {
		f.play(asNotas.getNote(nomeNota).getFrequency(), tempo);
		System.out.println(nomeNota);
	}
	 */
}


