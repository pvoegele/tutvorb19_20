package de.hs_lu.o2s.tutorium.tut4.loesung;

public class Person {
	
	private String vorname, nachname;

	public Person(String vorname, String nachname) {
		this.nachname = nachname;
		this.vorname = vorname;
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
	
	public String toString() {
		return this.getNachname()+", "+this.getVorname();
	}
	
}
