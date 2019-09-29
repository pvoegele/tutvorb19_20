package de.hs_lu.o2s.tutorium.tut7.loesung;

import java.util.ArrayList;

public class BesitzerList extends ArrayList {

	public BesitzerList() {
		super();
	}

	/**
	 * Prüfung, ob ein Objekt eine Person ist, ob diese fahrberechtigt ist und bereits in der Arraylist bereits vorhanden ist.
	 * @param o
	 * @return
	 */
	
	public boolean pruefBesitzerVorAdd(Object o) {
		return (o instanceof Person && ((Person) o).isFahrberechtigt() && !this.contains(o));
	}

	/**
	 * Ein Objekt darf erst nach Prüfung von pruefBesitzerVorAdd zur Besitzerliste hinzugefügt werden.
	 */
	public boolean add(Object o) {
		if(pruefBesitzerVorAdd(o)) {
			return super.add(o);
		} return false;
	}

	
	/**
	 *  Die gesamte Liste darf nur hinzugefügt werden, wenn alle Besitzer fahrberechtigt sind, ansonsten wird niemand eingefügt.
	 * @param BList
	 * @return
	 */
	public boolean add(BesitzerList BList) {
		boolean retBool = true; //LUL retBool.equals("Redbull") 
		for (Object o : this) {
			//Wenn der Besitzer eine der Kriterien in pruefBesitzerVorAdd nicht erfüllt,
			//wird retBool false gesetzt.
			if (!pruefBesitzerVorAdd(o)) {
				return retBool = false;
			}
		} return super.add(BList);
	}

	
	/**
	 * Wenn ein Besitzer seine Fahrerlaubnis verloren hat, dann soll er aus der Besitzerliste entfernt werden.
	 * @return
	 */
	public String checkFahrerlaubnisDerBesitzer() {
		String myString = "Folgende Besitzer wurden aus der Besitzerliste entfernt:";
		int vergleichInt = this.size();
		for (Object o : this) {
			if (o instanceof Person) {
				Person pruefPers = (Person) o;
				if (!(pruefPers.isFahrberechtigt())) {
					myString += pruefPers.toString() + "\n";
					this.remove(pruefPers);
				}
			}
		}
		if (this.size() == vergleichInt) {
			return "Es wurde niemand entfernt.";
		}
		return myString;
	}
	
	
//	if(myString == "Folgende Besitzer wurden aus der Besitzerliste entfernt:\n") {
//		return "Es wurde niemand entfernt";
//	} else return myString;
	
	
}
