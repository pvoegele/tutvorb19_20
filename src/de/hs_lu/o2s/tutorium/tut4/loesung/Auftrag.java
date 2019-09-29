package de.hs_lu.o2s.tutorium.tut4.loesung;

public class Auftrag {

	private static double auftragsPauschale = 200.00;
	private int status;
	private double auftragsWert;
	private boolean aktiv;
	private Fahrzeug zugeordnetes_Fahrzeug;
	private Person auftraggeber;
	private String auftragsID;

	public Auftrag(Fahrzeug zugeordnetes_Fahrzeug, Person auftraggeber, String auftragfsID, double auftragsWert) {
		this.setAktiv(true);
		this.setStatus(1);
		this.auftragsID = auftragfsID;
		this.zugeordnetes_Fahrzeug = zugeordnetes_Fahrzeug;
		this.auftraggeber = auftraggeber;
		this.auftragsWert = auftragsWert;
	}

	public boolean pruefStatus(int status) {
		if (status <= 3) {
			if (status == 3) {
				this.setAktiv(false);
				return false;
			} else
				return true;
		} else
			System.out.println("Status kann nicht gesetzt werden, weil > 3");
		return false;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		if (this.pruefStatus(status)) {
			this.status = status;
		}
	}

	public static double getAuftragsPauschale() {
		return auftragsPauschale;
	}

	public static void setAuftragsPauschale(double auftragsPauschale) {
		Auftrag.auftragsPauschale = auftragsPauschale;
	}

	public double getAuftragsWert() {
		return auftragsWert;
	}

	public void setAuftragsWert(double auftragsWert) {
		this.auftragsWert = auftragsWert;
	}

	public String getAuftragsID() {
		return auftragsID;
	}

	public void setAuftragsID(String auftragsID) {
		this.auftragsID = auftragsID;
	}

	public boolean isAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public Fahrzeug getZugeordnetes_Fahrzeug() {
		return zugeordnetes_Fahrzeug;
	}

	public void setZugeordnetes_Fahrzeug(Fahrzeug zugeordnetes_Fahrzeug) {
		this.zugeordnetes_Fahrzeug = zugeordnetes_Fahrzeug;
	}

	public Person getAuftraggeber() {
		return auftraggeber;
	}

	public void setAuftraggeber(Person auftraggeber) {
		this.auftraggeber = auftraggeber;
	}

	public String toString() {
		return "ID: " + this.auftragsID + "\n" + "Besitzer: " + this.getZugeordnetes_Fahrzeug().getBesitzer().toString()
				+ "\n" + "Fahrzeug: " + this.getZugeordnetes_Fahrzeug().toString() + "\n";
	}
}
