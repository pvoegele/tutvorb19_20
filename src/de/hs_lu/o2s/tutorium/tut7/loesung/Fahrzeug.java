package de.hs_lu.o2s.tutorium.tut7.loesung;

public abstract class Fahrzeug {

	private String marke, modell;
	private double kilometerstand;
	private int ps;
	private BesitzerList besitzerL;

	public Fahrzeug(String marke, String modell, double kmStand, int ps, BesitzerList besitzerL) {
		this.marke = marke;
		this.modell = modell;
		this.kilometerstand = kmStand;
		this.ps = ps;
		this.besitzerL.add(besitzerL);
	}

	public Fahrzeug(String marke, String modell, double kmStand, int ps, Person besitzer) {
		this.marke = marke;
		this.modell = modell;
		this.kilometerstand = kmStand;
		this.ps = ps;
		this.besitzerL.add(besitzer);
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

	public double getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(double kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public BesitzerList getBesitzerL() {
		return besitzerL;
	}

	public void setBesitzerL(BesitzerList besitzerL) {
		this.besitzerL = besitzerL;
	}

}
