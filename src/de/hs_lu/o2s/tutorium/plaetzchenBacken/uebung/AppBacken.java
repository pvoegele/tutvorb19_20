package de.hs_lu.o2s.tutorium.plaetzchenBacken.uebung;

public class AppBacken {

	public static void main(String[] args) {

		Zutatenliste<Zutat> z1 = new Zutatenliste<Zutat>();
		z1.add(new Zutat("Mehl", 10));
		z1.add(new Zutat("Zucker", 5));
		z1.add(new Zutat("Vanillezucker", 2));
		
		Plätzchendose pd1 = new Plätzchendose();
		Plätzchen p1 = new Plätzchen(z1,"Vanillekipferl");
		Plätzchen p2 = new Plätzchen(z1,"Hildabrötchen");
		
		pd1.PlätzchenBacken(10, p1);
		pd1.PlätzchenBacken(20, p2);
		pd1.PlätzchenBacken(10, p1);
	}

}
