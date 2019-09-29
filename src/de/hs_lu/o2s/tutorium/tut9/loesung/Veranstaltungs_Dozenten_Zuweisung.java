package de.hs_lu.o2s.tutorium.tut9.loesung;

import java.util.HashMap;

public class Veranstaltungs_Dozenten_Zuweisung<String, Veranstaltungsliste>
		extends HashMap<String, Veranstaltungsliste> {

	public Veranstaltungs_Dozenten_Zuweisung() {

	}

	@Override
	public Veranstaltungsliste put(String key, Veranstaltungsliste value) {
		if (!this.containsKey(key)) {
			return super.put(key, value);

		} else
			return null;
	}
}
