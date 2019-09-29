package de.hs_lu.o2s.tutorium.tut9.loesung;

public class Veranstaltung {

	private String name, zimmer, Wochentag, uhrzeit;

	public Veranstaltung(String name, String zimmer, String Wochentag, String uhrzeit) {
		super();
		this.name = name;
		this.zimmer = zimmer;
		this.Wochentag = Wochentag;
		this.uhrzeit = uhrzeit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZimmer() {
		return zimmer;
	}

	public void setZimmer(String zimmer) {
		this.zimmer = zimmer;
	}

	public String getWochentag() {
		return Wochentag;
	}

	public void setWochentag(String Wochentag) {
		this.Wochentag = Wochentag;
	}

	public String getUhrzeit() {
		return uhrzeit;
	}

	public void setUhrzeit(String uhrzeit) {
		this.uhrzeit = uhrzeit;
	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + this.getName() + " findet im Zimmer " + this.getZimmer()
				+ " und am " + this.getWochentag() + " um " + this.getUhrzeit() + " statt.";
	}

}
