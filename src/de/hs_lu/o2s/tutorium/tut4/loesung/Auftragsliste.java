package de.hs_lu.o2s.tutorium.tut4.loesung;

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

	// Entwickeln Sie eine Methode checkAktiv, die pr�ft, ob ein Auftrag in der Auftragsliste
	// inaktiv ist. Ist das der Fall, soll er entfernt werden.
	
	public Auftrag[] checkAktiv() {
		for (Auftrag pruefAuftrag : this.getAuftragsListe()) {
			if (!pruefAuftrag.isAktiv()) {
				this.delAuftrag(pruefAuftrag);
			}
		}
		return this.getAuftragsListe();
	}

	 // Entwickeln Sie eine Logik, die den Gesamtwert der Auftragsliste zur�ckgibt.

	public double berecheneGesamtwert() {
		double gesamtwert = 0.00;
		int counter = 0;
		for (Auftrag a : this.getAuftragsListe()) {
			gesamtwert += a.getAuftragsWert();
			counter++;
		}
		return gesamtwert + ((double) counter) * Auftrag.getAuftragsPauschale();
	}

	/**
	 * F�gt einen Auftrag der Auftragsliste hinzu und gibt einen boolean zur�ck, ob
	 * das Hinzuf�gen funktioniert.
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
	 * L�scht einen Auftrag aus der Auftragsliste und gibt einen boolean zur�ck, ob
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
			} counter ++;
		}
		return false;

	}

	public String toString() {
		String retString = "Folgende Auftr�ge befinden sich in der Auftragsliste:\n";
		for (Auftrag a : this.getAuftragsListe()) {
			retString += a.toString() + "\n";
		}
		retString += "Die Auftragsliste hat einen Gesamtwert von: " + this.berecheneGesamtwert();

		return retString;
	}
}
