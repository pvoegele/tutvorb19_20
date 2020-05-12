package de.hs_lu.o2s.tutvorb;

public class Person implements Rentenversicherung, Comparable {
	
	public String Rentenversicherungsnummer;
	
	public Person(String Rentenversicherungsnummer) {
		this.Rentenversicherungsnummer = Rentenversicherungsnummer;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Rentenversicherung) {
			System.out.println("o is instance of Rentenversicherung");
			String myRentenversicherung = this.getRentenversicherung();
			String oRentenversicherung = ((Person)o).getRentenversicherung();
			// myValue ist entweder >, < oder =
			int myValue = this.getRentenversicherung().compareTo(((Person)o).getRentenversicherung());
			System.out.println(myRentenversicherung);
			System.out.println(oRentenversicherung);
			return myValue;
		}
		else {
			System.out.println("o is not an instance of Rentenversicherung");
			return -1;
		}
		
	}

	@Override
	public String getRentenversicherung() {
		// TODO Auto-generated method stub
		return this.Rentenversicherungsnummer;
	}
	
	

}
