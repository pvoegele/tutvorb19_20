package de.hs_lu.o2s.tutorium.tut4.uebung;

public class Auftrag {

	private double auftragsWert;
	private boolean aktiv;
	private Fahrzeug zugeordnetes_Fahrzeug;
	private Person auftraggeber;
	private String auftragsID;

	public Auftrag(Fahrzeug zugeordnetes_Fahrzeug, Person auftraggeber, String auftragsID, double auftragsWert) {
		this.setAktiv(true);
		this.auftragsID = auftragsID;
		this.zugeordnetes_Fahrzeug = zugeordnetes_Fahrzeug;
		this.auftraggeber = auftraggeber;
		this.auftragsWert = auftragsWert;
	}

	public double getAuftragsWert() {
		return auftragsWert;
	}

	public void setAuftragsWert(double auftragsWert) {
		this.auftragsWert = auftragsWert;
	}

	public String getAuftragsID() {
		return auftragsID;
	}

	public void setAuftragsID(String auftragsID) {
		this.auftragsID = auftragsID;
	}

	public boolean isAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public Fahrzeug getZugeordnetes_Fahrzeug() {
		return zugeordnetes_Fahrzeug;
	}

	public void setZugeordnetes_Fahrzeug(Fahrzeug zugeordnetes_Fahrzeug) {
		this.zugeordnetes_Fahrzeug = zugeordnetes_Fahrzeug;
	}

	public Person getAuftraggeber() {
		return auftraggeber;
	}

	public void setAuftraggeber(Person auftraggeber) {
		this.auftraggeber = auftraggeber;
	}

	public String toString() {
		return "ID: " + this.auftragsID + "\n" + "Besitzer: " + this.getZugeordnetes_Fahrzeug().getBesitzer().toString()
				+ "\n" + "Fahrzeug: " + this.getZugeordnetes_Fahrzeug().toString() + "\n";
	}
}
