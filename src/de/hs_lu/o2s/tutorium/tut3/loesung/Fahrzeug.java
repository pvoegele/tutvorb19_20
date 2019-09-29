package de.hs_lu.o2s.tutorium.tut3.loesung;

public class Fahrzeug {

	private int max_geschwindigkeit;
	private String kennzeichen;

	public Fahrzeug(int max_geschwindigkeit, String kennzeichen) {
		super();
		this.max_geschwindigkeit = max_geschwindigkeit;
		this.kennzeichen = kennzeichen;
	}

	public int getMax_geschwindigkeit() {
		return max_geschwindigkeit;
	}

	public void setMax_geschwindigkeit(int max_geschwindigkeit) {
		this.max_geschwindigkeit = max_geschwindigkeit;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public String toString() {
		return this.getClass().getSimpleName() + ", mit Kennzeichen " + this.getKennzeichen() + " & max. Geschwindigkeit "
				+ this.getMax_geschwindigkeit() + " km/h.";
	}

}