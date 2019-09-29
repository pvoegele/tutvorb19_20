package de.hs_lu.o2s.tutorium.tut5.loesung;

public class Restaurant extends Gewerbe implements Bar, Comparable {

	String[] VerkaufteGetraenkeA = new String[0];
	String[] VerkaufteEssenA = new String[0];
	int Spassfaktor;

	public boolean AddVerkauftesGetraenk(String VerkauftesGetraenk) {
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

	@Override
	public int getSpassfaktor() {
		if (this.getAnzGaeste() == 0 && this.VerkaufteGetraenkeA.length > 0) {
			System.out.println("Das Personal des Restaurants betrinkt sich!");
			return -1;
		}
		this.Spassfaktor = this.getAnzGaeste() * (this.VerkaufteGetraenkeA.length + this.VerkaufteEssenA.length);
		return this.Spassfaktor;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Bar) {
			return this.getSpassfaktor() - ((Bar)o).getSpassfaktor();
		}
		System.out.println("Dieses Gewerbe hat keine Bar!");
		return -1;
	}

}
