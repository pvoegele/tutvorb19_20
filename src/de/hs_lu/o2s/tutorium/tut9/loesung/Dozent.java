package de.hs_lu.o2s.tutorium.tut9.loesung;

public class Dozent {

	private int ID;
	private String vorname, nachname;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public Dozent(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public Dozent(String vorname, String nachname, int ID) {
		this(vorname, nachname);
		this.ID = ID;		
	}
	
	
}
