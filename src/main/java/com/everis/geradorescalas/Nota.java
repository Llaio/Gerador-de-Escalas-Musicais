package com.everis.geradorescalas;

public class Nota {

	private String name;
	private double frequency;
	private boolean doubleFrequency = false;

	public Nota(String name, double frequency) {
		this.name = name;
		this.frequency = frequency;
	}

	public String getName() {
		return name;
	}

	public double getFrequency() {
		return doubleFrequency ? frequency * 2 : frequency;
	}

	@Override
	public boolean equals(Object nota) {
		if (!(nota instanceof Nota)) {
			return false;
		}
		if (this.name.equals(((Nota) nota).getName()) && (this.frequency == ((Nota) nota).getFrequency()
				|| this.frequency == (((Nota) nota).getFrequency() / 2))) {
			return true;
		}
		return false;
	}

	public void setDoubleFrequency(boolean doubleFrequency) {
		this.doubleFrequency = doubleFrequency;
	}

}
