package com.everis.geradorescalas;

public class Nota {
	
	private String name;
	private double frequency;
	
	public Nota(String name, double frequency) {
		this.name=name;
		this.frequency=frequency;
	}
	public String getName() {
		return name;
	}
	public double getFrequency() {
		return frequency;
	}
	
	@Override
	public boolean equals(Object nota) {
		if (! (nota instanceof Nota)) {
			return false;
		}
		if (this.name.equals(((Nota)nota).getName()) && this.frequency == ((Nota)nota).getFrequency()) {
			return true;
		}
		return false;
	}
}
