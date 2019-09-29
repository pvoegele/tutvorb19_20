package de.hs_lu.o2s.tutorium.tut1.loesung;

public class Auto {

	String kennzeichen;
	double tankinhalt, verbrauch, kilometerstand;
	Person besitzer;

	public Auto() {
		System.out.println("Achtung, es handelt sich um einen Standardkonstruktur!");

	}

	// Erster Konstruktor
	public Auto(double tankinhalt, double verbrauch, double kilometerstand) {
		this.tankinhalt = tankinhalt;
		this.verbrauch = verbrauch;
		this.kilometerstand = kilometerstand;

	}

	public Auto(String kennzeichen, double tankinhalt, double verbrauch, 
			double kilometerstand, Person besitzer) {
		this(tankinhalt, verbrauch, kilometerstand); // Wird auf den ersten Konstruktor zugegriffen
		this.besitzer = besitzer;
		this.kennzeichen = kennzeichen;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public double getTankinhalt() {
		return tankinhalt;
	}

	public void setTankinhalt(double tankinhalt) {
		this.tankinhalt = tankinhalt;
	}

	public double getVerbrauch() {
		return verbrauch;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public double getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(double kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public Person getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(Person besitzer) {
		this.besitzer = besitzer;
	}
	
	public String toString() {
		String retString = "Kilometerstand:"+this.getKilometerstand()+"\n"+
				"Verbrauch:"+this.getVerbrauch()+" / 100km\n";
		
		if(this.getBesitzer() == null || this.getKennzeichen() == null) {
			retString += "Achtung, Auto ist nicht zugelassen.";
		} else {
			retString += "Kennzeichen: "+this.getKennzeichen()+"\n"
					+"Besitzer: "+this.getBesitzer();
		}
		return retString;
	}

}