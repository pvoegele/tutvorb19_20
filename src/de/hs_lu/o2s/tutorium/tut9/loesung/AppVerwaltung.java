package de.hs_lu.o2s.tutorium.tut9.loesung;

public class AppVerwaltung {

	public static void main(String[] args) {
		Veranstaltungs_Dozenten_Zuweisung<String, Veranstaltungsliste> Zuweisung = new Veranstaltungs_Dozenten_Zuweisung<String, Veranstaltungsliste>();
		Dozent doz1 = new Dozent("Peer", "Kueppers");
		Dozent doz2 = new Dozent("Dennis", "Messer");
		Dozent doz3 = new Dozent("Michaela", "Schneider");
		Dozent doz4 = new Dozent("Micaela","Belz");
		
		Veranstaltungsliste<Veranstaltung> VAL_dennis_messer = new Veranstaltungsliste<Veranstaltung>();
		Veranstaltungsliste<Veranstaltung> VAL_peer_kueppers = new Veranstaltungsliste<Veranstaltung>();
		Vorlesung prog2 = new Vorlesung("Programmieren 2","E1112","Montag","8:15 - 11:30");
		VAL_dennis_messer.add(prog2);
		VAL_peer_kueppers.add(prog2);
		
		Zuweisung.put(doz1.getNachname(), VAL_peer_kueppers);
		Zuweisung.put(doz2.getNachname(), VAL_dennis_messer);

		for(Object key : Zuweisung.keySet()) {
			System.out.println(key + " --> " + Zuweisung.get(key).toString());
		}
		
	}

	
	
}
