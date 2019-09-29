package de.hs_lu.o2s.tutorium.tut5.uebung;

public class Restaurant extends Gewerbe {

	String[] VerkaufteGetraenkeA = new String[0];
	String[] VerkaufteEssenA = new String[0];
	int Spassfaktor;

	public boolean AddVerkaufteGetraenk(String VerkauftesGetraenk) {
		String[] copyA = new String[this.VerkaufteGetraenkeA.length + 1];
		copyA[0] = VerkauftesGetraenk;
		System.arraycopy(VerkaufteGetraenkeA, 0, copyA, 1, VerkaufteGetraenkeA.length);
		VerkaufteGetraenkeA = copyA;
		return true;
	}

	public boolean AddVerkaufteEssen(String VerkaufteEssen) {
		String[] copyA = new String[this.VerkaufteEssenA.length + 1];
		copyA[0] = VerkaufteEssen;
		System.arraycopy(VerkaufteEssenA, 0, copyA, 1, VerkaufteEssenA.length);
		VerkaufteEssenA = copyA;
		return true;
	}

}
