package de.hs_lu.o2s.nachhilfe.loesungProbeklausur;


// 4a


public class Maus {

	
	private PC angeschlossenAn;

	
	// 4b
	
	
	public PC getAngeschlossenAn() {
		return angeschlossenAn;
	}

	public void setAngeschlossenAn(PC angeschlossenAn) {
		this.angeschlossenAn = angeschlossenAn;
	}

	//4c
	
	public Maus(PC angeschlossenAn) {
		super();
		this.angeschlossenAn = angeschlossenAn;
	}
	
	
	public Maus() {
		this.angeschlossenAn = null;
	}
	

	public String toString() {
		if(this.angeschlossenAn == null) {
			return "Maus nicht angeschlossen.";
		} else {
			return "Maus angeschlossen an "+this.angeschlossenAn.toString();
		}
	}
	
	
	
	
}
