package de.hs_lu.o2s.tutorium.tut3.loesung;

public class Fahrzeugliste {

	Fahrzeug[] fahrzeugList;

	public Fahrzeugliste() {
		this.fahrzeugList = new Fahrzeug[0];
	}
/**
	public boolean addFahrzeug(Fahrzeug f) {

		Fahrzeug[] copyFL = new Fahrzeug[this.getFahrzeugL().length + 1];
		System.arraycopy(this.getFahrzeugL(), 0, copyFL, 0, this.getFahrzeugL().length);
		copyFL[this.getFahrzeugL().length] = f;
		this.setFahrzeugL(copyFL);
		System.out.println("Folgendes Fahrzeug wurde der Fahrzeugliste hinzugefügt: " + f.toString());
		return true;
	}*/
	
	
	
	
	public boolean  addFahrzeug(Fahrzeug f) {
		Fahrzeug [] copyFL = new Fahrzeug[this.getFahrzeugL().length + 1];
		System.arraycopy(this.getFahrzeugL(), 0 , copyFL, 0, this.getFahrzeugL().length);
		copyFL[this.getFahrzeugL().length] = f;
		System.out.println("Folgendes Fahrzeug wurde der Fahrzeugliste hinzugefügt: "+f.toString());
		return true;
				
				
	}
	
	
	
	public boolean addFahrzeug(Fahrzeugliste fL) {
		for (Fahrzeug f : fL.getFahrzeugL()) {
			this.addFahrzeug(f);
		}
		return true;
	}

	public boolean delFahrzeug(int pos) {
		if (pos <= this.getFahrzeugL().length - 1) { //
			Fahrzeug merker = this.getFahrzeugL()[pos];
			Fahrzeug[] flcopy = new Fahrzeug[this.getFahrzeugL().length - 1];
			System.arraycopy(this.getFahrzeugL(), 0, flcopy, 0, pos);
			System.arraycopy(this.getFahrzeugL(), pos + 1, flcopy, pos, flcopy.length - pos);
			System.out.println("Folgendes Fahrzeug wurde aus der Fahrzeugliste entfernt: " + merker);
			this.setFahrzeugL(flcopy);
			return true;
		}
		return false;
	}

	public boolean delFahrzeug(Fahrzeug uebergabe_fahrzeug) {
		int counter = 0;
		for (Fahrzeug f : this.getFahrzeugL()) {
			if (f.equals(uebergabe_fahrzeug)) {
				this.delFahrzeug(counter);
				return true;
			}
			counter++;
		}
		return false;
	}

	private boolean checkPKW() {
		for (Fahrzeug f : this.getFahrzeugL()) {
			if (f instanceof PKW)
				return true;
		}
		return false;
	}

	public boolean delPKW_All() {
		if (this.checkPKW()) {
			for (Fahrzeug f : this.getFahrzeugL()) {
				if (f instanceof PKW) {
					this.delFahrzeug(f);
				}
			}
			return true;
		} else
			return false;
	}

	public String toString() {
		String retString = "";
		for (Fahrzeug f : fahrzeugList) {
			retString += f.toString() + "\n";
		}
		return retString;
	}

	public Fahrzeug[] getFahrzeugL() {
		return fahrzeugList;
	}

	public void setFahrzeugL(Fahrzeug[] fahrzeugL) {
		this.fahrzeugList = fahrzeugL;
	}

}
