package de.hs_lu.o2s.tutorium.tut1.loesung;

public class AdressenListe {

	String[] strassenA = {"Aachener Straße" , "Berliner Straße" , "Chemnitzer Straße"};
	String[] hnrA = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
	
	Adresse[][] adressenAA;
	
	public AdressenListe() {
		
		for (int i = 0; i < strassenA.length; i++) {
			for (int j = 0; j < hnrA.length; j++) {
				this.adressenAA[i][j] = new Adresse(this.strassenA[i], this.hnrA[j]);
				
			}
		}
	}
	
	
	

}
