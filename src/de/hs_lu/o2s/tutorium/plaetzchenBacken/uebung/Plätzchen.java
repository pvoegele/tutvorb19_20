package de.hs_lu.o2s.tutorium.plaetzchenBacken.uebung;

public class Plätzchen {
	
	Zutatenliste<Zutat> z1;
	String name;
	public Zutatenliste<Zutat> getZ1() {
		return z1;
	}
	public void setZ1(Zutatenliste<Zutat> z1) {
		this.z1 = z1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Plätzchen(Zutatenliste<Zutat> z1, String name) {
		super();
		this.z1 = z1;
		this.name = name;
	}
	
	

}
