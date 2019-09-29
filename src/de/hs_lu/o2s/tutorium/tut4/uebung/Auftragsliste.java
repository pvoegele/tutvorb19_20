package de.hs_lu.o2s.tutorium.tut4.uebung;

public class Auftragsliste {

	private Auftrag[] auftragsListe;

	public Auftrag[] getAuftragsListe() {
		return auftragsListe;
	}

	public void setAuftragsListe(Auftrag[] auftragsListe) {
		this.auftragsListe = auftragsListe;
	}

	public Auftragsliste() {
		this.auftragsListe = new Auftrag[0];

	}

	public Auftragsliste(Auftrag[] auftragsListe) {
		this.auftragsListe = auftragsListe;
	}


	
	public Auftrag[] checkAktiv() {
		return this.getAuftragsListe();
	}


	public double berecheneGesamtwert() {
		return 0.00;
		}

	/**
	 * Fügt einen Auftrag der Auftragsliste hinzu und gibt einen boolean zurück, ob
	 * das Hinzufügen funktioniert.
	 * 
	 * @param hinzuf_Auftrag
	 * @return
	 */
	public boolean addAuftrag(Auftrag hinzuf_Auftrag) {

		if (hinzuf_Auftrag.isAktiv()) {
			Auftrag[] copyAL = new Auftrag[this.getAuftragsListe().length + 1];
			System.arraycopy(this.auftragsListe, 0, copyAL, 0, this.getAuftragsListe().length);
			copyAL[copyAL.length - 1] = hinzuf_Auftrag;
			this.setAuftragsListe(copyAL);
			return true;
		}
		return false;
	}

	/**
	 * Löscht einen Auftrag aus der Auftragsliste und gibt einen boolean zurück, ob
	 * das Entfernen funktioniert.
	 * 
	 * @param loesch_Auftrag
	 * @return
	 */
	public boolean delAuftrag(Auftrag loesch_Auftrag) {
		int counter = 0;
		for (Auftrag a : this.getAuftragsListe()) {
			if (a.equals(loesch_Auftrag) || a == loesch_Auftrag) {
				Auftrag[] copyAL = new Auftrag[this.getAuftragsListe().length - 1];
				System.arraycopy(this.getAuftragsListe(), 0, copyAL, 0, counter);
				System.arraycopy(this.getAuftragsListe(), counter + 1, copyAL, counter, copyAL.length);
				this.setAuftragsListe(copyAL);

				return true;
			}
		}
		return false;

	}

	public String toString() {
		String retString = "Folgende Aufträge befinden sich in der Auftragsliste:\n";
		for (Auftrag a : this.getAuftragsListe()) {
			retString += a.toString() + "\n";
		}
		retString += "Die Auftragsliste hat einen Gesamtwert von: " + this.berecheneGesamtwert();

		return retString;
	}
}
