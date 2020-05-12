package de.hs_lu.o2s.tutvorb;

public class Hund implements Rentenversicherung {

	public String rentenversicherungsnummer;
	
	public Hund(String rentenversicherungsnummer) {
		this.rentenversicherungsnummer = rentenversicherungsnummer;
	}
	
	@Override
	public String getRentenversicherung() {
		// TODO Auto-generated method stub
		return this.rentenversicherungsnummer;
	}

}
