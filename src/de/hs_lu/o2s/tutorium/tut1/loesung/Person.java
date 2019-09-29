package de.hs_lu.o2s.tutorium.tut1.loesung;

public class Person {

	String vorname, nachname, geburtstag;
	
	public Person(String vorname, String nachname, String geburtstag) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtstag = geburtstag;
	}
	
	public String toString() {
		return this.vorname+" "+this.nachname;
	}
}
