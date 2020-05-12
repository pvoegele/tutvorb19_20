package de.hs_lu.o2s.nachhilfe.loesungProbeklausur;


//4a

public class PC {

	private int speicher;

	
	// 4b
	
	public int getSpeicher() {
		return speicher;
	}

	public void setSpeicher(int speicher) {
		this.speicher = speicher;
	}
	
	// 4c
	
	public PC(int speicher) {
		super();
		this.speicher = speicher;
	}

	
	public String toString() {
		return "PC mit Speicher "+this.getSpeicher();
	}
	
	
}
