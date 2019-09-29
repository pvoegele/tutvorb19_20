package de.hs_lu.o2s.tutorium.tut3.loesung;

public class Person {

	String vorname, nachname;
	Fahrzeugliste zugeordnete_fahrzeugliste;

	public Person(String vorname, String nachname, Fahrzeugliste zugeordnete_fahrzeugliste) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.zugeordnete_fahrzeugliste = zugeordnete_fahrzeugliste;

	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Fahrzeugliste getZugeordnete_fahrzeugliste() {
		return zugeordnete_fahrzeugliste;
	}

	public void setZugeordnete_fahrzeugliste(Fahrzeugliste zugeordnete_fahrzeugliste) {
		this.zugeordnete_fahrzeugliste = zugeordnete_fahrzeugliste;
	}

	public String toString() {
		return this.getClass().getSimpleName()+ ": "+this.getNachname()+", "+this.getVorname();
	}

}
