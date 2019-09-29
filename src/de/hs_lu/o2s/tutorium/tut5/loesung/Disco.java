package de.hs_lu.o2s.tutorium.tut5.loesung;

public class Disco extends Gewerbe implements Bar,Comparable {

	String[] VerkaufteGetraenkeA = new String [0];
	int Spassfaktor;

	public boolean AddVerkauftesGetraenk(String Getraenk) {
		String[] copyA = new String[this.VerkaufteGetraenkeA.length + 1];
		copyA[0] = Getraenk;
		System.arraycopy(VerkaufteGetraenkeA, 0, copyA, 1, VerkaufteGetraenkeA.length);
		VerkaufteGetraenkeA = copyA;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Bar) {
			return this.getSpassfaktor() - ((Bar)o).getSpassfaktor();
		}
		System.out.println("Dieses Gewerbe hat keine Bar!");
		return -1;
	}

	@Override
	public int getSpassfaktor() {
		if(this.getAnzGaeste() == 0 && this.VerkaufteGetraenkeA.length > 0) {
			System.out.println("Das Personal betrinkt sich!");
			return -1;
		}
		this.Spassfaktor = this.getAnzGaeste()*this.VerkaufteGetraenkeA.length;
		return this.Spassfaktor;
	}


}
