package de.hs_lu.o2s.tutorium.plaetzchenBacken.uebung;

import java.util.HashSet;

public class Plätzchendose extends HashSet {

	public final static int maxAnzahl = 30;
	public int aktuelleAnz = 0;

	public boolean pruef(int Anzahl) {
		if (this.wieVielPlatzNoch() <= 0) {
			System.out.println("MaxAnzahl dieser Dose wurde überschritten! Ich darf nicht backen! HAAAALT STOP!");
			return false;
		}
		System.out.println("Wir können backen! Yey, es ist noch Platz!");
		return true;

		
		
	}

	public int wieVielPlatzNoch() {
		return Plätzchendose.maxAnzahl - this.aktuelleAnz;
	}

	public void PlätzchenBacken(int Anzahl, Plätzchen plätzchen) {
		if (this.pruef(Anzahl)) {
			aktuelleAnz += Anzahl;
			int i = 0;
			while (i < Anzahl) {
				this.add(new Plätzchen(plätzchen.getZ1(), plätzchen.getName()));
				i++;
			}
		}
		System.out.println("Es ist noch Platz für " + this.wieVielPlatzNoch() + " Plätzchen.");
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
