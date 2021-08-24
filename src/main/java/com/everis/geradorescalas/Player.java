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
			play(aEscala.getNote(i).getFrequency(), 300);
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
}


