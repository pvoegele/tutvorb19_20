package de.hs_lu.o2s.tutorium.tut8.loesung;

import java.util.HashSet;

public class Packung<E> extends HashSet<E> {

	int packungsgroesse;

	public Packung(int packungsgroesse) {
		this.packungsgroesse = packungsgroesse;
	}

	// Add-Methode bis Packung voll
	public void addInPackung(E e) throws ArtikelVorhandenException {
		if (this.CheckPackung()) {
			super.add(e);
		}
	}

	public boolean CheckPackung() {
		if (this.packungsgroesse > this.size()) {
			return true;
		} else System.out.println("Die Packung ist voll!");
		return false;
	}

	public String toString() {

		return "Packung";
	}
}
