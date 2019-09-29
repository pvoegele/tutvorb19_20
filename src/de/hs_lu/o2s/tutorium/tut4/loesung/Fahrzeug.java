package de.hs_lu.o2s.tutorium.tut4.loesung;

public abstract class Fahrzeug {

	private String marke, modell, fahrgestellnummer;
	private Person besitzer;

	final public String toString() {
		return this.getClass().getSimpleName() + " von der Marke: " + this.getMarke() + " und Modell "
				+ this.getModell() + "\nmit der eindeutigen Fahrgestellnummer: " + this.getFahrgestellnummer();
	}

	public Fahrzeug(String marke, String modell, String fahrgestellnummer, Person besitzer) {
		this.marke = marke;
		this.modell = modell;
		this.fahrgestellnummer = fahrgestellnummer;
		this.besitzer = besitzer;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFahrgestellnummer() {
		return fahrgestellnummer;
	}

	public void setFahrgestellnummer(String fahrgestellnummer) {
		this.fahrgestellnummer = fahrgestellnummer;
	}

	
	public Person getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(Person besitzer) {
		this.besitzer = besitzer;
	}

}
