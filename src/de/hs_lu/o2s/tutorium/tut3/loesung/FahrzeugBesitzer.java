package de.hs_lu.o2s.tutorium.tut3.loesung;

public class FahrzeugBesitzer extends Person {

	public FahrzeugBesitzer(String vorname, String nachname, Fahrzeugliste zugeordnete_fahrzeugliste) {
		super(vorname, nachname, zugeordnete_fahrzeugliste);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String retString = super.toString() + "hat folgende Fahrzeuge:\n";
		retString += this.getZugeordnete_fahrzeugliste().toString();
		return retString;
	}

}
