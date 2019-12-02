package de.hs_lu.o2s.tutorium.plaetzchenBacken.uebung;

public class AppBacken {

	public static void main(String[] args) {

		Zutatenliste<Zutat> z1 = new Zutatenliste<Zutat>();
		z1.add(new Zutat("Mehl", 10));
		z1.add(new Zutat("Zucker", 5));
		z1.add(new Zutat("Vanillezucker", 2));
		
		Pl�tzchendose pd1 = new Pl�tzchendose();
		Pl�tzchen p1 = new Pl�tzchen(z1,"Vanillekipferl");
		Pl�tzchen p2 = new Pl�tzchen(z1,"Hildabr�tchen");
		
		pd1.Pl�tzchenBacken(10, p1);
		pd1.Pl�tzchenBacken(20, p2);
		pd1.Pl�tzchenBacken(10, p1);
	}

}
