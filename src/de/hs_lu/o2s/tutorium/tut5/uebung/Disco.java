package de.hs_lu.o2s.tutorium.tut5.uebung;

public class Disco extends Gewerbe{

	String[] VerkaufteGetraenkeA = new String [0];
	int Spassfaktor;

	public boolean AddVerkaufteGetraenk(String Getraenk) {
		String[] copyA = new String[this.VerkaufteGetraenkeA.length + 1];
		copyA[0] = Getraenk;
		System.arraycopy(VerkaufteGetraenkeA, 0, copyA, 1, VerkaufteGetraenkeA.length);
		VerkaufteGetraenkeA = copyA;
		return true;
	}


}
