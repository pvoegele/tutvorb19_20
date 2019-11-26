package de.hs_lu.o2s.tutorium.tut7.uebung;

import java.util.ArrayList;

public class BesitzerList extends ArrayList {

	public BesitzerList() {

	}

	public boolean pruefBesitzerVorAdd(Object o) {
		return (o instanceof Person && ((Person) o).isFahrberechtigt() && !this.contains(o));
	}

}
