package de.hs_lu.o2s.tutorium.tut8.uebung;

import java.util.HashSet;

public class Packung<E> extends HashSet<E> {

	int packungsgroesse;

	public Packung(int packungsgroesse) {
		this.packungsgroesse = packungsgroesse;
	}

	// Add-Methode bis Packung voll
	public void addInPackung(E e) {

	}

	public String toString() {
		
		return "Packung";
	}
}
