package de.hs_lu.o2s.tutorium.plaetzchenBacken.uebung;

import java.util.HashSet;

public class Pl�tzchendose extends HashSet {

	public final static int maxAnzahl = 30;
	public int aktuelleAnz = 0;

	public boolean pruef(int Anzahl) {
		if (this.wieVielPlatzNoch() <= 0) {
			System.out.println("MaxAnzahl dieser Dose wurde �berschritten! Ich darf nicht backen! HAAAALT STOP!");
			return false;
		}
		System.out.println("Wir k�nnen backen! Yey, es ist noch Platz!");
		return true;

		
		
	}

	public int wieVielPlatzNoch() {
		return Pl�tzchendose.maxAnzahl - this.aktuelleAnz;
	}

	public void Pl�tzchenBacken(int Anzahl, Pl�tzchen pl�tzchen) {
		if (this.pruef(Anzahl)) {
			aktuelleAnz += Anzahl;
			int i = 0;
			while (i < Anzahl) {
				this.add(new Pl�tzchen(pl�tzchen.getZ1(), pl�tzchen.getName()));
				i++;
			}
		}
		System.out.println("Es ist noch Platz f�r " + this.wieVielPlatzNoch() + " Pl�tzchen.");
	}

	public void randomEat(int Anzahl) {
		for (int i = 0; i < Anzahl; i++) {
			this.randomEat();			
		}
	}

	public void randomEat() {
		for (Object o : this) {
			this.remove(o);
			break;
		}
	}
	
	@Override
	public boolean remove(Object o) {
		this.aktuelleAnz--;
		return super.remove(o);
	}
	
	
}
